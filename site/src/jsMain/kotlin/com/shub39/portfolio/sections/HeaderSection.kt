package com.shub39.portfolio.sections

import androidx.compose.runtime.Composable
import com.shub39.portfolio.components.AppStylesheet
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H3
import org.jetbrains.compose.web.dom.Nav
import org.jetbrains.compose.web.dom.Text

@Composable
fun HeaderSection() {
    Div(attrs = {
        classes(AppStylesheet.header)
    }) {
        H3 { Text("shub39.dev") }

        Nav {
            A(href = "#about", attrs = { classes(AppStylesheet.navLink) }) { Text("About") }
            A(href = "#projects", attrs = { classes(AppStylesheet.navLink) }) { Text("Projects") }
            A(href = "#contact", attrs = { classes(AppStylesheet.navLink) }) { Text("Contact") }
        }
    }
}