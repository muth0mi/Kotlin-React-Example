@file:Suppress("UnsafeCastFromDynamic")

package index

import kotlinx.html.style
import kotlinx.html.title
import react.dom.b
import react.dom.div
import react.dom.h1
import react.dom.render
import kotlin.browser.document


fun main(args: Array<String>) {

    val rootDiv = document.getElementById("root")


    render(rootDiv) {
        div {
            h1 { +"BlackJack" }
            div {

                attrs.title = "Foo"
                attrs.style = kotlinext.js.js{
                    display = "flex"
                }

                div {
                    div { b { +"Player Hand" } }
                    div { +"cards go here" }
                    div { b { +"12 points" } }
                }

                div {
                    div { b { +"Dealer Hand" } }
                    div { +"cards go here" }
                    div { b { +"14 points" } }
                }

            }
        }
    }
}
