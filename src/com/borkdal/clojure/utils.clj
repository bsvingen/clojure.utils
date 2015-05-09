(ns com.borkdal.clojure.utils
  (:require [clojure.string :as string]))

(defn non-empty-string?
  [string]
  (and
   (string? string)
   (not (string/blank? string))))

(defn substring?
  [substring
   string]
  {:pre [(string? substring)
         (string? string)]}
  (.contains string substring))

(defn to-int
  [string]
  {:pre [(string? string)]}
  (Integer. string))

(def not-nil? (complement nil?))

(defn spaced-str
  [& rest]
  (string/join " "
               (map str
                    (filter not-nil? rest))))

(defmacro when-seq-let
  [[var expression] & body]
  `(when-let [~var ~expression]
     (when (seq ~var)
       ~@body)))

(defn only
  [coll]
  {:pre [(or (nil? coll)
             (and (sequential? coll)))
         (>= 1 (count coll))]}
  (first coll))

