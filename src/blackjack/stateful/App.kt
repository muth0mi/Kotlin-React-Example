package blackjack.stateful

import blackjack.EventHandler
import blackjack.data.Card
import blackjack.data.Game
import blackjack.data.Hand
import blackjack.gameUI
import react.*

interface AppState : RState {
    var game: Game
}

class App : RComponent<RProps, AppState>() {

    override fun AppState.init() {
        game = Game(
                Hand("Player", arrayListOf(Card("xxx"), Card("yyy")), 12),
                Hand("Dealer", arrayListOf(Card("abc"), Card("def")), 14)
        )
    }

    override fun RBuilder.render() {
        gameUI(state.game, object : EventHandler {
            override fun deal() {
                setState {
                    game = Game(
                            Hand("Player", arrayListOf(Card("xxx"), Card("yyy")), 12),
                            Hand("Dealer", arrayListOf(Card("abc"), Card("def")), 14))
                }
            }

            override fun hit() {
                setState {
                    game = Game(
                            Hand("Player", arrayListOf(Card("!")), 12),
                            Hand("Dealer", arrayListOf(Card("@")), 14))
                }
            }

            override fun stay() {
                setState {
                    game = Game(
                            Hand("Player", arrayListOf(Card("1"), Card("2")), 12),
                            Hand("Dealer", arrayListOf(Card("9"), Card("8")), 14))
                }
            }
        })
    }

}

fun RBuilder.app() = child(App::class) {}
