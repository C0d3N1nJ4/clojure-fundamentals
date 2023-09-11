(ns using-collections.core-test
  (:require [clojure.test :refer :all]
            [using-collections.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 1))))

(a-test)

(println "If you are seeing this message, a side effect occurred")


(spit "my-file.txt" "Hello world!")

(spit "my-file.txt" "Hi!" :append true)


; slurp
(slurp "my-file.txt")

(slurp "my-file.txt" :encoding "UTF-8")
