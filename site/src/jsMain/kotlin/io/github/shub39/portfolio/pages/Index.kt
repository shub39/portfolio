package io.github.shub39.portfolio.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontStyle
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.varabyte.kobweb.silk.components.style.toAttrs
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import io.github.shub39.portfolio.HeadlineTextStyle
import io.github.shub39.portfolio.components.layouts.PageLayout
import io.github.shub39.portfolio.components.widgets.LinkButton
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div

@Page
@Composable
fun HomePage() {
    PageLayout("Home") {
        Row {
            Box {
                Column(Modifier.gap(2.cssRem).borderRadius(3.cssRem).padding(all = 3.cssRem).backgroundColor(
                    when (ColorMode.current){
                        ColorMode.LIGHT -> Color.rgb(0x282828)
                        ColorMode.DARK -> Color.rgb(0xEBDBB2)
                    }
                ).color(
                    when (ColorMode.current){
                        ColorMode.LIGHT -> Color.rgb(0xEBDBB2)
                        ColorMode.DARK -> Color.rgb(0x282828)
                    }
                )){
                    Column(Modifier.gap(1.cssRem)){
                        Div(HeadlineTextStyle.toAttrs()) {
                            SpanText(
                                "Hello!", Modifier.fontWeight(600).fontSize(FontSize.Larger)
                            )
                            Spacer()
                            Column(Modifier.gap(0.cssRem)){
                                SpanText(
                                    "I am Shubham Gorai", Modifier.fontWeight(400).fontSize(2.cssRem)
                                )
                                Spacer()
                                SpanText(
                                    "Aspiring Android Developer", Modifier.fontStyle(FontStyle.Italic).fontWeight(50).fontSize(1.2.cssRem)
                                )
                            }
                        }
                    }
                    Row(Modifier.padding(all = 0.1.cssRem).borderRadius(1.cssRem).backgroundColor(
                        when (ColorMode.current){
                            ColorMode.LIGHT -> Color.rgb(0xEBDBB2)
                            ColorMode.DARK -> Color.rgb(0x282828)
                        }
                    )){
                        LinkButton("https://www.github.com/shub39", Modifier.margin(left = 8.px, top = 8.px, bottom = 8.px)){
                            FaGithub(Modifier)
                        }
                        LinkButton("https://www.youtube.com/channel/UCCp8mT5pZcySIvhDOZPYDmw", Modifier.margin(left = 8.px, top = 8.px, bottom = 8.px)){
                            FaYoutube()
                        }
                        LinkButton("https://www.reddit.com/user/PrimalWrongdoer/", Modifier.margin(left = 8.px, top = 8.px, bottom = 8.px)){
                            FaReddit()
                        }
                        LinkButton("https://www.discordapp.com/users/1125393715612094514", Modifier.margin(left = 8.px, top = 8.px, bottom = 8.px )){
                            FaDiscord()
                        }
                        LinkButton("https://www.linkedin.com/in/shub39/", Modifier.margin(left = 8.px, top = 8.px, bottom = 8.px, right = 8.px)){
                            FaLinkedin()
                        }
                    }
                }
            }
        }
    }
}
