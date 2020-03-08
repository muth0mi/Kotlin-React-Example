package blackjack.stateful

import blackjack.gameUI
import index.game
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

class App : RComponent<RProps, RState>() {

    override fun RBuilder.render() {
        gameUI(game)
    }

}

fun RBuilder.app() = child(App::class) {}
