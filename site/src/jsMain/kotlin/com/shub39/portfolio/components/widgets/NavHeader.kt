package com.shub39.portfolio.components.widgets

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.varabyte.kobweb.compose.css.functions.blur
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backdropFilter
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.components.icons.MoonIcon
import com.varabyte.kobweb.silk.components.icons.SunIcon
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px

val NavHeaderStyle = CssStyle {
    base {
        Modifier
            .fillMaxWidth()
            .padding(topBottom = 1.cssRem, leftRight = 2.cssRem)
            .backdropFilter(blur(12.px))
            .styleModifier {
                property("-webkit-backdrop-filter", "blur( 12px )")
            }
    }

    Breakpoint.MD { Modifier.maxWidth(60.cssRem) }
}

@Composable
private fun ColorModeButton() {
    var colorMode by ColorMode.currentState
    IconButton(onClick = { colorMode = colorMode.opposite }) {
        if (colorMode.isLight) MoonIcon() else SunIcon()
    }
}

@Composable
fun NavHeader(modifier: Modifier) {
    Row(
        modifier = NavHeaderStyle.toModifier().then(modifier),
        verticalAlignment = Alignment.CenterVertically
    ) {
        SpanText("{shub39}")

        Spacer()

        ColorModeButton()
    }
}