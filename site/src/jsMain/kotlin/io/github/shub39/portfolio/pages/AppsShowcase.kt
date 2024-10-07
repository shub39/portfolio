package io.github.shub39.portfolio.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.core.Page
import io.github.shub39.portfolio.components.layouts.PageLayout
import io.github.shub39.portfolio.components.sections.AppCard
import io.github.shub39.portfolio.data.MY_APPS
import org.jetbrains.compose.web.css.cssRem

@Page("apps")
@Composable
fun AppsShowcase() {
    PageLayout(
        title = "apps"
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(2.cssRem)
        ) {
            MY_APPS.forEachIndexed { _, app ->
                AppCard(app)
            }
        }
    }
}