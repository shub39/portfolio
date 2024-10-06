package io.github.shub39.portfolio.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontStyle
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontStyle
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaArrowPointer
import com.varabyte.kobweb.silk.components.icons.fa.FaGithub
import com.varabyte.kobweb.silk.components.icons.fa.FaGlobe
import com.varabyte.kobweb.silk.components.icons.fa.FaLink
import com.varabyte.kobweb.silk.components.icons.fa.FaSquareWebAwesome
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.breakpoint.displayIfAtLeast
import io.github.shub39.portfolio.components.widgets.AppScreenshots
import io.github.shub39.portfolio.components.widgets.Badges
import io.github.shub39.portfolio.components.widgets.LinkButton
import io.github.shub39.portfolio.components.widgets.ThemedButton
import io.github.shub39.portfolio.data.App
import org.jetbrains.compose.web.css.cssRem

@Composable
fun AppCard(
    app: App
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .margin(topBottom = 2.cssRem),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(0.5.cssRem)
    ) {
        SpanText(
            text = app.name,
            modifier = Modifier
                .fontWeight(FontWeight.Bolder)
                .fontSize(FontSize.XXLarge)
                .textAlign(TextAlign.Center)
        )

        SpanText(
            text = app.shortDesc,
            modifier = Modifier
                .fontWeight(FontWeight.Bold)
                .fontSize(FontSize.XLarge)
                .fontStyle(FontStyle.Italic)
                .textAlign(TextAlign.Center)
                .margin(bottom = 2.cssRem)
        )

        AppScreenshots(app.images)

        Badges(app.badges)

        SpanText(
            text = app.desc,
            modifier = Modifier
                .textAlign(TextAlign.Center)
                .margin(top = 2.cssRem)
        )

        Row (
            modifier = Modifier.margin(top = 1.cssRem),
            horizontalArrangement = Arrangement.spacedBy(0.5.cssRem),
        ) {
            LinkButton(
                path = app.github
            ) {
                FaGithub(size = IconSize.XL)
                SpanText("Github")
            }

            app.links.forEach {
                LinkButton(
                    path = it.value
                ) {
                    FaGlobe()
                    SpanText(it.key)
                }
            }
        }

        SpanText("---")
    }
}