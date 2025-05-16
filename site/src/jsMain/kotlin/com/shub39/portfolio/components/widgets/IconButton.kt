package com.shub39.portfolio.components.widgets

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.setVariable
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.forms.ButtonVars
import org.jetbrains.compose.web.css.em
import com.shub39.portfolio.ButtonVariant
import com.shub39.portfolio.UncoloredButtonVariant

@Composable
fun IconButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Button(
        onClick = { onClick() },
        modifier = modifier.setVariable(ButtonVars.FontSize, 1.em),
        variant = ButtonVariant.then(UncoloredButtonVariant)
    ) {
        content()
    }
}
