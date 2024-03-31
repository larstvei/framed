(ns framed.data
  (:require [clojure.data.json :as json]
            [clojure.string :as s]
            [clojure.walk :as walk])
  (:import java.nio.charset.StandardCharsets)
  (:import org.apache.commons.lang3.StringEscapeUtils))


(def kun-framed-eller-episode-regex #"(Framed|Episode) #(\d+)\n(🎥|📺) ([🟥🟩⬛ ]+)")

(defn username [s]
  (first (s/split s #" ")))

(defn score->number [score]
  (count (re-seq #"🟥" score)))

(defn distill-msg [{:keys [content sender_name timestamp_ms]}]
  (if-let [[content type nr sym score]
           (and content (re-find kun-framed-eller-episode-regex content))]
    {:type (case type "Framed" :framed "Episode" :episode)
     :nr (Integer/parseInt nr)
     :score (score->number score)
     :user (username sender_name)
     :timestamp_ms timestamp_ms}
    {:type :not-framed :user (username sender_name)}))

;; This is awful, but not my fault https://stackoverflow.com/questions/50008296/facebook-json-badly-encoded
(defn bad-decode [s]
  (-> (StringEscapeUtils/unescapeJava s)
      (.getBytes StandardCharsets/ISO_8859_1)
      (String. StandardCharsets/UTF_8)))

(defn read-data [infile]
  (->> (slurp infile)
       (json/read-str)
       (walk/keywordize-keys)
       (walk/prewalk (fn [x] (if (string? x) (bad-decode x) x)))
       :messages
       (mapv distill-msg)))

(defn write-clj-file [outfile data]
  (spit outfile
        (str "(ns framed.messages)\n\n(def messages \n"
             (with-out-str (clojure.pprint/pprint data))
             ")\n")))

(defn -main [& args]
  (->> ["resources/message_1.json" "resources/message_2.json"]
       (mapcat read-data)
       (vec)
       (write-clj-file "src/cljs/framed/messages.cljs")))

(comment
  (-main)
  )
