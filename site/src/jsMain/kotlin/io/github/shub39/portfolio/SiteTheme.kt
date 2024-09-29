package io.github.shub39.portfolio

import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.silk.init.InitSilk
import com.varabyte.kobweb.silk.init.InitSilkContext
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobweb.silk.theme.colors.palette.background
import com.varabyte.kobweb.silk.theme.colors.palette.color

class SitePalette(
    val nearBackground: Color = Color.rgb(0x282828),
    val dark0Hard: Color = Color.rgb(0x28, 0x28, 0x28),
    val dark0: Color = Color.rgb(0x3C, 0x38, 0x36),
    val dark0Soft: Color = Color.rgb(0x50, 0x49, 0x45),
    val dark1: Color = Color.rgb(0x66, 0x5C, 0x54),
    val dark2: Color = Color.rgb(0x7C, 0x6F, 0x64),
    val dark3: Color = Color.rgb(0x92, 0x83, 0x74),
    val dark4: Color = Color.rgb(0xA8, 0x99, 0x84),
    val light0Hard: Color = Color.rgb(0xEB, 0xDB, 0xB2),
    val light0: Color = Color.rgb(0xFB, 0xF1, 0xC7),
    val light0Soft: Color = Color.rgb(0xF2, 0xE5, 0xBC),
    val light1: Color = Color.rgb(0xD5, 0xC4, 0xA1),
    val light2: Color = Color.rgb(0xBD, 0xAE, 0x93),
    val light3: Color = Color.rgb(0xA8, 0x99, 0x84),
    val light4: Color = Color.rgb(0x92, 0x83, 0x74),
    val brightRed: Color = Color.rgb(0xFB, 0x49, 0x34),
    val brightGreen: Color = Color.rgb(0xB8, 0xBB, 0x26),
    val brightYellow: Color = Color.rgb(0xFA, 0xBD, 0x2F),
    val brightBlue: Color = Color.rgb(0x83, 0xA5, 0x98),
    val brightPurple: Color = Color.rgb(0xD3, 0x86, 0x9B),
    val brightAqua: Color = Color.rgb(0x8E, 0xC0, 0x7C),
    val brightOrange: Color = Color.rgb(0xFE, 0x80, 0x19),
    val neutralRed: Color = Color.rgb(0xCC, 0x24, 0x1D),
    val neutralGreen: Color = Color.rgb(0x98, 0x97, 0x1A),
    val neutralYellow: Color = Color.rgb(0xD7, 0x99, 0x21),
    val neutralBlue: Color = Color.rgb(0x45, 0x85, 0x88),
    val neutralPurple: Color = Color.rgb(0xB1, 0x62, 0x86),
    val neutralAqua: Color = Color.rgb(0x68, 0x9D, 0x6A),
    val neutralOrange: Color = Color.rgb(0xD6, 0x5D, 0x0E),
    val fadedRed: Color = Color.rgb(0x9D, 0x00, 0x06),
    val fadedGreen: Color = Color.rgb(0x79, 0x74, 0x0E),
    val fadedYellow: Color = Color.rgb(0xB5, 0x76, 0x14),
    val fadedBlue: Color = Color.rgb(0x07, 0x66, 0x78),
    val fadedPurple: Color = Color.rgb(0x8F, 0x3F, 0x71),
    val fadedAqua: Color = Color.rgb(0x42, 0x7B, 0x58),
    val fadedOrange: Color = Color.rgb(0xAF, 0x3A, 0x03),
)

object SitePalettes {
    val dark = SitePalette()
}

fun ColorMode.toSitePalette(): SitePalette {
    return SitePalettes.dark
}

@InitSilk
fun initTheme(ctx: InitSilkContext) {
    ctx.theme.palettes.dark.background = Color.rgb(0x28, 0x28, 0x28)
    ctx.theme.palettes.dark.color = Color.rgb(0xEB, 0xDB, 0xB2)
}
