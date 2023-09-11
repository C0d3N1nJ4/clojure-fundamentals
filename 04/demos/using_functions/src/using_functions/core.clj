(ns using-functions.core)

; Named function
(defn print-coffee-machine
  [serial-number]  
  (println (str "Logging machine: " serial-number)))

(print-coffee-machine "12345678")

; Anonymous function
(def stat-map-one {:value 20 :serial-num 1234567})

(def stat-map-two {:value 30 :serial-num 2345678})

(def stat-vector [stat-map-one stat-map-two])

(defn filter-stats-by-value [stats value]  
  (filter #(= value (:value %) )  stats))

(println (filter-stats-by-value stat-vector 20))


; Multi-arity function
(defn print-status
  ([] (println "Machine Off"))
  ([main-power] (println main-power "System Ready" ))
  ([main-power, cleaning-log]
     (print-status main-power)
     (println cleaning-log)))

(print-status)

(print-status "Power On Successful")

(print-status "Power On Successful" "Needs Cleaning")

; Variadic function
(defn aggregate-stats [& stats]
  (apply + stats))

(aggregate-stats 1 2 3 4 5 6 7 8 9 10)


