package io.github.shub39.portfolio.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.breakpoint.displayIfAtLeast
import org.jetbrains.compose.web.css.cssRem

@Composable
fun AppShowcase() {
    val title = "Apps"

    //Desktop View
    Row(
        modifier = Modifier
            .displayIfAtLeast(Breakpoint.XL)
            .padding(5.cssRem)
    ) {
        SpanText(
            text = title,
            modifier = Modifier
                .fontWeight(FontWeight.Bolder)
                .fontSize(FontSize.XXLarge)
        )
    }

}