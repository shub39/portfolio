package com.shub39.portfolio.data

data class Project(
    val name: String,
    val shortDescription: String,
    val skills: List<Skill>,
    val github: String? = null,
    val stars: Int? = null
)

val PROJECTS = listOf(
    Project(
        name = "Portfolio",
        shortDescription = "This site was made with kobweb, a web framework for kotlin",
        github = "https://github.com/shub39/portfolio",
        skills = listOf(
            Skill.KotlinMultiplatform,
            Skill.JetpackCompose
        )
    ),
    Project(
        name = "Dotfiles",
        shortDescription = "Dotfiles for my Arch + Hyprland setup",
        stars = 240,
        github = "https://github.com/shub39/dotfiles",
        skills = listOf(
            Skill.ShellScripting,
            Skill.LinuxSkill
        )
    ),
    Project(
        name = "Student-Dropper",
        shortDescription = "Attendance system using raspberry pi 4",
        github = "https://github.com/shub39/biometric-attendance",
        skills = listOf(
            Skill.ShellScripting,
            Skill.LinuxSkill,
            Skill.PythonSkill,
            Skill.RaspberryPiSkill
        )
    ),
    Project(
        name = "HomePage",
        shortDescription = "A simple Homepage for browsers",
        github = "https://github.com/shub39/HomePage",
        skills = listOf(
            Skill.ComposeMultiplatform,
            Skill.KotlinSkill,
            Skill.KotlinMultiplatform
        )
    )
)