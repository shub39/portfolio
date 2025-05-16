package com.shub39.portfolio.components.widgets

import androidx.compose.runtime.Composable
import com.shub39.portfolio.data.Skill
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.opacity
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.cssRem

@Composable
fun SkillBox(
    skills: Skill
) {
    Row(
        modifier = Modifier
            .margin(right = 0.6.cssRem, top = 0.3.cssRem, bottom = 0.3.cssRem)
            .padding(0.5.cssRem)
            .opacity(0.8f)
            .border(
                width = 0.1.cssRem,
                style = LineStyle.Solid
            )
    ) {
        SpanText(
            text = skills.string,
            modifier = Modifier
                .fontWeight(FontWeight.Bold)
                .fontSize(FontSize.Small)
        )
    }
}