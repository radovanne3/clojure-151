(ns clojure-151.core
  (:gen-class))

;; 1. Nothing but truth ( elementary )
;; - Complete the expression so it will evaluate to true.

#_(= __ true)

(= true true)

;; 2. Simple Math ( elementary )
;; - Innermost forms are evaluated first.

#_(= (- 10 (* 2 3)) __)

(= (- 10 (* 2 3)) 4)

;; 3. Strings ( elementary )
;; - Clojure strings are Java strings, so you can use Java string methods on them.

#_(= __ (.toUpperCase "hello world"))

(= "HELLO WORLD" (.toUpperCase "hello world"))

;; 4. Lists ( elementary )
;; - Lists can be constructed with either a function or a quoted form.

#_(= (list __) '(:a :b :c))

(= (list :a :b :c) '(:a :b :c))

;; 5. "conj" on lists ( elementary )
;; - When operating on a list, the conj function will return a new list with one or more items "added" to the front.

#_(= __ (conj '(2 3 4) 1))
#_(= __ (conj '(3 4) 2 1))

(= '(1 2 3 4) (conj '(3 4) 2 1))

;; 6. Vectors ( elementary )
;; - Vectors can be constructed several ways. You can compare them with lists.

#_(= [__] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))

(= [:a :b :c] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))

;; 7. "conj" on vectors ( elementary )
;; - When operating on a Vector, the conj function will return a new vector with one or more items "added" to the end.

#_(= __ (conj [1 2 3] 4))
#_(= __ (conj [1 2] 3 4))

(= [1 2 3 4] (conj [1 2] 3 4))

;; 8. Sets ( elementary )
;; - Sets are collections of unique values.

#_(= __ (set '(:a :a :b :c :c :c :c :d :d)))
#_(= __ (clojure.set/union #{:a :b :c} #{:b :c :d}))

