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

;; checking if recur can rebind var by just calling the var in recur form
(defn recur-int [n]
	(loop [rand-int (rand-int 7)]
		(println rand-int)
		(if-not (= n 0)
			(recur (let [rand-int (rand-int 7)]))	;; ClassCastException java.lang.Integer cannot be cast to clojure.lang.IFn  user/recur-int (recursion-study.clj:27)
			(do
				(dec n)
				(println rand-int))))) 

