(defn coin-toss []
    (rand-int 2))

(defn set-of-results []
    (repeatedly 2 coin-toss))

(defn distinct-set []
    (distinct (set-of-results)))

(defn set-of-results [] 
    (repeatedly 2 coin-toss))

(defn distinct-set []
    (distinct (set-of-results)))

(defn check-for-dups []
    "checks if output is greater than distinct output as duplicates sensing method"
    (let [output (set-of-results) distinct-out (distinct output)] 
        [(> 
            (count output) (count distinct-out)) 
             output distinct-out]))

(defn make-selection []
    (rand-int 3))
             
(defn initial-list []
    (repeatedly 3 make-selection))

;; ClassCastException clojure.lang.PersistentList cannot be cast to java.lang.Number  clojure.lang.Numbers.gt (Numbers.java:227)
(defn yee []
    (let [distinct-list (distinct (initial-list))
          initial-list (initial-list)
          make-selection (make-selection)]
    (when (> (count initial-list) (count distinct-list)
        (list distinct-list make-selection)))))


;; ClassCastException clojure.lang.LazySeq cannot be cast to java.lang.Number  clojure.lang.Numbers.gt (Numbers.java:227)
(defn wtf []
    (loop [list-a [(repeatedly 4 coin-toss)]]
	(if
	    (> list-a (distinct list-a)) ;; if duplicates present
	    (recur (let [list-a [(distinct list-a) (repeatedly 4 coin-toss)]]))  ;; then, list-a = rebind list-a with new iteams list-b, list-b = create new list with distinct of list-a with new items
	    list-a)))  ;; else
	    
