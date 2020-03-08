@file:Suppress("UnsafeCastFromDynamic")
package blackjack

import blackjack.data.Hand
import kotlinext.js.js
import kotlinx.html.style
import react.RBuilder
import react.dom.b
import react.dom.div

fun RBuilder.handUi(hand: Hand){
    div {

        attrs.style = js{
            width = "10rem"
            height = "10rem"
            padding = "1rem"
            marginRight = "1rem"
            marginTop = "1rem"
            background = "cyan"
        }

        div { b { +"${hand.name} Hand" } }
        div { hand.cards.forEach { +"${it.card}\n" } }
        div { b { +"${hand.points} points" } }
    }
}