(ns test-and-debug.core)

(defn last-four
  [serial-num]
  (subs (str serial-num) (- (.length (str serial-num)) 4)))

