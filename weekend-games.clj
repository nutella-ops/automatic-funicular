(def installed-games
	["absolute-drift" 
	"ets2" 
	"far-cry-2" 
	"farm-sim-17" 
	"half-life-2" 
	"hard-west" 
	"hearts-of-iron-3"
	"heat-signature"
	"hitman"
	"hitman-go"
	"infra"
	"invisible-inc"
	"kcd"
	"lara-croft-go"
	"fligth-sim-10"
	"motorsport-manager"
	"mudrunner"
	"pcars-2"
	"qvardirga"
	"road-redepmtion"
	"sniper-elite-4"
	"spintires"
	"wreckfest"])

(defn choose-a-game []
	(rand-nth installed-games))

(defn lottery []
	(repeatedly (+ 1 (rand-int 3)) choose-a-game))

(println (lottery))
