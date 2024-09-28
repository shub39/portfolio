package io.github.shub39.portfolio.components.layouts

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.varabyte.kobweb.compose.dom.svg.Defs
import com.varabyte.kobweb.compose.dom.svg.Path
import com.varabyte.kobweb.compose.dom.svg.RadialGradient
import com.varabyte.kobweb.compose.dom.svg.Stop
import com.varabyte.kobweb.compose.dom.svg.Svg
import com.varabyte.kobweb.compose.dom.svg.SvgId
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.ColumnScope
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toAttrs
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import io.github.shub39.portfolio.components.sections.NavHeader
import io.github.shub39.portfolio.toSitePalette
import kotlinx.browser.document
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.fr
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.dom.Div

val PageContentStyle = CssStyle {
    base { Modifier.fillMaxSize().padding(leftRight = 4.cssRem) }
    Breakpoint.MD { Modifier.maxWidth(80.cssRem) }
}

@Composable
private fun SvgArt(modifier: Modifier) {
    val primaryColor = ColorMode.current.toSitePalette().brand.light0Hard
    val secondaryColor = ColorMode.current.toSitePalette().brand.light0Soft

    Svg(attrs = modifier.maxWidth(100.percent).width(25.cssRem).height(20.cssRem).toAttrs()) {
        val waveGradientId = SvgId("wave-gradient")
        Defs {
            RadialGradient(waveGradientId, attrs = {
                cx(0)
                cy(0)
                r(120.percent)
            }) {
                Stop(50.percent, primaryColor)
                Stop(95.percent, secondaryColor, stopOpacity = 0f)
            }
        }

        Path {
            d("""
                M0,100 
                Q150,0 300,100 
                T600,100 
                L600,300 
                L0,300 
                Z
            """)
            fill(waveGradientId)
        }

        Path {
            d("""
                M0,200 
                Q150,50 300,200 
                T600,200 
                L600,300 
                L0,300 
                Z
            """)
            fill(primaryColor)
        }

        Path {
            d("""
                M0,250 
                Q150,150 300,250 
                T600,250 
                L600,300 
                L0,300 
                Z
            """)
            fill(secondaryColor)
        }
    }
}

@Composable
fun PageLayout(title: String, content: @Composable ColumnScope.() -> Unit) {
    LaunchedEffect(title) {
        document.title = "shub39 - $title"
    }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .minHeight(100.percent)
            .gridTemplateRows { size(1.fr); size(minContent) },
        contentAlignment = Alignment.TopCenter
    ) {
        Column(
            modifier = Modifier
                .fontFamily("Poppins")
                .fillMaxSize()
                .gridRow(1),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            NavHeader()
            Div(PageContentStyle.toAttrs()) {
                content()
            }
        }
    }
}
