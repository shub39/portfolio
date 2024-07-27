package io.github.shub39.portfolio.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.icons.fa.FaArrowUpRightFromSquare
import com.varabyte.kobweb.silk.style.breakpoint.displayIfAtLeast
import com.varabyte.kobweb.silk.style.breakpoint.displayUntil
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import io.github.shub39.portfolio.components.widgets.LinkButton
import io.github.shub39.portfolio.toSitePalette
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Img

@Composable
fun Projects() {
    val title = "Other Projects"

    // Mobile View
    Row(
        Modifier
            .gap(1.5.cssRem)
            .padding(1.5.cssRem)
            .fillMaxWidth()
            .displayIfAtLeast(Breakpoint.XL),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Column(
            modifier = Modifier.gap(0.5.cssRem).fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            SpanText(
                text = title,
                modifier = Modifier
                    .padding(1.5.cssRem)
                    .fontSize(FontSize.XXLarge)
                    .fillMaxWidth()
                    .textAlign(TextAlign.Center)
                    .fontWeight(FontWeight.Bolder)
            )
            Row(modifier = Modifier.gap(0.5.cssRem)) {
                ProjectCard(
                    title = "Biometric Attendance",
                    description = "A Biometric Attendance system using Raspberry pi",
                    image = "BiometricPreview.jpg",
                    link = "https://github.com/shub39/fingerprint_attendance"
                )
                ProjectCard(
                    title = "Scrapify",
                    description = "A Simple multipurpose Discord bot",
                    image = "Scrapify.jpg",
                    link = "https://github.com/shub39/scrapify"
                )
            }
            Row(modifier = Modifier.gap(0.5.cssRem)) {
                ProjectCard(
                    title = "Portfolio site",
                    description = "This Website was built using Kobweb",
                    image = "Kobweb.jpg",
                    link = "https://github.com/shub39/portfolio"
                )

            }
        }
    }

    // Desktop View
    Row(
        Modifier
            .fontSize(1.5.cssRem)
            .padding(1.5.cssRem)
            .gap(1.cssRem)
            .displayUntil(Breakpoint.XL),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(Modifier.gap(0.5.cssRem)) {
            SpanText(
                text = title,
                modifier = Modifier
                    .padding(1.5.cssRem)
                    .fontSize(FontSize.XXLarge)
                    .fillMaxWidth()
                    .textAlign(TextAlign.Center)
                    .fontWeight(FontWeight.Bolder)
            )
            ProjectCard(
                title = "Biometric Attendance",
                description = "A Biometric Attendance system using Raspberry pi",
                image = "BiometricPreview.jpg",
                link = "https://github.com/shub39/fingerprint_attendance"
            )
            ProjectCard(
                title = "Scrapify",
                description = "A Simple multipurpose Discord bot",
                image = "Scrapify.jpg",
                link = "https://github.com/shub39/scrapify"
            )
            ProjectCard(
                title = "Portfolio site",
                description = "This Website was built using Kobweb",
                image = "Kobweb.jpg",
                link = "https://github.com/shub39/portfolio"
            )
        }
    }
}

@Composable
fun ProjectCard(
    title: String,
    description: String,
    image: String,
    link: String = ""
) {
    val sitePalette = ColorMode.current.toSitePalette()

    Column(
        modifier = Modifier.padding(1.3.cssRem)
            .gap(1.cssRem)
            .color(sitePalette.brand.light0Hard)
            .border(width = 5.px, style = LineStyle.Dashed, color = sitePalette.brand.fadedYellow)
            .borderRadius(2.cssRem)
            .padding(1.cssRem)
    ) {
        Img(
            src = image,
            attrs = Modifier
                .fillMaxWidth()
                .borderRadius(1.cssRem)
                .height(240.px)
                .width(320.px)
                .toAttrs()
        )

        Row(
            modifier = Modifier.fillMaxWidth().padding(0.5.cssRem),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                SpanText(
                    text = title,
                    modifier = Modifier
                        .fontSize(FontSize.XLarge)
                        .fontWeight(FontWeight.Bold)
                )

                SpanText(
                    text = description,
                    modifier = Modifier
                        .fontSize(FontSize.Large)
                        .fontWeight(FontWeight.Medium)
                        .maxWidth(300.px),
                )
            }

            if (link.isNotEmpty()) {
                LinkButton(
                    path = link,
                    primary = true
                ) { FaArrowUpRightFromSquare() }
            }
        }
    }
}
