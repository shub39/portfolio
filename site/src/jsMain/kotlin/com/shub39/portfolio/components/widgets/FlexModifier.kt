package com.shub39.portfolio.components.widgets

import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.display
import com.varabyte.kobweb.compose.ui.modifiers.flexWrap
import com.varabyte.kobweb.compose.ui.modifiers.justifyContent
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.FlexWrap
import org.jetbrains.compose.web.css.JustifyContent

fun flexModifier(): Modifier {
    return Modifier.display(DisplayStyle.Flex)
        .flexWrap(FlexWrap.Wrap)
        .justifyContent(JustifyContent.FlexStart)
}