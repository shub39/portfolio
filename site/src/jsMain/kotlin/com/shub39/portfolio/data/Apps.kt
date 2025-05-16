package com.shub39.portfolio.data

data class App(
    val name: String,
    val shortDescription: String,
    val skills: List<Skill>,
    val github: String? = null,
    val stars: Int? = null,
    val playstore: String? = null
)

val APPS = listOf(
    App(
        name = "Rush",
        shortDescription = "Search, Save and Share Lyrics like Spotify!",
        github = "https://github.com/shub39/Rush",
        stars = 550,
        playstore = "https://play.google.com/store/apps/details?id=com.shub39.rush.play",
        skills = listOf(
            Skill.KotlinSkill,
            Skill.KotlinMultiplatform,
            Skill.ComposeMultiplatform,
            Skill.KtorFramework,
            Skill.AndroidSDK,
            Skill.CICDSkill
        )
    ),
    App(
        name = "Grit",
        shortDescription = "A simple ToDo list and Habit Tracker",
        github = "https://github.com/shub39/Grit",
        stars = 180,
        skills = listOf(
            Skill.KotlinSkill,
            Skill.JetpackCompose,
            Skill.AndroidSDK,
            Skill.CICDSkill
        )
    ),
    App(
        name = "Dharmik",
        shortDescription = "Browse Bhagavad Gita",
        github = "https://github.com/shub39/Dharmik",
        stars = 40,
        skills = listOf(
            Skill.KotlinSkill,
            Skill.KotlinMultiplatform,
            Skill.ComposeMultiplatform,
            Skill.AndroidSDK,
            Skill.CICDSkill
        )
    ),
    App(
        name = "Plumbus",
        shortDescription = "Browse info on Rick and Morty",
        github = "https://github.com/shub39/Plumbus",
        stars = 10,
        skills = listOf(
            Skill.KotlinSkill,
            Skill.KotlinMultiplatform,
            Skill.ComposeMultiplatform,
            Skill.AndroidSDK
        )
    )
)