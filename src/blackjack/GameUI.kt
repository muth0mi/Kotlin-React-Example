@file:Suppress("UnsafeCastFromDynamic")
package blackjack

import blackjack.data.Game
import kotlinx.html.style
import react.RBuilder
import react.dom.div
import react.dom.h1

fun RBuilder.gameUI(game: Game){
    div {
        h1 { +"BlackJack" }
        div {

            attrs.style = kotlinext.js.js{
                display = "flex"
            }

            handUi(game.playerHand)
            handUi(game.dealerHand)
        }
    }
}