const val HERO_NAME = "Madrigal"

fun main() {
    println("The hero announces her presence to the world.")
    println(HERO_NAME)
    var playerLevel = 4
    println(playerLevel)

    val hasBefriendedBarbarians = true;
    val hasAngeredBarbarians = false
    val playerClass = "paladin"

    val quest:String = when(playerLevel) {
        1 -> "Meet Mr.Bubbles in the land of soft things."
        in 2..5 -> {
            // Check whether diplomacy is an option
            val canTalkToBarbarians = !hasAngeredBarbarians && (playerClass == "barbarian" || hasBefriendedBarbarians)
            if (canTalkToBarbarians) {
                "Convince the barbarians to call off their invasion."
            } else {
                "Save the town from the barbarian invasions."
            }
        }
        6 -> "Locate the enchanted sword."
        7 ->  "Recover the long-lost artifact of creation"
        8 -> "Defeat Nogartse, bringer of death and eater of worlds."
        else -> "There are no quests right now."
    }

    println("The hero approaches the bounty board. It reads: ")
    println(quest)
    println("Time passes...")
    println("The hero returns from her quest.")
    playerLevel += 1
    println(playerLevel)
}
var experiencePoints = 101
var requiredExperiencePoints = 100
val levelUpStatus: String = when {
    experiencePoints > requiredExperiencePoints -> {"You already leveled up!"}
    experiencePoints == requiredExperiencePoints -> "You have enough experience to level up!"
    requiredExperiencePoints - experiencePoints < 20 -> {"You are very close to leveling up"}
    else -> "You need more experience to level up!"
}