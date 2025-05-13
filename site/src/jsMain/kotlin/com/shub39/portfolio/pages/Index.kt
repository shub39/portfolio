package com.shub39.portfolio.pages

import androidx.compose.runtime.Composable
import com.shub39.portfolio.components.AppStylesheet
import com.shub39.portfolio.sections.AboutSection
import com.shub39.portfolio.sections.HeaderSection
import com.shub39.portfolio.sections.HeroSection
import com.varabyte.kobweb.core.Page
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.dom.Div

@Page
@Composable
fun HomePage() {
    Style(AppStylesheet)

    Div(attrs = {
        classes(AppStylesheet.container)
    }) {
        HeaderSection()
        HeroSection()
        AboutSection()
    }
}
