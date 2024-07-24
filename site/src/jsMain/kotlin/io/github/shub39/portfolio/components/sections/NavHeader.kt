package io.github.shub39.portfolio.components.sections

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.base
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.*

val NavHeaderStyle by ComponentStyle.base {
    Modifier.fillMaxWidth().padding(1.cssRem)
}

@Composable
fun NavHeader() {
    Row(NavHeaderStyle.toModifier(), verticalAlignment = Alignment.CenterVertically) {

        Spacer()

        // Todo: Navigation Icons
    }
}