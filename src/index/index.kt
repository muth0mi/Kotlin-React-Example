package index

import blackjack.data.Card
import blackjack.data.Game
import blackjack.data.Hand
import blackjack.gameUI
import blackjack.stateful.App
import blackjack.stateful.app
import react.dom.render
import kotlin.browser.document

val game= Game(
        Hand("Player",  arrayListOf( Card("xxx"),Card("yyy") ),12),
        Hand("Dealer",  arrayListOf( Card("abc"),Card("def") ),14)
        )

fun main(args: Array<String>) {

    val rootDiv = document.getElementById("root")

    render(rootDiv) {
        app()
    }
}