(ns study-clojure.notes)

(comment 
  "
   Liste ile fonksiyonu karistirmamak icin ' kullanilabilir.
   Ornek:
   (1 2 3) listesini '(1 2 3) olarak tanimlayabilirsin.


   (class [1 2 3]); => clojure.lang.PersistentVector
   (class '(1 2 3)); => clojure.lang.PersistentList

   ; "Collections" are just groups of data
   ; Both lists and vectors are collections:
   (coll? '(1 2 3)) ; => true
   (coll? [1 2 3]) ; => true
   
   ""
   "
  
  
  )