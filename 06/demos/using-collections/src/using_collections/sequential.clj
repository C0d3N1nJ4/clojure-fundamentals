(ns using-collections.sequential)

;; Vectors

(def machine-1 {:name "M1" :serial-num 123})
(def machine-2 {:name "M2" :serial-num 456})
(def machine-3 {:name "M3" :serial-num 789})
(def machine-4 {:name "M4" :serial-num 101})


(def coffee-machine-vec [machine-1 machine-2 machine-3])

; vector?
(vector? coffee-machine-vec)

(vector? machine-1)

; get
(get coffee-machine-vec 2)

(get coffee-machine-vec 4)

; assoc
(assoc coffee-machine-vec 3 machine-4)

(assoc coffee-machine-vec 0 machine-4)

(assoc coffee-machine-vec 7 machine-4)


;subvec
(subvec coffee-machine-vec 1)

; first
(first coffee-machine-vec)

; rest
(rest coffee-machine-vec)

; sort-by
(sort-by :serial-num [machine-2 machine-1 machine-3 machine-4])

; map
(map (fn [machine] (:name machine)) coffee-machine-vec)

; reduce
(reduce
  (fn
    [reduced-list machine]
    (conj reduced-list (:serial-num machine)))
  []
  coffee-machine-vec)

; filter
(filter (fn [machine] (odd? (:serial-num machine))) coffee-machine-vec)


;; Lists

; into
(def coffee-machine-list (into () coffee-machine-vec))

(println coffee-machine-list)

; conj
(conj coffee-machine-list machine-4)

; sort
(sort `(5 3 8 19 2))

(sort (fn [a b] (- b a)) `(5 3 8 19 2))

; take
(take 2 coffee-machine-list)

; list?

(list? coffee-machine-list)

(list? coffee-machine-vec)


