package io.github.shub39.portfolio.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import io.github.shub39.portfolio.components.widgets.LinkButton
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px

@Composable
fun SocialLinksRow() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .borderRadius(1.cssRem)
    ) {
        SocialLinkButton(
            "https://www.github.com/shub39"
        ) { FaGithub(size = IconSize.XXL) }
        SocialLinkButton(
            "https://t.me/shub39"
        ) { FaTelegram(size = IconSize.XXL) }
        SocialLinkButton(
            "https://www.linkedin.com/in/shub39/"
        ) { FaLinkedin(size = IconSize.XXL) }
        SocialLinkButton(
            "mailto:cptnshubham39@gmail.com"
        ) { FaEnvelope(size = IconSize.XXL) }
    }
}

@Composable
private fun SocialLinkButton(url: String, icon: @Composable () -> Unit) {
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