package io.github.shub39.portfolio.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.icons.fa.FaAndroid
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.layout.breakpoint.displayIfAtLeast
import com.varabyte.kobweb.silk.components.layout.breakpoint.displayUntil
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.*

@Composable
fun Intro() {
    Column(
        modifier = Modifier
            .padding(1.cssRem)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            Modifier
                .gap(1.5.cssRem)
                .displayIfAtLeast(Breakpoint.MD),
            verticalAlignment = Alignment.CenterVertically
        ) {
            FaAndroid(size = IconSize.X10)
        }
        Column(
            Modifier
                .fontSize(1.5.cssRem)
                .gap(1.cssRem)
                .displayUntil(Breakpoint.MD),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            FaAndroid(size = IconSize.X10)
        }
        SpanText(
            text = "Hello I'm Shubham!",
            modifier = Modifier
                .fontWeight(FontWeight.Bold)
                .fontSize(FontSize.XLarge)
                .textAlign(TextAlign.Center)
        )
        SpanText(
            text = "beginner Android developer and Linux nerd",
            modifier = Modifier
                .fontSize(FontSize.Large)
                .textAlign(TextAlign.Center)
        )
    }
}