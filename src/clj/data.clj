(ns framed.clj.data
  (:require [clojure.data.json :as json]
            [clojure.string :as s]
            [clojure.walk :as walk])
  (:import java.nio.charset.StandardCharsets)
  (:import org.apache.commons.lang3.StringEscapeUtils))


(def kun-framed-regex #"Framed #(\d+)\n🎥 ([🟥🟩⬛ ]+)\n")

(defn username [s]
  (first (s/split s #" ")))

(defn score->number [score]
  (count (re-seq #"🟥" score)))

(defn distill-msg [{:keys [content sender_name]}]
  (if-let [[content nr score] (and content (re-find kun-framed-regex content))]
    {:type :framed
     :nr (Integer/parseInt nr)
     :score (score->number score)
     :user (username sender_name)}
    {:type :not-framed
     :user (username sender_name)}))

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
  (write-clj-file "src/cljs/framed/messages.cljs" (read-data "resources/message_1.json")))
