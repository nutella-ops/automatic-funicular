(def installed-games
	["absolute drift" 
	"ets2" 
	"far cry 2" 
	"farm sim 17" 
	"half-life 2" 
	"hard-west" 
	"hearts-of-iron-3"
	"heat-signature"
	"hitman"
	"hitman go"
	"infra"
	"invisible inc"
	"kcd"
	"lara croft go"
	"fligth sim 10"
	"motorsport manager"
	"mudrunner"
	"pcars 2"
	"qvardirga"
	"road redepmtion"
	"sniper elite 4"
	"spintires"
	"wreckfest"
	"wreckfest santa"])

(defn lottery-single []
	(rand-nth installed-games))

(defn rand-plus-one []
	(-> (rand-int 3) (+ 1)))

(defn lottery-various []
	(let [n (rand-plus-one)]
		(repeatedly n lottery-single)))

(defn lottery-test []
	(let [LV (lottery-various) dist-count (count (distinct LV))]
		(if (= dist-count 2)
			(do 
				(println LV)
				(conj 
					(vec (lottery-single)) 
					LV)))))

(defn do-lotto []
	(dotimes [n 16] (println (lottery-test))))



;when [rand-plus-one = 2] & [duplicates = 2], then [games-listed = 1] 
	;run (lottery-single) 1 time

;when [rand-plus-one = 3] & [duplicates = 2], then [games-listed = 1] 
	;run (lottery-single) 2 time

;when [rand-plus-one = 3] & [duplicates = 3], then [games-listed = 1] 
	;run (lottery-single) 2 time

;if (!= [rand-plus-one = 2] [games-listed]), then (conj list output ())