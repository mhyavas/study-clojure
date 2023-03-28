(ns study-clojure.udemy.udemy_code_challenge1
  (:gen-class))

(defn get_animal_age [x]
  (def animal_age_multiplier {'dog 7, 'cat 5, 'goldfish 10})
  (get animal_age_multiplier x )
  )

(defn age_converter [petAge petType]
  (def ratio (get_animal_age petType))
  (println "age of " petType " is " (* petAge ratio) " in human age")
  )

(age_converter 3 'dog)