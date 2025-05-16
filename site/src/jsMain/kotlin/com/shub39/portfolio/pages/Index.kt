package com.shub39.portfolio.pages

import androidx.compose.runtime.Composable
import com.shub39.portfolio.components.layouts.PageLayout
import com.shub39.portfolio.components.widgets.LinkButton
import com.shub39.portfolio.components.widgets.Terminal
import com.shub39.portfolio.data.APPS
import com.shub39.portfolio.data.PROJECTS
import com.shub39.portfolio.data.SOCIAL_LINKS
import com.shub39.portfolio.toSitePalette
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.icons.fa.FaGithub
import com.varabyte.kobweb.silk.components.icons.fa.FaGooglePlay
import com.varabyte.kobweb.silk.components.icons.fa.FaStar
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.FlexWrap
import org.jetbrains.compose.web.css.JustifyContent
import org.jetbrains.compose.web.css.cssRem

fun socialLinksStyle(): Modifier {
    return Modifier.display(DisplayStyle.Flex)
        .flexWrap(FlexWrap.Wrap)
        .justifyContent(JustifyContent.FlexStart)
}

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
            Terminal(
                command = "cat about.txt"
            ) {
                SpanText(
                    text = "Shubham Gorai",
                    modifier = Modifier
                        .fontSize(FontSize.XXLarge)
                        .fontWeight(FontWeight.Bold)
                        .color(palette.brand.accent)
                )

                SpanText(
                    text = "B.Tech CSE student | Android dev",
                    modifier = Modifier
                        .fontSize(FontSize.Large)
                        .opacity(0.8f)
                        .fontWeight(FontWeight.Bold)
                )
            }

            // social links
            Terminal(
                command = "ls contact"
            ) {
                Row(
                    modifier = socialLinksStyle()
                ) {
                    SOCIAL_LINKS.forEach { link ->
                        LinkButton(
                            onClick = { ctx.router.navigateTo(link.link) },
                            modifier = Modifier
                                .margin(0.3.cssRem)
                                .padding(0.5.cssRem)
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(0.4.cssRem)
                            ) {
                                link.icon()
                                SpanText(
                                    text = link.name,
                                    modifier = Modifier
                                        .fontFamily("JetBrains Mono")
                                        .fontSize(FontSize.Medium)
                                )
                            }
                        }
                    }
                }
            }

            // my apps
            Terminal(
                command = "ls projects/apps"
            ) {
                APPS.forEach { app ->
                    Column(
                        modifier = Modifier
                            .margin(0.3.cssRem)
                            .padding(0.5.cssRem)
                    ) {
                        SpanText(
                            text = app.name,
                            modifier = Modifier
                                .color(palette.brand.primary)
                                .opacity(0.8f)
                                .fontWeight(FontWeight.Bold)
                                .fontSize(FontSize.Large)
                        )

                        SpanText(
                            text = app.shortDescription,
                            modifier = Modifier
                                .opacity(0.8f)
                                .fontSize(FontSize.Medium)
                        )

                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            app.github?.let {
                                LinkButton(
                                    onClick = { ctx.router.navigateTo(it) },
                                    modifier = Modifier
                                        .margin(0.3.cssRem)
                                        .padding(0.5.cssRem)
                                ) {
                                    FaGithub()
                                }
                            }

                            app.playstore?.let {
                                LinkButton(
                                    onClick = { ctx.router.navigateTo(it) },
                                    modifier = Modifier
                                        .margin(0.3.cssRem)
                                        .padding(0.5.cssRem)
                                ) {
                                    FaGooglePlay()
                                }
                            }

                            app.stars?.let {
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier.margin(0.3.cssRem)
                                ) {
                                    FaStar(
                                        size = IconSize.SM,
                                        modifier = Modifier.opacity(0.8f)
                                    )

                                    SpanText(
                                        text = "$it+",
                                        modifier = Modifier
                                            .fontSize(FontSize.Small)
                                            .opacity(0.8f)
                                            .margin(0.3.cssRem)
                                    )
                                }
                            }
                        }
                    }
                }
            }

            Terminal(
                command = "ls projects/others"
            ) {
                PROJECTS.forEach { project ->
                    Column(
                        modifier = Modifier
                            .margin(0.3.cssRem)
                            .padding(0.5.cssRem)
                    ) {
                        SpanText(
                            text = project.name,
                            modifier = Modifier
                                .color(palette.brand.primary)
                                .opacity(0.8f)
                                .fontWeight(FontWeight.Bold)
                                .fontSize(FontSize.Large)
                        )

                        SpanText(
                            text = project.shortDescription,
                            modifier = Modifier
                                .opacity(0.8f)
                                .fontSize(FontSize.Medium)
                        )

                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            project.github?.let {
                                LinkButton(
                                    onClick = { ctx.router.navigateTo(it) },
                                    modifier = Modifier
                                        .margin(0.3.cssRem)
                                        .padding(0.5.cssRem)
                                ) {
                                    FaGithub()
                                }
                            }

                            project.stars?.let {
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier.margin(0.3.cssRem)
                                ) {
                                    FaStar(
                                        size = IconSize.SM,
                                        modifier = Modifier.opacity(0.8f)
                                    )

                                    SpanText(
                                        text = "$it+",
                                        modifier = Modifier
                                            .fontSize(FontSize.Small)
                                            .opacity(0.8f)
                                            .margin(0.3.cssRem)
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
