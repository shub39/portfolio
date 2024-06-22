package io.github.shub39.portfolio.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import io.github.shub39.portfolio.components.widgets.LinkButton
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px

@Composable
fun Contact() {
    Row(
        modifier = Modifier.padding(topBottom = 1.cssRem).fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .gap(1.cssRem)
                .fillMaxWidth()
                .borderRadius(1.cssRem)
                .padding(2.cssRem)

        ) {
            Column(
                modifier = Modifier
                    .gap(0.1.cssRem)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                SpanText(
                    "Contact me",
                    Modifier
                        .fontWeight(600)
                        .fontSize(FontSize.XLarge)
                )
                SpanText(
                    "cptnshubham39@gmail.com",
                    Modifier
                        .fontWeight(300)
                        .fontSize(FontSize.Large)
                )
            }
            SocialLinksRow()
        }
    }
}

@Composable
fun SocialLinksRow() {
    Row(
        modifier = Modifier
            .padding(0.1.cssRem)
            .fillMaxWidth()
            .borderRadius(1.cssRem),
        horizontalArrangement = Arrangement.Center
    ) {
        SocialLinkButton(
            "https://www.github.com/shub39"
        ) { FaGithub(size = IconSize.XXL) }
        SocialLinkButton(
            "https://www.youtube.com/channel/UCCp8mT5pZcySIvhDOZPYDmw"
        ) { FaYoutube(size = IconSize.XXL) }
        SocialLinkButton(
            "https://www.discordapp.com/users/1125393715612094514"
        ) { FaDiscord(size = IconSize.XXL) }
        SocialLinkButton(
            "https://t.me/shub39"
        ) { FaTelegram(size = IconSize.XXL) }
        SocialLinkButton(
            "https://www.linkedin.com/in/shub39/"
        ) { FaLinkedin(size = IconSize.XXL) }
    }
}

@Composable
fun SocialLinkButton(url: String, icon: @Composable () -> Unit) {
    LinkButton(
        url,
        Modifier.margin(topBottom = 4.px, leftRight = 4.px).color(
            when (ColorMode.current) {
                ColorMode.LIGHT -> Color.rgb(0x282828)
                ColorMode.DARK -> Color.rgb(0xEBDBB2)
            }
        )
            .backgroundColor(
                when (ColorMode.current) {
                    ColorMode.LIGHT -> Color.rgb(0xEBDBB2)
                    ColorMode.DARK -> Color.rgb(0x282828)
                }
            )
    ) {
        icon()
    }
}