package io.github.shub39.portfolio.components.sections

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fontFamily
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.breakpoint.displayIfAtLeast
import com.varabyte.kobweb.silk.style.breakpoint.displayUntil
import io.github.shub39.portfolio.components.widgets.ButtonColors
import io.github.shub39.portfolio.components.widgets.ColorButton
import io.github.shub39.portfolio.components.widgets.ThemedButton
import org.jetbrains.compose.web.css.cssRem

@Composable
fun ColorPicker() {
    var copyMode = remember { mutableStateOf("HEX") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(2.cssRem),
        contentAlignment = Alignment.Center
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(1.cssRem),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.displayUntil(Breakpoint.XL)
        ) {
            SpanText(
                text = "Gruvbox Color Picker",
                modifier = Modifier
                    .fontWeight(FontWeight.Bold)
                    .fontSize(FontSize.XLarge)
                    .margin(bottom = 1.cssRem)
            )

            Row(
                horizontalArrangement = Arrangement.spacedBy(1.cssRem)
            ) {
                listOf("RGB", "HEX", "HSL").forEachIndexed { _, a ->
                    ThemedButton(
                        onClick = { copyMode.value = a },
                        colors = when (copyMode.value) {
                            a -> ButtonColors.NormalButton
                            else -> ButtonColors.ClearButton
                        },
                        modifier = Modifier
                            .fontFamily("Poppins")
                            .margin(bottom = 1.cssRem)
                    ) {
                        SpanText(a)
                    }
                }
            }

            Column {
                gruvboxColors.forEachIndexed { _, row ->
                    Row {
                        row.forEachIndexed { _, c ->
                            ColorButton(c, copyMode)
                        }
                    }
                }
            }
        }

        Column(
            verticalArrangement = Arrangement.spacedBy(1.cssRem),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.displayIfAtLeast(Breakpoint.XL)
        ) {
            SpanText(
                text = "Gruvbox Color Picker",
                modifier = Modifier
                    .fontWeight(FontWeight.Bold)
                    .fontSize(FontSize.XLarge)
                    .margin(bottom = 1.cssRem)
            )

            Row(
                horizontalArrangement = Arrangement.spacedBy(1.cssRem)
            ) {
                listOf("RGB", "HEX", "HSL").forEachIndexed { _, a ->
                    ThemedButton(
                        onClick = { copyMode.value = a },
                        colors = when (copyMode.value) {
                            a -> ButtonColors.NormalButton
                            else -> ButtonColors.ClearButton
                        },
                        modifier = Modifier
                            .fontFamily("Poppins")
                            .margin(bottom = 1.cssRem)
                    ) {
                        SpanText(a)
                    }
                }
            }

            Row {
                gruvboxColors.forEachIndexed { _, row ->
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        row.forEachIndexed { _, c ->
                            ColorButton(c, copyMode)
                        }
                    }
                }
            }
        }
    }

}

private val gruvboxColors = listOf(
    listOf(
        Color.rgb(0x50, 0x49, 0x45),  // dark0Soft
        Color.rgb(0x3C, 0x38, 0x36),  // dark0
        Color.rgb(0x28, 0x28, 0x28),  // dark0Hard
    ),
    listOf(
        Color.rgb(0x7C, 0x6F, 0x64),  // dark2
        Color.rgb(0x92, 0x83, 0x74),  // dark3
        Color.rgb(0xA8, 0x99, 0x84),  // dark4
    ),
    listOf(
        Color.rgb(0xFB, 0xF1, 0xC7),  // light0
        Color.rgb(0xF2, 0xE5, 0xBC),  // light0Soft
        Color.rgb(0xD5, 0xC4, 0xA1),  // light1
    ),
    listOf(
        Color.rgb(0xBD, 0xAE, 0x93),  // light2
        Color.rgb(0xA8, 0x99, 0x84),  // light3
        Color.rgb(0x92, 0x83, 0x74),  // light4
    ),
    listOf(
        Color.rgb(0xFB, 0x49, 0x34),  // brightRed
        Color.rgb(0xCC, 0x24, 0x1D),  // neutralRed
        Color.rgb(0x9D, 0x00, 0x06)   // fadedRed
    ),
    // Green Shades: brightGreen, neutralGreen, fadedGreen
    listOf(
        Color.rgb(0xB8, 0xBB, 0x26),  // brightGreen
        Color.rgb(0x98, 0x97, 0x1A),  // neutralGreen
        Color.rgb(0x79, 0x74, 0x0E)   // fadedGreen
    ),
    // Yellow Shades: brightYellow, neutralYellow, fadedYellow
    listOf(
        Color.rgb(0xFA, 0xBD, 0x2F),  // brightYellow
        Color.rgb(0xD7, 0x99, 0x21),  // neutralYellow
        Color.rgb(0xB5, 0x76, 0x14)   // fadedYellow
    ),
    // Blue Shades: brightBlue, neutralBlue, fadedBlue
    listOf(
        Color.rgb(0x83, 0xA5, 0x98),  // brightBlue
        Color.rgb(0x45, 0x85, 0x88),  // neutralBlue
        Color.rgb(0x07, 0x66, 0x78)   // fadedBlue
    ),
    // Purple Shades: brightPurple, neutralPurple, fadedPurple
    listOf(
        Color.rgb(0xD3, 0x86, 0x9B),  // brightPurple
        Color.rgb(0xB1, 0x62, 0x86),  // neutralPurple
        Color.rgb(0x8F, 0x3F, 0x71)   // fadedPurple
    ),
    // Aqua Shades: brightAqua, neutralAqua, fadedAqua
    listOf(
        Color.rgb(0x8E, 0xC0, 0x7C),  // brightAqua
        Color.rgb(0x68, 0x9D, 0x6A),  // neutralAqua
        Color.rgb(0x42, 0x7B, 0x58)   // fadedAqua
    ),
    // Orange Shades: brightOrange, neutralOrange, fadedOrange
    listOf(
        Color.rgb(0xFE, 0x80, 0x19),  // brightOrange
        Color.rgb(0xD6, 0x5D, 0x0E),  // neutralOrange
        Color.rgb(0xAF, 0x3A, 0x03)   // fadedOrange
    )
)