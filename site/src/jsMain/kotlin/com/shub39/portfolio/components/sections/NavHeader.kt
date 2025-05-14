package com.shub39.portfolio.components.sections

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.shub39.portfolio.components.widgets.IconButton
import com.shub39.portfolio.components.widgets.LinkButton
import com.varabyte.kobweb.compose.css.functions.blur
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.icons.MoonIcon
import com.varabyte.kobweb.silk.components.icons.SunIcon
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.navigation.UncoloredLinkVariant
import com.varabyte.kobweb.silk.components.navigation.UndecoratedLinkVariant
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.animation.Keyframes
import com.varabyte.kobweb.silk.style.base
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

val NavHeaderStyle = CssStyle.base {
    Modifier
        .fillMaxWidth()
        .padding(1.cssRem)
        .backdropFilter(blur(4.px))
        .styleModifier {
            property("-webkit-backdrop-filter", "blur( 4px )")
        }
}


@Composable
private fun NavLink(path: String, text: String) {
    val ctx = rememberPageContext()

    LinkButton(
        path = path,
        text = text,
        selected = ctx.route.path == path
    )
}

@Composable
private fun MenuItems() {
    NavLink("/", "/")
    NavLink("/apps", "/apps")
    NavLink("/projects", "/projects")
}

@Composable
private fun ColorModeButton() {
    var colorMode by ColorMode.currentState
    IconButton(onClick = { colorMode = colorMode.opposite },) {
        if (colorMode.isLight) MoonIcon() else SunIcon()
    }
}

val SideMenuSlideInAnim = Keyframes {
    from {
        Modifier.translateX(100.percent)
    }

    to {
        Modifier
    }
}

@Composable
fun NavHeader(modifier: Modifier) {
    Row(
        modifier = NavHeaderStyle.toModifier().then(modifier),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(Modifier.gap(0.3.cssRem), verticalAlignment = Alignment.CenterVertically) {
            MenuItems()
        }

        Spacer()

        ColorModeButton()
    }
}