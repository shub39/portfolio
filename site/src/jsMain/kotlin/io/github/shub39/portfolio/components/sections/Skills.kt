package io.github.shub39.portfolio.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.varabyte.kobweb.silk.style.breakpoint.displayIfAtLeast
import com.varabyte.kobweb.silk.style.breakpoint.displayUntil
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.cssRem

@Composable
fun Skills() {

    Row(
        Modifier
            .padding(topBottom = 3.cssRem)
            .fillMaxWidth()
            .displayIfAtLeast(Breakpoint.MD),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Column(
            modifier = Modifier.gap(0.5.cssRem),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            SpanText(
                text = "Skills",
                modifier = Modifier
                    .fontSize(FontSize.XXLarge)
                    .fontWeight(FontWeight.Bolder)
                    .padding(topBottom = 1.5.cssRem)
            )
            Row(
                modifier = Modifier.gap(0.5.cssRem),
            ) {
                SkillCard(
                    title = "Android Studio",
                    experience = "Beginner",
                    icon = {
                        FaAndroid(size = IconSize.XXL)
                    }
                )
                SkillCard(
                    title = "Kotlin",
                    experience = "Beginner",
                    icon = {
                        FaK(size = IconSize.XXL)
                    }
                )
            }
            Row(
                modifier = Modifier.gap(0.5.cssRem),
            ) {
                SkillCard(
                    title = "Linux",
                    experience = "Intermediate",
                    icon = {
                        FaLinux(size = IconSize.XXL)
                    }
                )
                SkillCard(
                    title = "C/C++",
                    experience = "Intermediate",
                    icon = {
                        FaC(size = IconSize.XXL)
                    }
                )
            }
            Row(
                modifier = Modifier.gap(0.5.cssRem),
            ) {
                SkillCard(
                    title = "Python",
                    experience = "Skilled",
                    icon = {
                        FaPython(size = IconSize.XXL)
                    }
                )
                SkillCard(
                    title = "Raspberry pi",
                    experience = "Skilled",
                    icon = {
                        FaRaspberryPi(size = IconSize.XXL)
                    }
                )
            }
        }
    }

    Column (
        Modifier
            .padding(3.cssRem)
            .fontSize(1.5.cssRem)
            .fillMaxWidth()
            .gap(1.cssRem)
            .displayUntil(Breakpoint.MD),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SpanText(
            text = "Skills",
            modifier = Modifier
                .fontSize(FontSize.XXLarge)
                .fontWeight(FontWeight.Bolder)
                .padding(topBottom = 1.5.cssRem)
        )
        SkillCard(
            title = "Android Studio",
            experience = "Beginner",
            icon = {
                FaAndroid(size = IconSize.XXL)
            }
        )
        SkillCard(
            title = "Kotlin",
            experience = "Beginner",
            icon = {
                FaK(size = IconSize.XXL)
            }
        )
        SkillCard(
            title = "Linux",
            experience = "Intermediate",
            icon = {
                FaLinux(size = IconSize.XXL)
            }
        )
        SkillCard(
            title = "C/C++",
            experience = "Intermediate",
            icon = {
                FaC(size = IconSize.XXL)
            }
        )
        SkillCard(
            title = "Python",
            experience = "Skilled",
            icon = {
                FaPython(size = IconSize.XXL)
            }
        )
        SkillCard(
            title = "Raspberry pi",
            experience = "Skilled",
            icon = {
                FaRaspberryPi(size = IconSize.XXL)
            }
        )
    }

}

@Composable
fun SkillCard(
    title: String,
    experience: String,
    icon: @Composable () -> Unit
) {
    Row(
        modifier = Modifier
            .padding(1.3.cssRem)
            .width(18.cssRem)
            .gap(1.cssRem)
            .backgroundColor(
                when (ColorMode.current) {
                    ColorMode.LIGHT -> Color.rgb(0x282828)
                    ColorMode.DARK -> Color.rgb(0xEBDBB2)
                }
            ).color(
                when (ColorMode.current) {
                    ColorMode.LIGHT -> Color.rgb(0xEBDBB2)
                    ColorMode.DARK -> Color.rgb(0x282828)
                }
            )
            .borderRadius(2.cssRem),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        icon()
        Column {
            SpanText(
                text = title,
                modifier = Modifier.fontSize(FontSize.Large).fontWeight(FontWeight.Bold)
            )
            SpanText(
                text = experience,
                modifier = Modifier.fontSize(FontSize.Medium).fontWeight(FontWeight.Medium)
            )
        }
    }
}