package io.github.shub39.portfolio.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontStyle
import com.varabyte.kobweb.compose.css.StyleVariable
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.icons.fa.FaGithub
import com.varabyte.kobweb.silk.components.icons.fa.FaLinkedin
import com.varabyte.kobweb.silk.components.icons.fa.FaMailchimp
import com.varabyte.kobweb.silk.components.icons.fa.FaYoutube
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
import io.github.shub39.portfolio.components.sections.Footer
import io.github.shub39.portfolio.components.widgets.LinkButton
import io.github.shub39.portfolio.components.widgets.ThemedButton
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


@Page
@Composable
fun HomePage() {
    PageLayout("Home") {
        Row(HeroContainerStyle.toModifier()) {
            Box {
                Column(Modifier.gap(2.cssRem)){
                    Column(Modifier.gap(1.cssRem)){
                        Div(HeadlineTextStyle.toAttrs()) {
                            SpanText(
                                "Hello! \uD83D\uDC4B", Modifier.fontWeight(600).fontSize(FontSize.Larger).color(
                                    when (ColorMode.current) {
                                        ColorMode.LIGHT -> Color.rgb(0x282828)
                                        ColorMode.DARK -> Color.rgb(0xEBDBB2)
                                    }
                                )
                            )
                            Spacer()
                            Column(Modifier.gap(0.cssRem)){
                                SpanText(
                                    "I am Shubham Gorai", Modifier.fontWeight(400).fontSize(2.cssRem).color(
                                        when (ColorMode.current) {
                                            ColorMode.LIGHT -> Color.rgb(0x282828)
                                            ColorMode.DARK -> Color.rgb(0xEBDBB2)
                                        }
                                    )
                                )
                                Spacer()
                                SpanText(
                                    "Aspiring Android Developer", Modifier.fontStyle(FontStyle.Italic).fontWeight(50).fontSize(1.2.cssRem).color(
                                        when (ColorMode.current) {
                                            ColorMode.LIGHT -> Color.rgb(0x282828)
                                            ColorMode.DARK -> Color.rgb(0xEBDBB2)
                                        }
                                    )
                                )
                            }
                        }
                    }
                    Div (HeadlineTextStyle.toAttrs()){
                        LinkButton("https://www.github.com/shub39", Modifier.margin(right = 8.px)){
                            FaGithub()
                        }
                        LinkButton("https://www.linkedin.com/in/shub39/", Modifier.margin(8.px)){
                            FaLinkedin()
                        }
                        LinkButton("https://www.youtube.com/channel/UCCp8mT5pZcySIvhDOZPYDmw", Modifier.margin(8.px)){
                            FaYoutube()
                        }
                    }
                }
            }
        }
    }
}
