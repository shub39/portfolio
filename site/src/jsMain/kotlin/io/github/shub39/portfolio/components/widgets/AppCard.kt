package io.github.shub39.portfolio.components.widgets

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.breakpoint.displayIfAtLeast
import com.varabyte.kobweb.silk.style.breakpoint.displayUntil
import com.varabyte.kobweb.silk.style.toAttrs
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import io.github.shub39.portfolio.data.AndroidApp
import io.github.shub39.portfolio.toSitePalette
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Img

val desktopImageStyle = CssStyle {
    base {
        Modifier
            .height(600.px)
            .width(300.px)
    }
}

val mobileImageStyle = CssStyle {
    base {
        Modifier
            .height(225.px)
            .width(112.px)
    }
}

@Composable
fun AppCard(
    app: AndroidApp
) {
    val palette = ColorMode.current.toSitePalette()

    // Desktop View
    Row(
        modifier = Modifier
            .padding(1.cssRem)
            .displayIfAtLeast(Breakpoint.MD)
            .fillMaxWidth()
    ) {
        Row {
            app.screenshots.forEachIndexed { _, screenshot ->
                Img(
                    src = screenshot,
                    attrs = desktopImageStyle.toAttrs()
                )
            }

            Column(
                modifier = Modifier
                    .margin(left = 1.cssRem)
                    .borderRadius(1.cssRem)
                    .border(width = 5.px, style = LineStyle.Dashed, color = palette.brand.fadedYellow)
                    .padding(1.cssRem),
                verticalArrangement = Arrangement.Center
            ) {
                Img(
                    src = app.icon,
                    attrs = Modifier
                        .height(70.px)
                        .width(70.px)
                        .borderRadius(3.cssRem)
                        .toAttrs()
                )
                SpanText(
                    text = app.name,
                    modifier = Modifier
                        .fontSize(FontSize.XXLarge)
                        .fontWeight(FontWeight.Bold)
                )
                SpanText(
                    text = app.description,
                    modifier = Modifier
                        .fontSize(FontSize.Large)
                        .fontWeight(FontWeight.Normal)
                        .margin(bottom = 1.cssRem)
                )
                app.technologies.forEachIndexed { _, name ->
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.margin(bottom = 0.5.cssRem)
                    ) {
                        FaCircleDot(Modifier.padding(right = 0.3.cssRem))
                        SpanText(
                            text = name,
                            modifier = Modifier
                                .fontWeight(FontWeight.SemiBold)
                        )
                    }
                }
                LinkButton(
                    path = app.link,
                    primary = true,
                    modifier = Modifier.margin(top = 1.cssRem)
                ) {
                    FaArrowUpRightFromSquare()
                }
            }
        }
    }

    // Mobile View
    Row(
        modifier = Modifier
            .displayUntil(Breakpoint.MD)
            .fillMaxWidth()
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .borderRadius(1.cssRem)
                    .border(width = 5.px, style = LineStyle.Dashed, color = palette.brand.fadedYellow)
                    .padding(1.cssRem),
                verticalArrangement = Arrangement.Center
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 1.cssRem),
                    horizontalArrangement = Arrangement.Center
                ) {
                    app.screenshots.forEachIndexed { _, screenshot ->
                        Img(
                            src = screenshot,
                            attrs = mobileImageStyle.toAttrs()
                        )
                    }
                }
                SpanText(
                    text = app.name,
                    modifier = Modifier
                        .fontSize(FontSize.XXLarge)
                        .fontWeight(FontWeight.Bold)
                )
                SpanText(
                    text = app.description,
                    modifier = Modifier
                        .fontSize(FontSize.Large)
                        .fontWeight(FontWeight.Normal)
                        .margin(bottom = 1.cssRem)
                )
                app.technologies.forEachIndexed { _, name ->
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.margin(bottom = 0.5.cssRem)
                    ) {
                        FaCircleDot(Modifier.padding(right = 0.3.cssRem))
                        SpanText(
                            text = name,
                            modifier = Modifier
                                .fontWeight(FontWeight.SemiBold)
                        )
                    }
                }
                LinkButton(
                    path = app.link,
                    primary = true,
                    modifier = Modifier.margin(top = 1.cssRem)
                ) {
                    FaArrowUpRightFromSquare()
                }
            }
        }
    }
}