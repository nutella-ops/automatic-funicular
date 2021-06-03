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


;; rebind var using recur works now
(defn recur-int [initial-list]
	(let [initial-list (arbitrary-list)]
			(println "init-list:" initial-list)
			(if
				(= initial-list (distinct initial-list))	;; test
					initial-list							;; then
					(recur initial-list))))	    			;; else			     					
