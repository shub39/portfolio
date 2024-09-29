package io.github.shub39.portfolio.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.icons.fa.FaAndroid
import com.varabyte.kobweb.silk.components.icons.fa.FaFile
import com.varabyte.kobweb.silk.components.icons.fa.FaHammer
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import io.github.shub39.portfolio.components.widgets.ButtonColors
import io.github.shub39.portfolio.components.widgets.LinkButton
import io.github.shub39.portfolio.toSitePalette
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Text

@Composable
fun Intro() {
    val sitePalette = ColorMode.current.toSitePalette()

    Box(
        modifier = Modifier
            .padding(topBottom = 5.cssRem)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Img(
                src = "me.jpg",
                attrs = Modifier
                    .size(200.px)
                    .margin(bottom = 1.5.cssRem)
                    .borderRadius(10.cssRem)
                    .toAttrs()
            )

            SpanText(
                text = "Hello! I'm Shubham",
                modifier = Modifier
                    .fontWeight(FontWeight.Bold)
                    .fontSize(FontSize.XXLarge)
                    .color(sitePalette.light0Hard)
                    .textAlign(TextAlign.Center)
            )

            SpanText(
                text = "Beginner Android developer and Linux nerd",
                modifier = Modifier
                    .fontSize(FontSize.Large)
                    .color(sitePalette.light0Soft)
                    .textAlign(TextAlign.Center)
            )

            Row(
                horizontalArrangement = Arrangement.spacedBy(0.5.cssRem),
                modifier = Modifier
                    .margin(top = 1.cssRem)
                    .fontFamily("Poppins")
            ) {
                LinkButton(
                    path = "/apps",
                    colors = ButtonColors.GreenButton,
                    modifier = Modifier.fontFamily("Poppins")
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(0.5.cssRem)
                    ) {
                        FaAndroid()

                        Text("Apps")
                    }
                }

                LinkButton(
                    path = "/projects",
                    modifier = Modifier.fontFamily("Poppins")
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(0.5.cssRem)
                    ) {
                        FaHammer()

                        Text("Projects")
                    }
                }

                LinkButton(
                    path = "https://github.com/shub39/portfolio/blob/main/site/src/jsMain/resources/public/Resume.pdf",
                    colors = ButtonColors.OrangeButton,
                    modifier = Modifier.fontFamily("Poppins"),
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(0.5.cssRem)
                    ) {
                        FaFile()

                        Text("Resume")
                    }
                }
            }

        }
    }

}