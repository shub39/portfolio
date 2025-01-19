package io.github.shub39.portfolio.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontStyle
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontFamily
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontStyle
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaGithub
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.text.SpanText
import io.github.shub39.portfolio.components.widgets.Badges
import io.github.shub39.portfolio.components.widgets.LinkButton
import io.github.shub39.portfolio.components.widgets.Spacer
import io.github.shub39.portfolio.data.Project
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.percent

@Composable
fun ProjectCard(
    project: Project
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .margin(topBottom = 2.cssRem),
        verticalArrangement = Arrangement.spacedBy(0.5.cssRem)
    ) {
        SpanText(
            text = project.name,
            modifier = Modifier
                .fontWeight(FontWeight.Bolder)
                .fontSize(FontSize.XXLarge)
        )

        SpanText(
            text = project.shortDesc,
            modifier = Modifier
                .fontWeight(FontWeight.Normal)
                .fontSize(FontSize.XLarge)
                .fontStyle(FontStyle.Italic)
        )

        Spacer(modifier = Modifier.padding(0.5.cssRem))

        project.images.forEach {
            Image(
                src = it,
                modifier = Modifier
                    .width(100.percent)
            )
        }

        Badges(project.badges)

        Spacer(modifier = Modifier.padding(0.5.cssRem))

        SpanText(
            text = project.desc,
            modifier = Modifier
                .fontSize(FontSize.Large)
                .fontFamily("JetBrains Mono")
        )

        Spacer(modifier = Modifier.padding(0.5.cssRem))

        LinkButton(
            path = project.github
        ) {
            FaGithub(size = IconSize.XL)
            SpanText("GITHUB")
        }
    }
}