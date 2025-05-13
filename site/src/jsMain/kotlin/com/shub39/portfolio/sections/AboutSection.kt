package com.shub39.portfolio.sections

import androidx.compose.runtime.Composable
import com.shub39.portfolio.components.AppStylesheet
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Section
import org.jetbrains.compose.web.dom.Text

@Composable
fun AboutSection() {
    Section(attrs = {
        id("about")
        classes(AppStylesheet.about)
    }) {
        H2 { Text("About Me") }
        P {
            Text(
                "I'm a B.Tech Computer Science student who loves building Android apps, trying out custom ROMs, and exploring the Linux ecosystem. "
            )
        }
    }
}