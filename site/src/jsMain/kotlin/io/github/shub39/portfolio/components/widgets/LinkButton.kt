package io.github.shub39.portfolio.components.widgets

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.forms.ButtonStyle
import com.varabyte.kobweb.silk.style.addVariant
import com.varabyte.kobweb.silk.style.selectors.hover
import com.varabyte.kobweb.silk.components.text.SpanText
import io.github.shub39.portfolio.toSitePalette
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

enum class ButtonShape {
    RECTANGLE,
    CIRCLE
}

private fun getButtonModifier(shape: ButtonShape): Modifier {
    return Modifier.padding(0.px).then(if (shape == ButtonShape.CIRCLE) {
        Modifier.borderRadius(50.percent)
    } else {
        Modifier.padding(12.px).borderRadius(8.px)
    })
}

val PrimaryButtonVariant = ButtonStyle.addVariant {
    val color = colorMode.toSitePalette()
    base {
        Modifier
            .backgroundColor(color.brand.brightOrange)
            .color(color.brand.dark0Hard)
    }

    hover {
        Modifier.backgroundColor(color.brand.light0Soft)
    }
}

val NormalButtonVariant = ButtonStyle.addVariant {
    val color = colorMode.toSitePalette()
    base {
        Modifier
            .backgroundColor(color.brand.brightGreen)
            .color(color.brand.dark0Hard)
    }
    hover {
        Modifier.backgroundColor(color.brand.fadedGreen)
    }
}

@Composable
fun ThemedButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    text: String? = null,
    shape: ButtonShape = ButtonShape.RECTANGLE,
    primary: Boolean = false,
    content: @Composable () -> Unit = {}
) {
    Button(
        onClick = { onClick() },
        modifier.then(getButtonModifier(shape)),
        if (primary) PrimaryButtonVariant else NormalButtonVariant
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
    primary: Boolean = false,
    content: @Composable () -> Unit = {}
) {
    val ctx = rememberPageContext()
    ThemedButton(onClick = { ctx.router.navigateTo(path) }, modifier, text, shape, primary, content = content)
}