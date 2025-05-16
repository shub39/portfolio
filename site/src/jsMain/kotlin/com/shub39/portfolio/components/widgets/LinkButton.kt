package com.shub39.portfolio.components.widgets

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.border
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.cssRem

@Composable
fun LinkButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    IconButton(
        onClick = onClick,
        modifier = modifier
            .border(
                width = 0.1.cssRem,
                style = LineStyle.Dashed
            ),
        content = content
    )
}