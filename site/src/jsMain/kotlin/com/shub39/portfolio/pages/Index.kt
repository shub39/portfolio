package com.shub39.portfolio.pages

import androidx.compose.runtime.Composable
import com.shub39.portfolio.components.layouts.PageLayout
import com.shub39.portfolio.components.sections.Intro
import com.varabyte.kobweb.core.Page

@Page
@Composable
fun HomePage() {
    PageLayout("Home") {
        Intro()
    }
}
