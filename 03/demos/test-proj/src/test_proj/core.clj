; Declare our namespace (more on this later)
(ns test-proj.core)

;; Strings/Characters/Regular Expressions
(println "My String")

(def my-str-var (str "AB" "C"))

(println my-str-var)
(type my-str-var)

(def my-char \Z)

(println my-char)
(type my-char)

(def my-reg-expr #"Clojure")

(type my-reg-expr)

(re-find my-reg-expr "Clojure is great!")

(re-find my-reg-expr "Scala is great!")


;; Numbers
(def my-integer 1000)
(type my-integer)

(def my-decimal 10.345633)
(type my-decimal)

(+ my-integer my-decimal)
(type (+ my-integer my-decimal))


(def my-ratio 100/8)
(def other-ratio (/ 2 3))
(def whole-number-ratio 10/5)

(type my-ratio)

(type other-ratio)

(type whole-number-ratio)

(denominator my-ratio) ; 100/8 becomes 25/2

(ratio? my-ratio)

(double other-ratio)



;; Collections

; Vectors
(def my-vector [1 2 3 4])
(filter even? my-vector)

; Lists
(def my-list `(1 2 3 4))
(filter odd? my-list)

; Sets
; (def my-set #{1 2 3 4 5 5})
(def my-set #{1 2 3 4 5})

(def number-vector [1 1 2 2 3 3 4 4])
(set number-vector)


; Maps
(def my-map {:a 1 :b 2 :c 3})
(def my-map-2 {:a 2 :d 4 :e 5})
(merge my-map my-map-2)

(println (vals my-map))

(println (vals my-map-2))


;; Symbols

; map is a symbol (name) that points
; to the core, map function
(type map)

(map (fn [num] (+ num 1)) `(1, 2, 3))

(type nil)

(type true)

(type false)

:my-keyword
(type :my-keyword)
