@file:Suppress("UnsafeCastFromDynamic")

package blackjack.ui

import kotlinx.html.js.onClickFunction
import react.RBuilder
import react.dom.button
import react.dom.div

interface EventHandler {
    fun deal()
    fun hit()
    fun stay()
}

fun RBuilder.buttonBar(eventHandler: EventHandler) {
    div {
        button {
            +"Deal"
            attrs { onClickFunction = { eventHandler.deal() } }
        }
        button {
            +"Hit"
            attrs { onClickFunction = { eventHandler.hit() } }
        }
        button {
            +"Stay"
            attrs { onClickFunction = { eventHandler.stay() } }
        }
    }
}