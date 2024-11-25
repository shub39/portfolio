package io.github.shub39.portfolio.components.widgets

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.padding
import org.jetbrains.compose.web.css.cssRem

@Composable
fun Spacer(modifier: Modifier = Modifier.padding(1.cssRem)) {
    Box(modifier)
}