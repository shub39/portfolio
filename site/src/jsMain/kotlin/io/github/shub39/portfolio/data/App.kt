package io.github.shub39.portfolio.data

data class App(
    val name: String,
    val shortDesc: String,
    val desc: String,
    val badges: List<String>,
    val github: String,
    val links: Map<String, String>,
    val images: List<String>,
    val achievements: Map<String, String>
)