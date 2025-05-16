package com.shub39.portfolio.data

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.silk.components.icons.fa.FaEnvelope
import com.varabyte.kobweb.silk.components.icons.fa.FaGithub
import com.varabyte.kobweb.silk.components.icons.fa.FaLinkedin
import com.varabyte.kobweb.silk.components.icons.fa.FaXTwitter

data class SocialLink(
    val name: String,
    val link: String,
    val icon: @Composable () -> Unit
)

val SOCIAL_LINKS = listOf(
    SocialLink(
        name = "Github.md",
        link = "https://github.com/shub39",
        icon = { FaGithub() }
    ),
    SocialLink(
        name = "LinkedIn.md",
        link = "https://www.linkedin.com/in/shub39/",
        icon = { FaLinkedin() }
    ),
    SocialLink(
        name = "Email.txt",
        link = "mailto:cptnshubham39@gmail.com",
        icon = { FaEnvelope() }
    ),
    SocialLink(
        name = "Twitter.md",
        link = "https://x.com/_shub39",
        icon = { FaXTwitter() }
    )
)