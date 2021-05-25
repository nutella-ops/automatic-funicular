(def installed-games
	"the list of installed games to choose from"
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
	"fligth sim-10"
	"motorsport-manager"
	"mudrunner"
	"pcars-2"
	"qvardirga"
	"road-redepmtion"
	"sniper-elite-4"
	"spintires"
	"wreckfest"])

(defn rand-plus-one []
	"alias for offsetting 0-2 output to 1-3"
	(-> (rand-int 3) (+ 1)))

(defn shuffle-take []
	"shuffle games and take first 1-3 items"
	(take (rand-plus-one) (shuffle installed-games)))

(println "\n" "Thou shalt play:" (shuffle-take) "\n")
