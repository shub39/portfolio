package com.shub39.portfolio.components.sections

import androidx.compose.runtime.Composable
import com.shub39.portfolio.components.widgets.LinkButton
import com.shub39.portfolio.components.widgets.Terminal
import com.shub39.portfolio.components.widgets.flexModifier
import com.shub39.portfolio.data.SOCIAL_LINKS
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fontFamily
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.core.PageContext
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.cssRem

@Composable
fun Contacts(ctx: PageContext) {
    Terminal(
        command = "ls contact"
    ) {
        Row(
            modifier = flexModifier()
        ) {
            SOCIAL_LINKS.forEach { link ->
                LinkButton(
                    onClick = { ctx.router.navigateTo(link.link) },
                    modifier = Modifier
                        .margin(right = 0.6.cssRem, top = 0.3.cssRem, bottom = 0.3.cssRem)
                        .padding(0.5.cssRem)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(0.4.cssRem)
                    ) {
                        link.icon()
                        SpanText(
                            text = link.name,
                            modifier = Modifier
                                .fontFamily("JetBrains Mono")
                                .fontSize(FontSize.Medium)
                        )
                    }
                }
            }
        }
    }
}