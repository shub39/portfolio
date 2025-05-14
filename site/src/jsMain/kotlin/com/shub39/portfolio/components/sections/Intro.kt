package com.shub39.portfolio.components.sections

import androidx.compose.runtime.Composable
import com.shub39.portfolio.HeadlineTextStyle
import com.shub39.portfolio.SubheadlineTextStyle
import com.shub39.portfolio.components.widgets.IconButton
import com.shub39.portfolio.toSitePalette
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.icons.fa.FaGithub
import com.varabyte.kobweb.silk.components.icons.fa.FaLinkedin
import com.varabyte.kobweb.silk.components.icons.fa.FaTwitter
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toAttrs
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import kotlinx.browser.window
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div

@Composable
fun Intro() {
    val ctx = rememberPageContext()

    Column(
        modifier = Modifier.height(window.innerHeight.px).id("home"),
        verticalArrangement = Arrangement.Center
    ) {
        Div(HeadlineTextStyle.toAttrs()) {
            SpanText("Shubham Gorai")
        }

        Div(SubheadlineTextStyle.toAttrs()) {
            SpanText("Android dev and Linux nerd from India")
        }

        Row(
            modifier = Modifier
                .margin(top = 2.cssRem)
                .border(
                    width = 0.3.cssRem,
                    style = LineStyle.Dashed,
                    color = ColorMode.current.toSitePalette().brand.accent
                )
        ) {
            IconButton(
                onClick = {
                    ctx.router.navigateTo("https://github.com/shub39")
                }
            ) {
                FaGithub(size = IconSize.LG)
            }

            IconButton(
                onClick = {
                    ctx.router.navigateTo("https://www.linkedin.com/in/shub39/")
                }
            ) {
                FaLinkedin(size = IconSize.LG)
            }

            IconButton(
                onClick = {
                    ctx.router.navigateTo("https://x.com/_shub39")
                }
            ) {
                FaTwitter()
            }
        }
    }
}