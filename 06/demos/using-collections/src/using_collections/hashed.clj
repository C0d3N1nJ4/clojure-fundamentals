(ns using-collections.hashed)




;; Sets
(require '[clojure.set :as set])


(def machine-1 {:name "M1" :serial-num 123})
(def machine-2 {:name "M2" :serial-num 456})
(def machine-3 {:name "M3" :serial-num 789})
(def machine-4 {:name "M1" :serial-num 123})

(def coffee-machine-set #{machine-1 machine-2 machine-3 machine-4})

(def coffee-machine-set #{machine-1 machine-2 machine-3})

(def coffee-machine-set-2 #{machine-1 machine-2 {:name "M5" :serial-num 999}})


(println coffee-machine-set)


; conj
(conj coffee-machine-set {:name "M4" :serial-num 101})

; contains?
(contains? coffee-machine-set {:name "M4" :serial-num 101})

(contains? coffee-machine-set {:name "M1" :serial-num 123})


; disj
(disj coffee-machine-set {:name "M1" :serial-num 123})

; union
(set/union coffee-machine-set coffee-machine-set-2)


; difference
(set/difference coffee-machine-set coffee-machine-set-2)

(set/difference coffee-machine-set-2 coffee-machine-set)


; intersection
(set/intersection coffee-machine-set-2 coffee-machine-set)


; subset?
(set/subset? coffee-machine-set coffee-machine-set-2)

; filter
(filter (fn [machine] (odd? (:serial-num machine))) coffee-machine-set)


;; Maps

; assoc
(assoc machine-1 :label "Living Room")


; dissoc
(dissoc machine-1 :serial-num)

; contains?
(contains? machine-1 :name)

; find
(find machine-1 :serial-num)

; keys
(keys machine-1)

; vals
(vals machine-1)

; merge
(merge machine-1 machine-2)

(merge machine-1 machine-2 machine-3)

(merge machine-1 {:status "ON" :label "Kitchen"})



