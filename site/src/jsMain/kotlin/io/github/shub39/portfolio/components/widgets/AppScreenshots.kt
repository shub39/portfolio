package io.github.shub39.portfolio.components.widgets

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.breakpoint.displayIfAtLeast
import com.varabyte.kobweb.silk.style.breakpoint.displayUntil
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.percent

@Composable
fun AppScreenshots(
    ss: List<String>
) {
    Row(
        modifier = Modifier
            .maxWidth(100.percent)
            .displayIfAtLeast(Breakpoint.MD)
    ) {
        ss.forEach { string ->
            Image(
                src = string,
                modifier = Modifier
                    .borderRadius(0.3.cssRem)
                    .padding(0.1.cssRem)
                    .maxWidth(25.percent)
            )
        }
    }

    Column(
        modifier = Modifier
            .maxWidth(100.percent)
            .displayUntil(Breakpoint.MD)
    ) {
        ss.chunked(2).forEach { strings ->
            Row {
                strings.forEach { string ->
                    Image(
                        src = string,
                        modifier = Modifier
                            .borderRadius(0.3.cssRem)
                            .padding(0.1.cssRem)
                            .maxWidth(50.percent)
                    )
                }
            }
        }
    }

}

