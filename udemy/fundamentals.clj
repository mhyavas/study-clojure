(ns study-clojure.udemy.fundamentals
  :gen-class)

;conditions
(defn condIF [x y]
  (if (= x y)
    (println "equal!")
    (println "not equal!")
    )
  )

(condIF 5 6)

(defn condIFDo [x y]
  (if (= x y)
    (do (println "parameters are equal!")
        (println "true do is running!"))
    (do (println "parameters are not equal!")
        (println "false do is running!")))
  )
(condIFDo 5 6)
(defn condNestedIF [x y]
  (if (and (= x y) (or true (> x y)))
    (println "condition is true!")
    (println "condition is false!"))
  )
(condNestedIF 3 4)

(defn condCase [x]
  (case x
    5 (println "input is 5!")
    6 (println "input is 6!")))
(condCase 6)

(defn multiCond [x]
  (cond 
    (<= x 5) (println "it is less than 5")
    (> x 5) (println "it is more than 5") 
    :else (println "it is not a number")))

(multiCond "mat")

;Loops

(defn Loop []
  (loop [x 0]
    (when (< x 10)
      (println x)
      (recur (inc x))
      ))) ; recur function iterates the loop like return 
(Loop)

(defn doTimes []
  (dotimes [x 10] ; shortcut of the loop with when
           (println x))
  )
(doTimes)

(defn whileDo [x]
  (def y (atom 0))
  (while (< @y x)
    (do 
      (println @y)
      (swap! y inc)
      )
    )
  )

(whileDo 5)

(defn doSeq [seq]
  (doseq [x seq]
         (println (inc x))
         )
  )
(doSeq [1 2 3 4 5 6])


;ATOMS
(defn Atoms []
  (def x (atom 100))
  (println @x)
  (swap! x inc)
  (println @x)
  (reset! x 105) ; change the value to a exact value
  (println @x)
  (compare-and-set! x 105 123) ; if the value is 105, it is changed to 123
  (println @x)
  (compare-and-set! x 110 135)
  (println @x))

(Atoms)

;Sequences
(defn Sequ []
  (def colors (seq ["red" "blue"]))
  (println colors)
  (println (cons "yellow" colors))
  (println (cons colors "yellow"))
  (println (conj colors "yellow"))
  (println (conj ["red" "blue" "green"] "yellow"))
  (println (concat colors (seq ["black" "white"]))) ;concat two seq
  (println (distinct (seq [1 2 3 4 4 3 2]))) ; gives the unique values of the seq
  (println (reverse colors)) ; reverse the order of the seq
  (println (first colors))
  (println (last colors))
  (println (rest colors))
  (println (sort (seq [1 2 4 5 3 7 5 2])))
  )

(Sequ)

;StructMap
(defn Structs []
  (defstruct pet :PetType :Petname)
  (def pet1 (struct pet "cat" "kido"))
  (println pet1)
  (def pet2 (struct-map pet :Petname "fido" :PetType "dog"))
  (println pet2)
  (println (:PetType pet1))
  (def pet3 (assoc pet2 :Petname "mino"))
  (println pet3)
  (def pet4 (assoc pet2 :PetAge 3))
  (println pet4))
(Structs)

;Destruct
(defn Destruct []
  (def vect1 [1 2 3 4]) ;extracting values from a vector
  (let [[a b c] vect1] (println a b c))
  (let [[a b & rest] vect1] (println a b rest))
  ;Extracting value from a map
  (def map1 {'name "Mahmut" 'lastname "Oz"})
  (let [{a 'name b 'lastname} map1] (println a b))
  )


(defn ExceptionHandling [x]
  (try
    (inc x)
    (catch ClassCastException e (println "Error:" (.getMessage e)))
    (catch Exception e (println (.getMessage e)))
    (finally (println "For memory cleanup!"))))
(ExceptionHandling "test")