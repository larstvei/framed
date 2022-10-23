(ns ^:figwheel-hooks framed.core
  (:require [dumdom.core :as dd :refer [defcomponent]]
            [framed.messages :refer [messages]]
            [clojure.string :as s]))

(def color-wrong "#aa3123")
(def color-correct "#42936a")
(def color-neutral "#67748a")

(defn framed? [msg]
  (= (:type msg) :framed))

(defn cumulative-averages [posts]
  (let [scores (keep :score (sort-by :nr posts))]
    (-> (fn [avg [n score]]
          (if score
            (/ (+ score (* n avg)) (inc n))
            avg))
        (reductions 0 (map-indexed vector scores))
        rest)))

(defn em [x]
  (str x "em"))

(defn box [x y color]
  [:rect {:x (em x) :y (em y)
          :width (em 1) :height (em 1)
          :fill color}])

(defn table-row [users title f]
  [:tr [:td {:style {:width "6em" :height "2em"}} title]
   (for [[user posts] users]
     [:td {:style {:text-align :center}}
      (f user posts)])])

(defcomponent basic-stats [msgs]
  [:div
   [:p "Vi har postet " (count msgs) " meldinger, hvor "
    (count (filter framed? msgs)) " er kun framed."]])

(defcomponent svg-cumulative-average-score [avgs]
  (let [size (* 1.2 6)
        n (count avgs)]
    [:svg {:width (em size) :height (em 6)}
     (for [[i avg] (map-indexed vector avgs)]
       [:g
        [:line {:x1 (em (* (/ i n) size)) :y1 (em 0)
                :x2 (em (* (/ i n) size)) :y2 (em avg)
                :stroke color-wrong}]
        [:line {:x1 (em (* (/ i n) size)) :y1 (em avg)
                :x2 (em (* (/ i n) size)) :y2 (em 6)
                :stroke color-correct}]])]))

(defcomponent svg-score [score]
  (let [width (* 1.2 6)]
    [:svg {:style {:vertical-align :baseline}
           :width (em width) :height (em 1)}
     (for [i (range (int score))]
       (box (* i 1.2) 0 color-wrong))
     (when (< score 6)
       (box (* score 1.2) 0 color-correct))
     (for [i (range (dec (- 6 (int score))))]
       (box (* (+ score i 1) 1.2) 0 color-neutral))]))

(defn framed-posts [_user posts]
  (count (filter framed? posts)))

(defn ikke-framed-posts [_user posts]
  (count (filter (complement framed?) posts)))

(defn user-average [_user posts]
  (.toFixed (last (cumulative-averages posts)) 2))

(defn user-cumulative-average [_user posts]
  [svg-cumulative-average-score (cumulative-averages posts)])

(defcomponent header-row [users]
  [:tr [:th] (for [user (keys users)] [:th user])])

(defcomponent framed-row [users]
  (table-row users "framed" framed-posts))

(defcomponent ikke-framed-row [users]
  (table-row users "ikke framed" ikke-framed-posts))

(defcomponent average-row [users]
  (table-row users "average" user-average))

(defcomponent cumulative-average-row [users]
  (table-row users "development" user-cumulative-average))

(defn user-median [_user posts]
  (let [scores (keep :score posts)
        n (count scores)
        median (nth (sort scores) (quot n 2))]
    (svg-score median)))

(defcomponent median-row [users]
  (table-row users "median" user-median))

(defcomponent score-row [nr frame users]
  [:tr [:td nr]
   (for [user (keys users)
         :let [msg (last (filter #(= user (:user %)) frame))]]
     [:td {:style {:text-align :center}}
      (if-let [score (:score msg)]
        [svg-score score]
        "—")])])

(defcomponent history [msgs]
  (let [users (into (sorted-map) (group-by :user msgs))
        frames (dissoc (into (sorted-map) (group-by :nr msgs)) nil)]
    [:table
     [header-row users]
     [framed-row users]
     [ikke-framed-row users]
     [:tr {:style {:height "2em"}} [:td {:colspan (inc (count users))} [:hr]]]
     [cumulative-average-row users]
     [median-row users]
     [average-row users]
     [:tr {:style {:height "2em"}} [:td {:colspan (inc (count users))} [:hr]]]
     (for [[nr frame] (reverse frames)]
       ^{:key nr} [score-row nr frame users])]))

(defcomponent page [msgs]
  [:div {:style {:margin "auto"
                 :display "flex"
                 :flex-wrap "wrap"
                 :justify-content "center"
                 :align-items "center"}}
   [:h1 "kun framed. for realsies this time."]
   [:div {:style {:flex-basis "100%" :height "1ch"}}]
   [basic-stats msgs]
   [:div {:style {:flex-basis "100%" :height "1ch"}}]
   [history msgs]])

(defn render [data]
  (dd/render [page data] (document.getElementById "app")))

(render messages)
