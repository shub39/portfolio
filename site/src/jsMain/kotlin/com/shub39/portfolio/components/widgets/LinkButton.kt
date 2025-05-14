package com.shub39.portfolio.components.widgets


import androidx.compose.runtime.Composable
import com.shub39.portfolio.toSitePalette
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fontFamily
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.attributes.ButtonType
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px

@Composable
fun ThemedButton(
    onClick: () -> Unit,
    text: String? = null,
    selected: Boolean,
    content: @Composable () -> Unit = {}
) {
    val palette = ColorMode.current.toSitePalette()

    Button(
        onClick = { onClick() },
        modifier = Modifier
            .backgroundColor(
                if (!selected) palette.nearBackground else palette.brand.primary
            )
            .color(
                if (!selected) palette.brand.primary else palette.nearBackground
            )
            .fontFamily("JetBrains Mono")
            .borderRadius(0.px)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(0.3.cssRem)
        ) {
            content()

            if (!text.isNullOrEmpty()) {
                SpanText(text)
            }
        }
    }
}

@Composable
fun LinkButton(
    path: String,
    text: String? = null,
    selected: Boolean,
    content: @Composable () -> Unit = {}
) {
    val ctx = rememberPageContext()

    ThemedButton(
        onClick = { ctx.router.navigateTo(path) },
        text = text,
        selected = selected,
        content = content
    )
}