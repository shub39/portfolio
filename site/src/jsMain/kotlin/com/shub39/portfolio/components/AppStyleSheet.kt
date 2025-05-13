package com.shub39.portfolio.components

import com.varabyte.kobweb.compose.css.AlignItems
import com.varabyte.kobweb.compose.css.JustifyContent
import com.varabyte.kobweb.compose.css.alignItems
import com.varabyte.kobweb.compose.css.justifyContent
import com.varabyte.kobweb.compose.css.margin
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.StyleSheet
import org.jetbrains.compose.web.css.backgroundColor
import org.jetbrains.compose.web.css.color
import org.jetbrains.compose.web.css.display
import org.jetbrains.compose.web.css.fontFamily
import org.jetbrains.compose.web.css.fontSize
import org.jetbrains.compose.web.css.fontWeight
import org.jetbrains.compose.web.css.marginLeft
import org.jetbrains.compose.web.css.marginTop
import org.jetbrains.compose.web.css.maxWidth
import org.jetbrains.compose.web.css.padding
import org.jetbrains.compose.web.css.paddingBottom
import org.jetbrains.compose.web.css.paddingTop
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.textAlign
import org.jetbrains.compose.web.css.textDecoration

object AppStylesheet : StyleSheet() {
    val container by style {
        fontFamily("Segoe UI", "sans-serif")
        backgroundColor(Color("#f8f9fa"))
        color(Color("#212529"))
        padding(32.px)
    }

    val header by style {
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.SpaceBetween)
        alignItems(AlignItems.Center)
        paddingBottom(24.px)
    }

    val navLink by style {
        marginLeft(16.px)
        color(Color("#007bff"))
        textDecoration("none")
        fontWeight("bold")
        hover {
            textDecoration("underline")
        }
    }

    val hero by style {
        textAlign("center")
        paddingTop(64.px)
        paddingBottom(64.px)
    }

    val heading by style {
        fontSize(48.px)
        fontWeight("bold")
    }

    val subheading by style {
        fontSize(20.px)
        color(Color.gray)
    }

    val about by style {
        maxWidth(800.px)
        textAlign("center")
    }

    val footer by style {
        marginTop(64.px)
        fontSize(14.px)
        textAlign("center")
        color(Color("#6c757d"))
    }
}