#Main Ideas#
-Hunger/Energy
~Instead of hunger I have energy or health so I can say that test of strength takes X amount of energy based on the encounter
--Berries (small energy, small hunger decrease but you have a lot of them)
--Meat (avg hunger decrease/avg energy increase)
--MRE-like item (high hunger decrease/high energy increase but massively increases boredom)
--Special food item (massively decreases hunger while decreasing thirst and boredom)

--Including the appetite descriptions within a value range of 0-100
--~Hunger - 10 - "Starving"~

-Enemy Encounter that are of random level
-Encounter uses energy level and encounter level 
-Chance to get special food or toy for pet if encounter is won
-Food may give you larger than

--Easy(1) enemy == 3x turns to survive
---Health at at least 1/5 to not die
---Generic items

--Medium(2) enemy == 6 or 7 turns
---Health at at least 2/5 to not die
---Above average quality food
---No toy

--Hard(3) enemy == 10 or more turns to survive
---Will die if health is less than 3/5
---Special food that will give high energy (only from this encounter)
---Special toy that will give high happiness (only from this encounter)

-Sleep
--Pet will fall asleep automatically if sleep is less than 10

##Future ideas##
~Food storage for selecting a food to feed to pet
~Boredom
SG - Every 30-60 minutes boredom increase by 5%


Instance variables are the state of the pet
Methods are behavior based (feeding/playing)

	Game loop = passage of time, updates everything

Exit loop when games is suppose to end

include tick() method in VirtualPet class