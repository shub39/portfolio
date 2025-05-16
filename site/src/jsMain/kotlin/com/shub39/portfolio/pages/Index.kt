package com.shub39.portfolio.pages

import androidx.compose.runtime.Composable
import com.shub39.portfolio.components.layouts.PageLayout
import com.shub39.portfolio.components.sections.AboutMe
import com.shub39.portfolio.components.sections.Apps
import com.shub39.portfolio.components.sections.Contacts
import com.shub39.portfolio.components.sections.Projects
import com.shub39.portfolio.toSitePalette
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.cssRem

@Page
@Composable
fun HomePage() {
    val palette = ColorMode.current.toSitePalette()
    val ctx = rememberPageContext()

    PageLayout("Home") {
        Column(
            verticalArrangement = Arrangement.spacedBy(2.cssRem)
        ) {
            // about me
            AboutMe(palette)

            // social links
            Contacts(ctx)

            // my apps
            Apps(palette, ctx)

            // other projects
            Projects(palette, ctx)
        }
    }
}