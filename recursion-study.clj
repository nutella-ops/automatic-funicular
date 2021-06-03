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

;; list reduced to a binary pair because odds of init-list == (distinct init-list) were so low function hung indefinitely
(defn arbitrary-list []
	(repeatedly 2 coin-toss))


;; recur needs a nominal function arg, yet matching number of args
;; having trouble accumulating unique results, i.e. saving results then generate new list and add only unique results
(defn recur-int [lol wtf]
	(let [foo-list (arbitrary-list) bar-list (distinct foo-list)]
			(println "init-list:" foo-list "\n" "dist-list:" bar-list)
			(if
				(> (count foo-list) (count bar-list))							;; if true, duplicates are present
					bar-list													;; if duplicates present, print distinct list
					(recur foo-list bar-list))))	    						;; else generate another list