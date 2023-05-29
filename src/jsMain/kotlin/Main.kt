import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.renderComposable

fun main() {
    renderComposable(rootElementId = "root") {
        Home()
    }
}

// Body
@Composable
fun Home() {
    val imageSrc = "https://media4.giphy.com/media/3o6ZsYezqjqsFFWrNm/200w.gif?cid=6c09b952hz2lxg8zg8h8id1n7c1n75vh8oywulgmbetxat4l&ep=v1_gifs_search&rid=200w.gif&ct=g"
    val headerTitle = "waked.dev"
    val linkedinUrl = "https://linkedin.com/in/rayanwaked"
    val githubUrl = "https://github.com/rayanwaked"
    val contactUrl = "mailto: rayan@waked.dev"

    Div({ style { main() } }) {
        //Image
        Div({ style { head() } }) {
            Img(src = imageSrc, alt = "winter gif", attrs = {
                style { image() } })
        }

        // Header
        H1({ style { h1() } }) {
            Text(headerTitle)
        }

        // Navigations
        Div({ style { navigation() } }) {
            H3({ style { h3() } }) {
                A(href = linkedinUrl) {
                    Text("linkedin")
                }
                A(href = githubUrl) {
                    Text("github")
                }
                A(href = contactUrl) {
                    Text("contact")
                }
            }
        }

        // Welcome
        H2({ style { h2() } }) {
            Text("Welcome")
        }
        P({ style { p() } }) {
            Text("Hello! I'm Rayan, an iOS and UX Engineer. I develop and design applications for iOS, iPadOS, " +
                    "watchOS, and macOS. My main tech stack consists of Swift and SwiftUI. However, I'm also well " +
                    "aquainted with HTML, CSS, Typescript, React, and Ionic.")
        }

        Div({ style { spacer() } })

        // Projects
        H2({ style { h2() } }) {
            Text("Projects")
        }
        P({ style { p() } }) {
            Text("Boston — an iOS, iPadOS, and macOS app that connects Siri with OpenAI's language learning " +
                    "models. Enables Siri to answer complex questions and requests.")
            Div({ style { spacer() } })
            Text("Fog — a secret project in the works! Keep an eye out for updates.")
        }
    }
}

// Classes
fun StyleScope.main() {
    lineHeight(1.5.em)
    letterSpacing(0.065.em)
}

fun StyleScope.head() {
    display(DisplayStyle.Flex)
    justifyContent(JustifyContent.Center)
    alignItems(AlignItems.Center)
    paddingTop(10.vh)
}

fun StyleScope.image() {
    width(8.em)
    height(8.em)
    property("border-radius", "calc(15%)")
}

fun StyleScope.h1() {
    color(Color.white)
    fontWeight(500)
    fontSize(2.4.em)
    letterSpacing(0.045.em)
    display(DisplayStyle.Flex)
    justifyContent(JustifyContent.Center)
    alignItems(AlignItems.Center)
    paddingTop(5.vh)
}

fun StyleScope.h2() {
    color(Color.white)
    fontWeight(400)
    fontSize(2.em)
    letterSpacing(0.035.em)
    display(DisplayStyle.Flex)
    justifyContent(JustifyContent.FlexStart)
    alignItems(AlignItems.Center)
    paddingLeft(20.vw)
}

fun StyleScope.h3() {
    color(Color.red)
    fontWeight(400)
    fontSize(1.2.em)
    letterSpacing(0.045.em)
    gap(20.px)
    display(DisplayStyle.Flex)
    justifyContent(JustifyContent.Center)
    alignItems(AlignItems.Center)
}

fun StyleScope.p() {
    color(Color.white)
    fontWeight(200)
    paddingRight(20.vw)
    paddingLeft(20.vw)
    justifyContent(JustifyContent.Center)
    alignItems(AlignItems.Center)
}

fun StyleScope.navigation() {
    display(DisplayStyle.Flex)
    justifyContent(JustifyContent.Center)
    alignItems(AlignItems.Center)
}

fun StyleScope.spacer() {
    height(15.px)
}
