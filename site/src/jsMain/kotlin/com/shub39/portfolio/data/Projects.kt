package com.shub39.portfolio.data

data class Project(
    val name: String,
    val shortDescription: String,
    val github: String? = null,
    val stars: Int? = null
)

val PROJECTS = listOf(
    Project(
        name = "Portfolio",
        shortDescription = "This site",
        github = "https://github.com/shub39/PortofolioWasm"
    ),
    Project(
        name = "Dotfiles",
        shortDescription = "Dotfiles for my Arch + Hyprland setup",
        stars = 240,
        github = "https://github.com/shub39/dotfiles"
    ),
    Project(
        name = "Student-Dropper",
        shortDescription = "Attendance system using raspberry pi 4",
        github = "https://github.com/shub39/biometric-attendance"
    ),
    Project(
        name = "HomePage",
        shortDescription = "A simple Homepage for browsers",
        github = "https://github.com/shub39/HomePage"
    )
)