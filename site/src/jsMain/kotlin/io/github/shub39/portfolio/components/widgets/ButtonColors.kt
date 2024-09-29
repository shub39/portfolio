package io.github.shub39.portfolio.components.widgets

import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.silk.components.forms.ButtonKind
import com.varabyte.kobweb.silk.components.forms.ButtonStyle
import com.varabyte.kobweb.silk.style.CssStyleVariant
import com.varabyte.kobweb.silk.style.addVariant
import com.varabyte.kobweb.silk.style.selectors.hover
import io.github.shub39.portfolio.toSitePalette
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

object ButtonColors {
    val OrangeButton: CssStyleVariant<ButtonKind> = ButtonStyle.addVariant {
        val color = colorMode.toSitePalette()
        base {
            Modifier
                .backgroundColor(color.brightOrange)
                .color(color.dark0Hard)
        }
        hover {
            Modifier
                .backgroundColor(color.fadedOrange)
        }
    }

    val GreenButton: CssStyleVariant<ButtonKind> = ButtonStyle.addVariant {
        val color = colorMode.toSitePalette()
        base {
            Modifier
                .backgroundColor(color.brightGreen)
                .color(color.dark0Hard)
        }
        hover {
            Modifier
                .backgroundColor(color.fadedGreen)
        }
    }

    val NormalButton: CssStyleVariant<ButtonKind> = ButtonStyle.addVariant {
        val color = colorMode.toSitePalette()
        base {
            Modifier
                .backgroundColor(color.light0Hard)
                .color(color.dark0Hard)
        }
        hover {
            Modifier
                .backgroundColor(color.light4)
        }
    }

    val ClearButton: CssStyleVariant<ButtonKind> = ButtonStyle.addVariant {
        val color = colorMode.toSitePalette()
        base {
            Modifier
                .backgroundColor(color.dark0Hard)
                .color(color.light0Hard)
        }
        hover {
            Modifier
                .backgroundColor(color.dark0Soft)
        }
    }
}

enum class ButtonShape {
    RECTANGLE,
    CIRCLE
}

fun getButtonModifier(shape: ButtonShape): Modifier {
    return Modifier.padding(0.px).then(if (shape == ButtonShape.CIRCLE) {
        Modifier.borderRadius(50.percent)
    } else {
        Modifier.padding(12.px).borderRadius(8.px)
    })
}