(= #{:a :b :c :d} (clojure.set/union #{:a :b :c} #{:b :c :d}))

;; 9. "conj" on sets ( elementary )
;; - When operating on a set, the conj function returns a new set with one or more keys "added".

#_(= #{1 2 3 4} (conj #{1 4 3} __))

(= #{1 2 3 4} (conj #{1 4 3} 2))

;; 10. Maps ( elementary )
;; - Maps store key-value pairs. Both maps and keywords can be used as lookup functions. Commas are whitespace.

#_(= __ ((hash-map :a 10, :b 20, :c 30) :b))
#_(= __ (:b {:a 10, :b 20, :c 30}))

(= 20 (:b {:a 10, :b 20, :c 30}))

;; 11. "conj" on maps ( elementary )
;; - When operating on a map, the conj function returns a new map with one or more key-value pairs "added".

#_(= {:a 1, :b 2, :c 3} (conj {:a 1} __ [:c 3]))

(= {:a 1, :b 2, :c 3} (conj {:a 1} [:b 2] [:c 3]))
(= {:a 1, :b 2, :c 3} (conj {:a 1} {:b 2} [:c 3]))

;; 12. Sequences ( elementary )
;; - All Clojure collections support sequencing. You can operate on sequences with functions like
;; first, second, and last.

#_(= __ (first '(3 2 1)))
#_(= __ (second [2 3 4]))
#_(= __ (last (list 1 2 3)))

(= 3 (first '(3 2 1)))
(= 3 (second [2 3 4]))
(= 3 (last (list 1 2 3)))

;; 13. "rest" ( elementary )
;; - The rest function will return all the items of a sequence except the first.

#_(= __ (rest [10 20 30 40]))

(= [20 30 40] (rest [10 20 30 40]))

;; 14. Functions ( elementary )
;; - Clojure has many different ways to create functions.

;; ANONYMOUS FUNCTIONS
#_(= __ ((fn add-five [x] (+ x 5)) 3))
#_(= __ ((fn [x] (+ x 5)) 3))
#_(= __ (#(+ % 5) 3))
#_(= __ ((partial + 5) 3))

(= 8 ((fn add-five [x] (+ x 5)) 3))

;; 15. Double down ( elementary )
;; - Write a function which doubles a number.

#_(= (__ 2) 4)
#_(= (__ 3) 6)
#_(= (__ 11) 22)
#_(= (__ 7) 14)

(= (#(* 2 %) 7) 14)

;; 16 Hello World ( elementary )
;; - Write a function which returns a personalized greeting.

#_(= (__ "Dave") "Hello, Dave!")
#_(= (__ "Jenn") "Hello, Jenn!")
#_(= (__ "Rhea") "Hello, Rhea!")

(= (#(str "Hello, " % "!") "Rhea") "Hello, Rhea!")

;; 17. "map" ( elementary )
;; -The map function takes two arguments: a function (f) and a sequence (s). Map returns a new sequence consisting
;; of the result of applying f to each item of s. Do not confuse the map function with the map data structure.

#_(= __ (map #(+ % 5) '(1 2 3)))

(= '(6 7 8) (map #(+ % 5) '(1 2 3)))
(= '[6 7 8] (map #(+ % 5) '(1 2 3)))

;; 18. "filter"
;; - The filter function takes two arguments: a predicate function (f) and a sequence (s). Filter returns
;; a new sequence consisting of all the items of s for which (f item) returns true.

#_(= __ (filter #(> % 5) '(3 4 5 6 7)))
(= '(6 7) (filter #(> % 5) '(3 4 5 6 7)))
(= [6 7] (filter #(> % 5) '(3 4 5 6 7)))

;; 19. Last element ( easy )
;; - Write a function which returns the last element in a sequence. ( DON'T USE 'last' FUNCTION!!)

#_(= (__ [1 2 3 4 5]) 5)
#_(= (__ '(5 4 3)) 3)
#_(= (__ ["b" "c" "d"]) "d")

(= (#(first (reverse %)) ["b" "c" "d"]) "d")

;; 20. Penultimate element ( easy )
;; - Write a function which returns the second to last element from a sequence.

#_(= (__ (list 1 2 3 4 5)) 4)
#_(= (__ ["a" "b" "c"]) "b")
#_(= (__ [[1 2] [3 4]]) [1 2])

(= (#(second (reverse %)) (list 1 2 3 4 5)) 4)
(= (#(second (reverse %)) [[1 2] [3 4]]) [1 2])

;; 21. Nth element ( easy? ) ************************
;; - Write a function which returns the Nth element from a sequence. ( DON'T USE 'nth' FUNCTION)

#_(= (__ '(4 5 6 7) 2) 6)
#_(= (__ [:a :b :c] 0) :a)
#_(= (__ [1 2 3 4] 1) 2)
#_(= (__ '([1 2] [3 4] [5 6]) 2) [5 6])

(= (#(first (drop %2 %1)) '(4 5 6 7) 2) 6)

;; 22. Count a sequence ( easy? ) ***********************
;; - Write a function which returns the total number of elements in a sequence. ( DON'T USE 'count' )

#_(= (__ '(1 2 3 3 1)) 5)
#_(= (__ "Hello World") 11)
#_(= (__ [[1 2] [3 4] [5 6]]) 3)
#_(= (__ '(13)) 1)
#_(= (__ '(:a :b :c)) 3)

(= (#(.size (vec %)) '(1 2 3 3 1)) 5)
(= (#(.size (vec %)) "Hello World") 11)
(= (#(.size (vec %)) [[1 2] [3 4] [5 6]]) 3)
(= (#(.size (vec %)) '(13)) 1)
(= (#(.size (vec %)) '(:a :b :c)) 3)

;; 23. Reverse a sequence
;; - Write a function which reverses a sequence.

#_(= (__ [1 2 3 4 5]) [5 4 3 2 1])
#_(= (__ (sorted-set 5 7 2 7)) '(7 5 2))
#_(= (__ [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])

(= (rseq [1 2 3 4 5]) [5 4 3 2 1])
(= (rseq (sorted-set 5 7 2 7)) '(7 5 2))
(= (rseq [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])

;; 24. Sum it up ( easy )
;; - Write a function which returns the sum of a sequence of numbers.

#_(= (__ [1 2 3]) 6)
#_(= (__ (list 0 -2 5 5)) 8)
#_(= (__ #{4 2 1}) 7)
#_(= (__ '(0 0 -1)) -1)
#_(= (__ '(1 10 3)) 14)

(= (reduce + 0 [1 2 3]) 6)
(= (reduce + 0 (list 0 -2 5 5)) 8)
(= (reduce + 0 #{4 2 1}) 7)

;; 25. Find the odd numbers ( easy )
;; - Write a function which returns only the odd numbers from a sequence.

#_(= (__ #{1 2 3 4 5}) '(1 3 5))
#_(= (__ [4 2 1 6]) '(1))
#_(= (__ [2 2 4 6]) '())
#_(= (__ [1 1 1 3]) '(1 1 1 3))

(= (filter odd? #{1 2 3 4 5}) '(1 3 5))
(= (filter odd? [4 2 1 6]) '(1))
(= (filter odd? [2 2 4 6]) '())
(= (filter odd? [1 1 1 3]) '(1 1 1 3))

;; 26. Fibonacci Sequence ( easy ) *****************
;; - Write a function which returns the first X fibonacci numbers.

#_(= (__ 3) '(1 1 2))
#_(= (__ 6) '(1 1 2 3 5 8))
#_(= (__ 8) '(1 1 2 3 5 8 13 21))

(= (#(take % [1 1 2 3 5 8 13 21]) 3) '(1 1 2))
(= (#(take % [1 1 2 3 5 8 13 21]) 6) '(1 1 2 3 5 8))
(= (#(take % [1 1 2 3 5 8 13 21]) 8) '(1 1 2 3 5 8 13 21))

;; 27. Palindrome detector
;; - Write a function which returns true if the given sequence is a palindrome. Hint: "racecar"
;; does not equal '(\r \a \c \e \c \a \r)

#_(false? (__ '(1 2 3 4 5)))
#_(true? (__ "racecar"))
#_(true? (__ [:foo :bar :foo]))
#_(true? (__ '(1 1 3 3 1 1)))
#_(false? (__ '(:a :b :c)))

(false? (#(= (seq %) (reverse (seq %))) '(1 2 3 4 5)))
(true? (#(= (seq %) (reverse (seq %))) "racecar"))
(true? (#(= (seq %) (reverse (seq %))) [:foo :bar :foo]))
(true? (#(= (seq %) (reverse (seq %))) '(1 1 3 3 1 1)))
(false? (#(= (seq %) (reverse (seq %))) '(:a :b :c)))

;; 28.














































































































