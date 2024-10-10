package io.github.shub39.portfolio.data

data class Project (
    val name: String,
    val shortDesc: String,
    val desc: String,
    val images: List<String>,
    val badges: List<String>,
    val github: String
)