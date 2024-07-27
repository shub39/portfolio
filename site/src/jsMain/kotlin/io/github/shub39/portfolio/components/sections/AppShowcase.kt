package io.github.shub39.portfolio.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.text.SpanText
import io.github.shub39.portfolio.Data.MY_APPS
import io.github.shub39.portfolio.components.widgets.AppCard
import org.jetbrains.compose.web.css.cssRem

@Composable
fun AppShowcase() {
    val title = "My Apps"
    val desc = "I love to make apps that are beautiful and fun to use."

    Column(
        modifier = Modifier
            .padding(topBottom = 2.cssRem, leftRight = 1.cssRem)
            .gap(0.4.cssRem),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SpanText(
            text = title,
            modifier = Modifier
                .fontWeight(FontWeight.Bolder)
                .fontSize(FontSize.XXLarge)
                .padding(bottom = 1.cssRem)
        )
        SpanText(
            text = desc,
            modifier = Modifier
                .fontWeight(FontWeight.Normal)
                .fontSize(FontSize.Large)
                .padding(bottom = 2.cssRem)
                .textAlign(TextAlign.Center)
        )

        MY_APPS.forEachIndexed { index, androidApp ->
            AppCard(androidApp)
        }
    }

}