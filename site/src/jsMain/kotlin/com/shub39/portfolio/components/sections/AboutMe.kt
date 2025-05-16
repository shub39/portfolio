package com.shub39.portfolio.components.sections

import androidx.compose.runtime.Composable
import com.shub39.portfolio.SitePalette
import com.shub39.portfolio.components.widgets.Terminal
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.opacity
import com.varabyte.kobweb.silk.components.text.SpanText

@Composable
fun AboutMe(palette: SitePalette) {
    Terminal(
        command = "cat about.txt"
    ) {
        SpanText(
            text = "Shubham Gorai",
            modifier = Modifier
                .fontSize(FontSize.XXLarge)
                .fontWeight(FontWeight.Bold)
                .color(palette.brand.accent)
        )

        SpanText(
            text = "B.Tech CSE student and Android dev from India",
            modifier = Modifier
                .fontSize(FontSize.Large)
                .opacity(0.8f)
                .fontWeight(FontWeight.Bold)
        )
    }
}