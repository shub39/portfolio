package io.github.shub39.portfolio.components.widgets

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.breakpoint.displayIfAtLeast
import com.varabyte.kobweb.silk.style.breakpoint.displayUntil
import org.jetbrains.compose.web.css.cssRem
import kotlin.collections.chunked
import kotlin.collections.forEach

@Composable
fun Badges(
    bb: List<String>
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .displayUntil(Breakpoint.MD),
        verticalArrangement = Arrangement.spacedBy(0.3.cssRem),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        bb.chunked(2).forEach {
            Row(
                horizontalArrangement = Arrangement.spacedBy(0.3.cssRem)
            ) {
                it.forEach {
                    Badge(it)
                }
            }
        }
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .displayIfAtLeast(Breakpoint.MD),
        verticalArrangement = Arrangement.spacedBy(0.3.cssRem),
    ) {
        bb.chunked(3).forEach {
            Row(
                horizontalArrangement = Arrangement.spacedBy(0.3.cssRem)
            ) {
                it.forEach {
                    Badge(it)
                }
            }
        }
    }
}

@Composable
private fun Badge(
    img: String
) {
    Image(
        src = img
    )
}