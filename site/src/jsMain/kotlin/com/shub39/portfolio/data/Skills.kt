package com.shub39.portfolio.data

sealed class Skill(val string: String) {
    // Kotlin Skills
    data object KotlinSkill : Skill("Kotlin")
    data object JetpackCompose : Skill("Jetpack Compose")
    data object AndroidSDK : Skill("Android SDK")
    data object KotlinMultiplatform : Skill("Kotlin Multiplatform")
    data object KtorFramework : Skill("Ktor")
    data object ComposeMultiplatform : Skill("Compose Multiplatform")

    // Other Skills
    data object LinuxSkill : Skill("Linux")
    data object ShellScripting : Skill("Shell")
    data object RaspberryPiSkill : Skill("Raspberry Pi")
    data object PythonSkill : Skill("Python")
    data object FigmaSkill : Skill("Figma")
    data object CICDSkill : Skill("CI/CD")
}