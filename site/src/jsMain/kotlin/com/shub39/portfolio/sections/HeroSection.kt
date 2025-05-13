package com.shub39.portfolio.sections

import androidx.compose.runtime.Composable
import com.shub39.portfolio.components.AppStylesheet
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun HeroSection() {
    Div(attrs = { classes(AppStylesheet.hero) }) {
        H1(attrs = { classes(AppStylesheet.heading) }) {
            Text("Hi, I'm Shubham 👋")
        }
        P(attrs = { classes(AppStylesheet.subheading) }) {
            Text("Android dev • Linux tinkerer • FOSS enthusiast")
        }
    }
}