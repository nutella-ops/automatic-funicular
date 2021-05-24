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

;will try a recursive implementation by re-binding initial-list to [distinct-list lottery-single] until duplicates are gone
(defn lottery-test []
	"remove duplicates by comparing the initial-list with the distinct-list
	if (> initial-list distinct-list), then duplicates are present.
	if (= initial-list distinct-list), then no duplicates.
	if (< initial-list distinct-list), then nil."
	(let [LV (lottery-various) dist-count (count (distinct LV))]
		(if (= dist-count 2)
			(do 
				(println LV)
				(conj 
					(vec (lottery-single)) 
					LV)))))
