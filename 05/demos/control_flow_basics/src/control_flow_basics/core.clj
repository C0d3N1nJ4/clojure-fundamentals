(ns control-flow-basics.core)

;; Conditional Expressions
(defn print-coffee-machine
  [serial-number]  
  (println
   (str "Logging " 
        (if (odd? serial-number) "odd" "even")
        " machine: " serial-number)))

(print-coffee-machine 12345677)

(defn print-coffee-machine-with-se
  [serial-number]
  (println
   (str "Logging "
        (if (odd? serial-number)
            (do (println "Printing odd machine!") "odd")
            (do (println "Printing even machine!") "even"))
        " machine: " serial-number)))

(print-coffee-machine-with-se 12345677)

(defn print-odd-coffee-machine
  [serial-number]
  (when (odd? serial-number)
        (println "Printing odd machine: " serial-number)
        serial-number))

(print-odd-coffee-machine 12345677)

(print-odd-coffee-machine 12345678)


(defn coffee-machine-status-str
  [status]
  (case status
    0 "STOPPED"
    1 "BREWING"
    2 "CLEANING"
    "UNDEFINED"))

(def machine-one {:status 0 :serial-num 2345678 :temp 70})

(coffee-machine-status-str (:status machine-one))


(defn coffee-machine-temp-rating
  [temp]
  (cond
      (>= temp 120) "EXTREMELY HOT"
      (>= temp 100) "HOT"
      (>= temp 80)  "MILD"
      (>= temp 60) "COOL"
      (>= temp 0) "COLD"
      :else "FRIGID"
    ))

(coffee-machine-temp-rating (:temp machine-one))


;; Iteration

(defn spam-coffee-console
  [spam-count]
  (dotimes [current spam-count]
    (println "I love coffee.")))

(spam-coffee-console 10)

(defn print-coffee-stats
  [stats multipliers]  
  (doseq [stat stats multiplier multipliers]
    (println (* stat multiplier))))

(print-coffee-stats [4 5 6] [1 2])

(defn aggregate-coffee-stats 
  [stats multipliers]
  (for [stat stats multiplier multipliers]
    (* stat multiplier)))

(println (aggregate-coffee-stats [4 5 6] [1 2]))

