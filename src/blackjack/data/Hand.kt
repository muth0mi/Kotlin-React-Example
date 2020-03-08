package blackjack.data

data class Hand(
        val name: String,
        val cards: ArrayList<Card>,
        val points: Int
)