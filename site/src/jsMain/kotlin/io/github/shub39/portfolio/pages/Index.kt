package io.github.shub39.portfolio.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import io.github.shub39.portfolio.components.layouts.PageLayout
import io.github.shub39.portfolio.components.sections.*

@Page
@Composable
fun HomePage() {
    PageLayout(
        title = "Home"
    ) {
        Intro()
    }
}