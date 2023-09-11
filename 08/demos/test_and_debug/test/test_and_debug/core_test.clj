(ns test-and-debug.core-test
  (:require [clojure.test :refer :all]
            [test-and-debug.core :refer :all]))

(deftest last-four-test
  (testing "Failed to extract last four of serial number."
    (is (= (last-four 12345678) "5678"))))