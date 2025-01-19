package io.github.shub39.portfolio.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontStyle
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.varabyte.kobweb.silk.components.text.SpanText
import io.github.shub39.portfolio.components.widgets.AppScreenshots
import io.github.shub39.portfolio.components.widgets.Badges
import io.github.shub39.portfolio.components.widgets.LinkButton
import io.github.shub39.portfolio.components.widgets.Spacer
import io.github.shub39.portfolio.data.App
import io.github.shub39.portfolio.data.AppSources
import org.jetbrains.compose.web.css.cssRem

@Composable
fun AppCard(
    app: App
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .margin(topBottom = 2.cssRem),
        verticalArrangement = Arrangement.spacedBy(0.5.cssRem)
    ) {
        SpanText(
            text = app.name,
            modifier = Modifier
                .fontWeight(FontWeight.Bolder)
                .fontSize(FontSize.XXLarge)
        )

        SpanText(
            text = app.shortDesc,
            modifier = Modifier
                .fontWeight(FontWeight.Normal)
                .fontSize(FontSize.XLarge)
                .fontStyle(FontStyle.Italic)
        )

        Spacer(modifier = Modifier.padding(0.5.cssRem))

        AppScreenshots(app.images)

        Spacer(modifier = Modifier.padding(0.2.cssRem))

        Badges(app.badges)

        Spacer(modifier = Modifier.padding(0.5.cssRem))

        SpanText(
            text = app.desc,
            modifier = Modifier
                .fontSize(FontSize.Large)
                .fontFamily("JetBrains Mono")
        )

        Spacer(modifier = Modifier.padding(0.5.cssRem))

        Row(
            horizontalArrangement = Arrangement.spacedBy(0.5.cssRem),
        ) {
            LinkButton(
                path = app.github
            ) {
                FaGithub(size = IconSize.XL)
                SpanText("GITHUB")
            }

            app.links.forEach {
                LinkButton(
                    path = it.value
                ) {
                    when(it.key) {
                        AppSources.PLAYSTORE.name -> FaGooglePlay()
                        AppSources.FDROID.name -> FaStore()
                        AppSources.IZZYONDROID.name -> FaShop()
                        else -> FaGlobe()
                    }
                    SpanText(it.key)
                }
            }
        }

        if (app.achievements.isNotEmpty()) {
            Spacer(modifier = Modifier.padding(0.5.cssRem))

            SpanText(
                text = "Achievements",
                modifier = Modifier
                    .fontWeight(FontWeight.Bold)
                    .fontSize(FontSize.XLarge)
                    .textAlign(TextAlign.Center)
            )

            app.achievements.forEach {
                LinkButton(
                    path = it.value
                ) {
                    FaGlobe()
                    SpanText(it.key)
                }
            }
        }

    }
}