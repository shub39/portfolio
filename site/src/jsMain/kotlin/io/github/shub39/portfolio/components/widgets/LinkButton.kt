package io.github.shub39.portfolio.components.widgets

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.forms.ButtonKind
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.CssStyleVariant

@Composable
fun ThemedButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    text: String? = null,
    shape: ButtonShape = ButtonShape.RECTANGLE,
    colors: CssStyleVariant<ButtonKind>,
    content: @Composable () -> Unit = {}
) {
    Button(
        onClick = { onClick() },
        modifier.then(getButtonModifier(shape)),
        colors
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
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
    modifier: Modifier = Modifier,
    text: String? = null,
    shape: ButtonShape = ButtonShape.RECTANGLE,
    colors: CssStyleVariant<ButtonKind> = ButtonColors.NormalButton,
    content: @Composable () -> Unit = {}
) {
    val ctx = rememberPageContext()

    ThemedButton(
        onClick = { ctx.router.navigateTo(path) },
        modifier = modifier,
        text = text,
        shape = shape,
        colors = colors,
        content = content
    )
}