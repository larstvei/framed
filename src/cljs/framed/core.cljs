(ns ^:figwheel-hooks framed.core
  (:require [dumdom.core :as dd :refer [defcomponent]]
            [framed.messages :refer [messages]]
            [clojure.string :as s]))

(defn framed? [msg]
  (= (:type msg) :framed))

(defn average [posts]
  (let [scores (filter identity (map :score posts))]
    (-> (reduce + scores)
        (/ (count scores))
        (.toFixed 2))))

(defcomponent svg-avg-score [score]
  [:svg {:width (str (* 1.2 6) "em") :height "1em"}
   (for [i (range (int score))]
     [:rect {:x (str (* i 1.2) "em") :y "0em" :width "1em" :height "1em" :fill "#aa3123"}])
   [:rect {:x (str (* (int score) 1.2) "em") :y "0em"
           :width (str (- score (int score)) "em")
           :height "1em" :fill "#aa3123"}]])

(defcomponent svg-score [score]
  [:svg {:width (str (* 1.2 6) "em") :height "1em"}
   (for [i (range (int score))]
     [:rect {:x (str (* i 1.2) "em") :y "0em" :width "1em" :height "1em" :fill "#aa3123"}])
   (when (< score 6)
     [:rect {:x (str (* score 1.2) "em") :y "0em" :width "1em" :height "1em" :fill "#42936a"}])
   (for [i (range (dec (- 6 (int score))))]
     [:rect {:x (str (* (+ score i 1) 1.2) "em") :y "0em" :width "1em" :height "1em" :fill "#67748a"}])])

(defcomponent basic-stats [msgs]
  [:div
   [:p "Vi har postet " (count msgs) " meldinger, hvor "
    (count (filter framed? msgs)) " er kun framed."]])

(defcomponent header-row [users]
  [:tr [:th] (for [user (keys users)] [:th {:style {:padding-bottom "1em"}} user])])

(defcomponent framed-row [users]
  [:tr [:td "framed"]
   (for [[user posts] users]
     [:td  {:style {:text-align :center
                    :padding-bottom "1em"}}
      (count (filter framed? posts))])])

(defcomponent ikke-framed-row [users]
  [:tr [:td "ikke framed"]
   (for [[user posts] users]
     [:td {:style {:text-align :center :padding-bottom "1em"}}
      (count (filter (complement framed?)
                     posts))])])

(defcomponent average-row [users]
  [:tr [:td "average"]
   (for [[user posts] users]
     [:td {:style {:text-align :center}}
      [:div {:style {:padding-bottom "3pt"}} (average posts)]
      [:div [svg-avg-score (average posts)]]])])

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
     {:style {:margin "1em"}}
     [header-row users]
     [framed-row users]
     [ikke-framed-row users]
     [average-row users]
     [:tr [:td {:colspan (inc (count users))} [:hr]]]
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
