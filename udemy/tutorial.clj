(ns study-clojure.udemy.tutorial
  (:gen-class))

(defn hello
  "Hello World" 
  )

;You can create functions without naming it
#( "Hello")
;You can define functions to use it in another function
(def increment(fn [x] (+ x 1)))

(defn increment_set
  []
  (map increment [2 3 4])
  )

(increment_set 3)

(defn DataTypes []
  (def a 3)
  (def b 1.345)
  (def c 'test)
  (def d true)
  (def e nil)
  (println a, b, c)
  (println b)
  (println c)
  (println d)
  (println e))

(DataTypes)

;Variables can be defined with def
(defn art_operators []
  (def a (max 3 5))
  (def b (min 3 5))
  (def c (rem 5 4))
  (def d (inc 5))
  (def e (dec 5))
  
  (println a, b, c)
  (println b)
  (println c)
  (println d)
  (println e))

(art_operators)
