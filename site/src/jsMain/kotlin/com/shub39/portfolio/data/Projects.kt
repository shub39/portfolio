package com.shub39.portfolio.data

data class Project(
    val name: String,
    val shortDescription: String,
    val description: String,
    val github: String? = null,
    val stars: Int? = null,
    val screenshots: List<String>? = null,
    val imageDimensions: Pair<Int, Int> = Pair(160, 90),
    val links: List<Pair<String, String>>? = null
)

val PROJECTS = listOf(
    Project(
        name = "Portfolio",
        shortDescription = "This site",
        description = "This site was made using Kotlin/Wasm and deployed on netlify",
        github = "https://github.com/shub39/PortofolioWasm"
    ),
    Project(
        name = "Dotfiles",
        shortDescription = "Dotfiles for my Arch + Hyprland setup",
        description = "Dotfiles stand for configuration files, as an Arch Linux user " +
                "these are my heavily customised dotfiles for the Hyprland tiling window " +
                "manager.",
        screenshots = listOf(
            "https://raw.githubusercontent.com/shub39/dotfiles/refs/heads/main/screenshots/1.png",
            "https://raw.githubusercontent.com/shub39/dotfiles/refs/heads/main/screenshots/2.png",
            "https://raw.githubusercontent.com/shub39/dotfiles/refs/heads/main/screenshots/3.png",
            "https://raw.githubusercontent.com/shub39/dotfiles/refs/heads/main/screenshots/4.png"
        ),
        stars = 240,
        imageDimensions = Pair(320, 180),
        github = "https://github.com/shub39/dotfiles"
    ),
    Project(
        name = "Student-Dropper",
        shortDescription = "Attendance system using raspberry pi 4",
        description = "This is a simple biometric attendance system made using " +
                "Raspberry Pi using python as the scripting language " +
                "It supports fingerprint and face recognition and currently " +
                "under development",
        github = "https://github.com/shub39/biometric-attendance"
    ),
    Project(
        name = "HomePage",
        shortDescription = "A simple Homepage for browsers",
        description = "A simple Homepage for browsers that shows your last scrobble form LastFM over an animated background " +
                "made with kotlin/wasm and deployed on github pages with github actions",
        github = "https://github.com/shub39/HomePage",
        links = listOf(
            Pair("Demo", "https://shub39.github.io/HomePage")
        )
    )
)