package com.shub39.portfolio.components.sections

import androidx.compose.runtime.Composable
import com.shub39.portfolio.SitePalette
import com.shub39.portfolio.components.widgets.LinkButton
import com.shub39.portfolio.components.widgets.SkillBox
import com.shub39.portfolio.components.widgets.Terminal
import com.shub39.portfolio.components.widgets.flexModifier
import com.shub39.portfolio.data.PROJECTS
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.opacity
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.core.PageContext
import com.varabyte.kobweb.silk.components.icons.fa.FaGithub
import com.varabyte.kobweb.silk.components.icons.fa.FaStar
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.cssRem

@Composable
fun Projects(palette: SitePalette, ctx: PageContext) {
    Terminal(
        command = "cat projects/others.txt"
    ) {
        SpanText(
            text = "Other Projects",
            modifier = Modifier
                .fontSize(FontSize.XLarge)
                .fontWeight(FontWeight.Bold)
                .color(palette.brand.accent)
        )

        PROJECTS.forEach { project ->
            Column(
                modifier = Modifier
                    .margin(topBottom = 0.3.cssRem)
                    .padding(topBottom = 0.5.cssRem)
            ) {
                SpanText(
                    text = project.name,
                    modifier = Modifier
                        .color(palette.brand.primary)
                        .fontWeight(FontWeight.Bold)
                        .fontSize(FontSize.XLarge)
                )

                SpanText(
                    text = project.shortDescription,
                    modifier = Modifier
                        .fontSize(FontSize.Medium)
                )

                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    project.github?.let {
                        LinkButton(
                            onClick = { ctx.router.navigateTo(it) },
                            modifier = Modifier
                                .margin(right = 0.6.cssRem, top = 0.3.cssRem, bottom = 0.3.cssRem)
                                .padding(0.5.cssRem)
                        ) {
                            FaGithub()
                        }
                    }

                    project.stars?.let {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .margin(right = 0.6.cssRem, top = 0.3.cssRem, bottom = 0.3.cssRem)
                        ) {
                            FaStar(
                                size = IconSize.SM,
                                modifier = Modifier.opacity(0.8f)
                            )

                            SpanText(
                                text = "$it+",
                                modifier = Modifier
                                    .fontSize(FontSize.Small)
                                    .opacity(0.8f)
                                    .margin(0.3.cssRem)
                            )
                        }
                    }
                }

                Row(
                    modifier = flexModifier()
                ) {
                    project.skills.forEach {
                        SkillBox(it)
                    }
                }
            }
        }
    }
}