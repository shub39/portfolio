package com.shub39.portfolio

import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.silk.init.InitSilk
import com.varabyte.kobweb.silk.init.InitSilkContext
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobweb.silk.theme.colors.palette.background
import com.varabyte.kobweb.silk.theme.colors.palette.color

class SitePalette(
    val nearBackground: Color,
    val brand: Brand,
) {
    class Brand(
        val primary: Color = Color.rgb(0x3C83EF),
        val accent: Color = Color.rgb(0xF3DB5B),
    )
}

object SitePalettes {
    val light = SitePalette(
        nearBackground = Color.rgb(0xFBF1C7),
        brand = SitePalette.Brand(
            primary = Color.rgb(0x458588),
            accent = Color.rgb(0xD65D0E),
        )
    )
    val dark = SitePalette(
        nearBackground = Color.rgb(0x282828),
        brand = SitePalette.Brand(
            primary = Color.rgb(0x83A598),
            accent = Color.rgb(0xFE8019),
        )
    )
}

fun ColorMode.toSitePalette(): SitePalette {
    return when (this) {
        ColorMode.LIGHT -> SitePalettes.light
        ColorMode.DARK -> SitePalettes.dark
    }
}

@InitSilk
fun initTheme(ctx: InitSilkContext) {
    ctx.theme.palettes.light.background = Color.rgb(0xFBF1C7)
    ctx.theme.palettes.light.color = Color.rgb(0x3C3836)
    ctx.theme.palettes.dark.background = Color.rgb(0x282828)
    ctx.theme.palettes.dark.color = Color.rgb(0xFBF1C7)
}

