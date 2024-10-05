package io.github.shub39.portfolio.components.widgets

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.onMouseEnter
import com.varabyte.kobweb.compose.ui.modifiers.onMouseLeave
import com.varabyte.kobweb.compose.ui.modifiers.opacity
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.icons.fa.FaCircleCheck
import com.varabyte.kobweb.silk.components.icons.fa.FaCopy
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import kotlinx.browser.window
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.s

@Composable
fun ColorButton(c: Color, copyMode: MutableState<String>) {
    var isHovered = remember { mutableStateOf(false) }
    var isCopied = remember { mutableStateOf(false) }

    Button(
        onClick = {
            copyToClipboard(
                when (copyMode.value) {
                    "RGB" -> c.toRgb().toString()
                    "HEX" -> rgbToHex(c.toRgb())
                    else -> c.toHsl().toString()
                }
            )

            isCopied.value = true
        },
        modifier = Modifier
            .backgroundColor(c)
            .size(90.px)
            .borderRadius(0.px)
            .onMouseEnter { isHovered.value = true }
            .onMouseLeave {
                isHovered.value = false
                isCopied.value = false
            },
    ) {
        if (!isCopied.value) {
            FaCopy(
                modifier = Modifier
                    .color(c.darkened(0.5f))
                    .opacity(if (isHovered.value) 1.0 else 0.0)
                    .transition(Transition.of("opacity", 0.3.s)),
                size = IconSize.XL
            )
        } else {
            FaCircleCheck(
                modifier = Modifier
                    .color(c.darkened(0.5f))
                    .opacity(if (isHovered.value) 1.0 else 0.0)
                    .transition(Transition.of("opacity", 0.3.s)),
                size = IconSize.XL
            )
        }
    }
}

private fun copyToClipboard(text: String) {
    window.navigator.clipboard.writeText(text)
}

private fun rgbToHex(color: Color.Rgb): String {
    return "#${color.red.toString(16).padStart(2, '0').uppercase()}${
        color.green.toString(16).padStart(2, '0').uppercase()
    }${color.blue.toString(16).padStart(2, '0').uppercase()}"
}