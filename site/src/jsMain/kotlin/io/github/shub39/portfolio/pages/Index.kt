package io.github.shub39.portfolio.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.StyleVariable
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.icons.fa.FaGithub
import com.varabyte.kobweb.silk.components.icons.fa.FaLinkedin
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.navigation.UncoloredLinkVariant
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.base
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toAttrs
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.style.vars.color.ColorVar
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import io.github.shub39.portfolio.HeadlineTextStyle
import io.github.shub39.portfolio.components.layouts.PageLayout
import io.github.shub39.portfolio.components.widgets.LinkButton
import io.github.shub39.portfolio.toSitePalette
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div

// Container that has a tagline and grid on desktop, and just the tagline on mobile
val HeroContainerStyle by ComponentStyle {
    base { Modifier.fillMaxWidth().gap(2.cssRem) }
    Breakpoint.MD { Modifier.margin { top(20.vh) } }
}

// A demo grid that appears on the homepage because it looks good
val HomeGridStyle by ComponentStyle.base {
    Modifier
        .gap(0.5.cssRem)
        .width(70.cssRem)
        .height(18.cssRem)
}

private val GridCellColorVar by StyleVariable<Color>()
val HomeGridCellStyle by ComponentStyle.base {
    Modifier
        .backgroundColor(GridCellColorVar.value())
        .boxShadow(blurRadius = 0.6.cssRem, color = GridCellColorVar.value())
        .borderRadius(1.cssRem)
}

@Composable
private fun GridCell(color: Color, row: Int, column: Int, width: Int? = null, height: Int? = null) {
    Div(
        HomeGridCellStyle.toModifier()
            .setVariable(GridCellColorVar, color)
            .gridItem(row, column, width, height)
            .toAttrs()
    )
}

@Page
@Composable
fun HomePage() {
    PageLayout("Home") {
        Row(HeroContainerStyle.toModifier()) {
            Box {
                val sitePalette = ColorMode.current.toSitePalette()

                Column(Modifier.gap(2.cssRem)) {
                    Div(HeadlineTextStyle.toAttrs()) {
                        SpanText(
                            "Hello! ", Modifier.fontFamily("JetBrains Mono").fontSize(FontSize.Larger).color(
                                when (ColorMode.current) {
                                    ColorMode.LIGHT -> Color.rgb(0x282828)
                                    ColorMode.DARK -> Color.rgb(0xEBDBB2)
                                }
                            )
                        )
                        Spacer()
                        SpanText(
                            "I am Shubham Gorai", Modifier.fontFamily("JetBrains Mono").fontSize(FontSize.Larger).color(
                                when (ColorMode.current) {
                                    ColorMode.LIGHT -> Color.rgb(0x282828)
                                    ColorMode.DARK -> Color.rgb(0xEBDBB2)
                                }
                            )
                        )
                        Spacer()
                        SpanText(
                            "Aspiring Android Developer from India", Modifier.fontSize(fontSize = FontSize.Large).fontFamily("JetBrains Mono").color(
                                when (ColorMode.current) {
                                    ColorMode.LIGHT -> Color.rgb(0x282828)
                                    ColorMode.DARK -> Color.rgb(0xEBDBB2)
                                }
                            )
                        )
                        Spacer()

                        Div (HeadlineTextStyle.toAttrs()){
                            LinkButton("https://www.github.com/shub39", Modifier.margin(8.px)){
                                FaGithub(Modifier)
                            }
                            LinkButton("https://www.linkedin.com/in/shub39/", Modifier.margin(8.px)){
                                FaLinkedin()
                            }
                        }
                    }
                }
            }
        }
    }
}
