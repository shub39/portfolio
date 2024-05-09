package io.github.shub39.portfolio.components.layouts

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontStyle
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.Overflow
import com.varabyte.kobweb.compose.css.OverflowWrap
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.cssRule
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.palette.color
import com.varabyte.kobweb.silk.theme.colors.palette.toPalette
import io.github.shub39.portfolio.toSitePalette
import org.jetbrains.compose.web.css.*

val MarkdownStyle by ComponentStyle {

    cssRule("h1") {
        Modifier
            .fontSize(2.cssRem)
            .fontWeight(800)
            .margin(bottom = 2.5.cssRem, top = 2.5.cssRem)
            .lineHeight(1.2)
    }

    cssRule("h2") {
        Modifier
            .fontSize(1.5.cssRem)
            .fontWeight(700)
            .margin(topBottom = 2.cssRem)
    }

    cssRule("h3") {
        Modifier
            .fontSize(1.cssRem)
            .fontWeight(700)
            .margin(topBottom = 1.5.cssRem)
    }

    cssRule("h4") {
        Modifier
            .fontSize(1.cssRem)
            .fontWeight(FontWeight.Bolder)
            .margin(top = 1.cssRem, bottom = 0.5.cssRem)
    }

    cssRule("quote") {
        Modifier
            .fontSize(1.2.cssRem)
            .fontStyle(FontStyle.Italic)
    }

    cssRule("p") {
        Modifier
            .margin(0.8.cssRem)
            .fontSize(1.2.cssRem)
    }

    cssRule("img") {
        Modifier
            .borderRadius(1.cssRem)
    }

    cssRule("ul") {
        Modifier.fillMaxWidth().overflowWrap(OverflowWrap.BreakWord)
    }

    cssRule("li,ol,ul") {
        Modifier.margin(bottom = 0.25.cssRem)
    }

    cssRule("code") {
        Modifier
            .color(colorMode.toPalette().color.toRgb().copyf(alpha = 0.8f))
            .fontWeight(FontWeight.Bolder)
    }

    cssRule("pre") {
        Modifier
            .margin(top = 0.5.cssRem, bottom = 2.cssRem)
            .fillMaxWidth()
    }
    cssRule("pre > code") {
        Modifier
            .display(DisplayStyle.Block)
            .fillMaxWidth()
            .backgroundColor(colorMode.toSitePalette().nearBackground)
            .border(1.px, LineStyle.Solid, colorMode.toPalette().color)
            .borderRadius(0.25.cssRem)
            .padding(0.5.cssRem)
            .fontSize(1.cssRem)
            .overflow { x(Overflow.Auto) }
    }
}

@Composable
fun MarkdownLayout(title: String, content: @Composable () -> Unit) {
    PageLayout(title) {
        Column(MarkdownStyle.toModifier().fillMaxSize().margin(bottom = 10.cssRem), horizontalAlignment = Alignment.Start) {
            content()
        }
    }
}
