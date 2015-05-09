(ns com.borkdal.clojure.utils-test
  (:require [com.borkdal.clojure.utils :refer :all]
            [midje.sweet :refer :all]))

(facts "non-empty-string?"
  (non-empty-string? 7) => false
  (non-empty-string? nil) => false
  (non-empty-string? "") => false
  (non-empty-string? " ") => false
  (non-empty-string? "\t") => false
  (non-empty-string? "yes") => true
  (non-empty-string? "123") => true)

(facts "substring?"
  (fact "prefix"
    (substring? "abc" "abcdef") => true)
  (fact "suffix"
    (substring? "def" "abcdef") => true)
  (fact "middle"
    (substring? "cd" "abcdef") => true)
  (fact "nope"
    (substring? "xxx" "abcdef") => false)
  (fact "nil - fail"
    (substring? nil "abcdef") => (throws java.lang.AssertionError))
  (fact "number -fail"
    (substring? 7 "abcdef") => (throws java.lang.AssertionError)))

(facts "to-int"
  (fact "positive"
    (to-int "7") => 7)
  (fact "negative"
    (to-int "-7") => -7)
  (fact "zero"
    (to-int "0") => 0)
  (fact "not number"
    (to-int "123x") => (throws java.lang.NumberFormatException))
  (fact "not string"
    (to-int 7) => (throws java.lang.AssertionError)))

(facts "not-nil?"
  (fact "yes"
    (not-nil? 7) => true)
  (fact "no"
    (not-nil? nil) => false))

(facts "spaced-str"
  (fact "simple"
    (spaced-str "abc" "def" 7 "ghi") => "abc def 7 ghi")
  (fact "with-nil"
    (spaced-str "abc" nil 7 "ghi") => "abc 7 ghi")
  (fact "empty"
    (spaced-str "") => "")
  (fact "just nil"
    (spaced-str nil) => ""))

(facts "when-seq-let"
  (fact "nil"
    (when-seq-let [seq nil]
      "yes") => nil)
  (fact "empty list"
    (when-seq-let [seq '()]
      "yes") => nil)
  (fact "non-empty list"
    (when-seq-let [seq '(1 2 3)]
      (apply spaced-str "yes" seq)) => "yes 1 2 3"))

(facts "only"
  (fact "nil"
    (only nil) => nil)
  (fact "empty sequence"
    (only []) => nil)
  (fact "one-element sequence"
    (only [1]) => 1)
  (fact "multi-element sequence"
    (only [1 2 3]) => (throws java.lang.AssertionError)))

