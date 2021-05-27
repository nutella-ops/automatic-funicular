;; int factorial(int n) {
;;    if (n == 0)
;;       return 1;
;;    else
;;       return (n * factorial(n-1));
;; }

;; recur, joy of clojure, pg. 30
(defn print-down [x]
      (when (pos? x) (println x)    ;; if
            (recur (dec x))))       ;; goto

(defn print-down [x y]
      (if (pos? x)
            (recur (+ y x) (dec x)) ;; if/goto
            y))                     ;; else

;; getting feel for how when works
(defn when-test [n]
      (when (pos? n) \t \f))

(defn coin-toss []
	(rand-int 2))

(defn arbitrary-list []
	(repeatedly 4 coin-toss))


;; user=> (recur-int arbitrary-list arbitrary-list) 
;; ClassCastException clojure.lang.LazySeq cannot be cast to java.lang.Number  clojure.lang.Numbers.gt (Numbers.java:227)
(defn recur-int [initial-list distinct-list]
	(let [initial-list arbitrary-list 
	     distinct-list (distinct initial-list)]
		(if
	    	    (> initial-list distinct-list)   ;; test
	               (recur initial-list distinct-list)	     ;; then
			initial-list)))		     ;; else
