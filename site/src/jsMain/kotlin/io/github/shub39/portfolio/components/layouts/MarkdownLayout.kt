package io.github.shub39.portfolio.components.layouts

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.BorderCollapse
import com.varabyte.kobweb.compose.css.FontStyle
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.Overflow
import com.varabyte.kobweb.compose.css.OverflowWrap
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.toAttrs
import com.varabyte.kobweb.silk.theme.colors.palette.color
import com.varabyte.kobweb.silk.theme.colors.palette.toPalette
import io.github.shub39.portfolio.SitePalettes
import io.github.shub39.portfolio.toSitePalette
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div

val MarkdownStyle = CssStyle {
    base { Modifier.fillMaxSize().minHeight(100.percent) }

    cssRule("h1") {
        Modifier
            .fontSize(3.cssRem)
            .fontWeight(500)
            .margin(bottom = 2.5.cssRem)
            .lineHeight(1.2)
            .fontStyle(FontStyle.Italic)
            .fontFamily("JetBrains Mono")
    }

    cssRule("h2") {
        Modifier
            .fontSize(2.7.cssRem)
            .fontWeight(300)
            .margin(topBottom = 2.cssRem)
    }

    cssRule("h3") {
        Modifier
            .fontSize(2.4.cssRem)
            .fontWeight(300)
            .margin(topBottom = 1.5.cssRem)
    }

    cssRule("h4") {
        Modifier
            .fontSize(2.cssRem)
            .fontWeight(FontWeight.Bolder)
            .margin(top = 1.cssRem, bottom = 0.5.cssRem)
    }

    cssRule("ul") {
        Modifier.fillMaxWidth().overflowWrap(OverflowWrap.BreakWord)
    }

    cssRule(" :is(li,ol,ul)") {
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

    cssRule("hr") {
        Modifier
            .margin(topBottom = 5.cssRem)
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

    cssRule("table") {
        Modifier
            .borderCollapse(BorderCollapse.Collapse)
            .margin(topBottom = 3.cssRem)
            .border(3.px, LineStyle.Dashed, SitePalettes.dark.dark2)
    }

    cssRule("th, td") {
        Modifier
            .padding(0.5.cssRem)
            .border(1.px, LineStyle.Dashed, SitePalettes.dark.dark2)
            .textAlign(TextAlign.Left)
    }

    cssRule("img") {
        Modifier
            .maxWidth(100.percent)
            .maxHeight(100.percent)
    }


    cssRule("th") {
        Modifier
            .backgroundColor(colorMode.toSitePalette().nearBackground)
            .fontWeight(FontWeight.Bolder)
    }

    cssRule("tr:nth-child(even)") {
        Modifier.backgroundColor(colorMode.toSitePalette().nearBackground)
    }

}

@Composable
fun MarkdownLayout(title: String, content: @Composable () -> Unit) {
    PageLayout(title) {
        Div(MarkdownStyle.toAttrs()) {
            content()
        }
    }
}