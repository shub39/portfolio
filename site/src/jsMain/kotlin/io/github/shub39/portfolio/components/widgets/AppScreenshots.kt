package io.github.shub39.portfolio.components.widgets

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.breakpoint.displayIfAtLeast
import com.varabyte.kobweb.silk.style.breakpoint.displayUntil
import io.github.shub39.portfolio.SitePalettes
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.percent


@Composable
fun AppScreenshots(
    ss: List<String>
) {
    Row(
        modifier = Modifier.displayIfAtLeast(Breakpoint.XL),
        horizontalArrangement = Arrangement.spacedBy(0.5.cssRem)
    ) {
        ss.forEach {
            ScreenShot(
                img = it,
            )
        }
    }

    Row(
        modifier = Modifier.displayUntil(Breakpoint.XL).displayIfAtLeast(Breakpoint.MD),
        horizontalArrangement = Arrangement.spacedBy(0.5.cssRem)
    ) {
        ss.forEach {
            ScreenShot(
                img = it,
            )
        }
    }

    Column(
        modifier = Modifier.displayUntil(Breakpoint.MD),
        verticalArrangement = Arrangement.spacedBy(0.5.cssRem)
    ) {
        ss.chunked(2).forEach {
            Row(
                horizontalArrangement = Arrangement.spacedBy(0.5.cssRem)
            ) {
                it.forEach {
                    ScreenShot(
                        img = it,
                    )
                }
            }
        }
    }

}

@Composable
private fun ScreenShot(
    img: String,
) {
    Image(
        src = img,
        modifier = Modifier
            .width(100.percent)
            .borderRadius(0.3.cssRem)
            .border(
                width = 0.3.cssRem,
                style = LineStyle.Double,
                color = SitePalettes.dark.light0Soft
            )
    )
}