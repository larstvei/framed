(ns ^:figwheel-hooks framed.core
  (:require [replicant.dom :as r]
            [framed.messages :refer [messages]]
            [clojure.string :as s]))

(defn framed? [msg]
  (= (:type msg) :framed))

(defn episode? [msg]
  (= (:type msg) :episode))

(defn ikke-framed? [msg]
  (not (or (framed? msg) (episode? msg))))

(def color-wrong "#aa3123")
(def color-correct "#42936a")
(def color-neutral "#67748a")

(def max-tries {:framed 6 :episode 10})
(def type-pred {:framed framed? :episode episode?})

(defonce state (atom {:type :framed}))

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
     [:td {:style {:text-align "center"}}
      (f user posts)])])

(defn svg-cumulative-average-score [avgs type]
  (let [tries (max-tries type)
        size (* 1.2 tries)
        n (count avgs)]
    [:svg {:width (em size) :height (em 6)}
     (for [[i avg] (map-indexed vector avgs)]
       [:g
        [:line {:x1 (em (* (/ (+ i 0.5) n) size)) :y1 (em 0)
                :x2 (em (* (/ (+ i 0.5) n) size)) :y2 (em avg)
                :stroke color-wrong
                :stroke-width (em (* (/ 1 (+ 2 n)) size))}]
        [:line {:x1 (em (* (/ (+ i 0.5) n) size)) :y1 (em avg)
                :x2 (em (* (/ (+ i 0.5) n) size)) :y2 (em 6)
                :stroke color-correct
                :stroke-width (em (* (/ 1 (+ 2 n)) size))}]])]))

(defn svg-score [score type]
  (let [tries (max-tries type)
        width (* 1.2 tries)]
    [:svg {:style {:vertical-align "baseline"}
           :width (em width) :height (em 1)}
     (for [i (range (int score))]
       (box (* i 1.2) 0 color-wrong))
     (when (< score tries)
       (box (* score 1.2) 0 color-correct))
     (for [i (range (dec (- tries (int score))))]
       (box (* (+ score i 1) 1.2) 0 color-neutral))]))

(defn framed-posts [_user posts]
  (count (filter framed? posts)))

(defn episode-posts [_user posts]
  (count (filter episode? posts)))

(defn ikke-framed-posts [_user posts]
  (count (filter ikke-framed? posts)))

(defn user-average [_user posts]
  (if-let [avgs (seq (cumulative-averages posts))]
    (.toFixed (last avgs) 2)
    "—"))

(defn user-cumulative-average [_user posts]
  (svg-cumulative-average-score (cumulative-averages posts) (:type (first posts))))

(defn header-row [users]
  [:tr [:th] (for [user (keys users)] [:th user])])

(defn framed-row [users]
  (table-row users "framed" framed-posts))

(defn episode-row [users]
  (table-row users "episode" episode-posts))

(defn ikke-framed-row [users]
  (table-row users "ikke framed" ikke-framed-posts))

(defn average-row [users]
  (table-row users "average" user-average))

(defn cumulative-average-row [users]
  (table-row users "development" user-cumulative-average))

(defn user-median [_user posts]
  (let [scores (keep :score posts)]
    (if (empty? scores)
      "—"
      (let [n (count scores)
            median (nth (sort scores) (quot n 2))]
        (svg-score median (:type (first posts)))))))

(defn median-row [users]
  (table-row users "median" user-median))

(defn score-row [nr frame users]
  [:tr [:td nr]
   (for [user (keys users)
         :let [msg (last (filter #(= user (:user %)) frame))]]
     [:td {:style {:text-align "center"}}
      (if-let [score (:score msg)]
        (svg-score score (:type msg))
        "—")])])

(defn general-stats [msgs]
  (let [users (into (sorted-map) (group-by :user msgs))]
    (list
     (header-row users)
     (framed-row users)
     (episode-row users)
     (ikke-framed-row users))))

(defn performance-stats-rows [msgs users]
  (let [selected-users (into (reduce #(assoc %1 %2 []) users (keys users))
                             (group-by :user msgs))
        selected-rows (into (sorted-map) (group-by :nr msgs))]
    (list
     (cumulative-average-row selected-users)
     (median-row selected-users)
     (average-row selected-users)
     (for [[nr row] (reverse selected-rows)]
       (score-row nr row selected-users)))))

(defn get-year-and-month [timestamp_ms]
  (let [date (js/Date. timestamp_ms)
        options #js{:year "numeric" :month "long" :timeZone "Europe/Oslo"}]
    (.toLocaleString date "en-US" options)))

(defn add-month [msg]
  (assoc msg :month (get-year-and-month (:timestamp_ms msg))))

(defn performance-stats [msgs type]
  (let [msgs (filter (type-pred type) messages)
        users (into (sorted-map) (group-by :user messages))
        selected-users (into (sorted-map) (group-by :user msgs))
        sorted-msgs (sort-by :timestamp_ms > (map add-month msgs))
        months (remove empty? (partition-by :month sorted-msgs))]
    (concat
     [[:tr [:td {:colspan (inc (count users))
                 :style {:text-align "center"}}
            [:h2 "All time"]]]
      (cumulative-average-row selected-users)
      (median-row selected-users)
      (average-row selected-users)]
     (mapcat (fn [part]
               (into [[:tr [:td {:colspan (inc (count users))
                                 :style {:text-align "center"}}
                            [:h2 (:month (first part))]]]]
                     (performance-stats-rows part users)))
             months))))

(defn toggle-button [button-type type]
  [:button.btn {:class (if (= button-type type) :toggled :untoggled)
                :on {:click [{:type button-type}]}}
   (name button-type)])

(defn page [{:keys [type]}]
  [:div {:style {:margin "auto"
                 :display "flex"
                 :flex-wrap "wrap"
                 :justify-content "center"
                 :align-items "center"}}
   [:h1 "kun framed. for realsies this time. episodes also."]
   [:div {:style {:flex-basis "100%" :height "2em"}}]
   (toggle-button :framed type)
   (toggle-button :episode type)
   [:div {:key type :style {:flex-basis "100%" :height "2em"}}]
   (reduce into [:table]
           (list (general-stats messages)
                 (performance-stats messages type)))])

(defn render [state]
  (r/render (document.getElementById "app") (page state)))

(r/set-dispatch!
 (fn [e actions]
   (doseq [action actions]
     (swap! state assoc :type (:type action)))
   (render @state)))

(render @state)
