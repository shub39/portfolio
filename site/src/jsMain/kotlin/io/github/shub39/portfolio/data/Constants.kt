package io.github.shub39.portfolio.data

const val color = "076678"
const val logoColor = "D9E0EE"
const val labelColor = "504945"

val MY_APPS = listOf<App>(
    App(
        name = "Rush",
        shortDesc = "Search, Save and Share lyrics like Spotify!",
        desc = "Rush is an Android App to get lyrics for your favorite tracks and share them through " +
                "colorful cards, with features like synced lyrics and importing lyrics for local files. " +
                "it is a perfect tool for audiophiles and music nerds like myself.",
        github = "https://www.github.com/shub39/Rush",
        links = mapOf(
            "fdroid" to "https://f-droid.org/packages/com.shub39.rush/",
            "izzyOnDroid" to "https://apt.izzysoft.de/packages/com.shub39.rush/latest"
        ),
        badges = listOf(
            "https://ziadoua.github.io/m3-Markdown-Badges/badges/Android/android2.svg",
            "https://ziadoua.github.io/m3-Markdown-Badges/badges/AndroidStudio/androidstudio3.svg",
            "https://ziadoua.github.io/m3-Markdown-Badges/badges/Kotlin/kotlin1.svg",
            "https://m3-markdown-badges.vercel.app/stars/1/3/shub39/Rush",
            "https://m3-markdown-badges.vercel.app/issues/1/2/shub39/Rush"
        ),
        images = listOf(
            "https://github.com/shub39/Rush/blob/master/fastlane/metadata/android/en-US/images/phoneScreenshots/1.png?raw=true",
            "https://github.com/shub39/Rush/blob/master/fastlane/metadata/android/en-US/images/phoneScreenshots/2.png?raw=true",
            "https://github.com/shub39/Rush/blob/master/fastlane/metadata/android/en-US/images/phoneScreenshots/3.png?raw=true",
            "https://github.com/shub39/Rush/blob/master/fastlane/metadata/android/en-US/images/phoneScreenshots/4.png?raw=true"
        ),
        achievements = mapOf(
            "Featured on itsfoss" to "https://news.itsfoss.com/rush/",
            "Featured on Youtube" to "https://www.youtube.com/watch?v=5FjwPn9ciQc&t=1s&pp=ygUSdG9wIGFwcHMgc2VwdGVtYmVy"
        )
    ),

    App(
        name = "Grit",
        shortDesc = "A simple TODO list and Habit Tracker",
        desc = "Grit is a simple TODO list and Habit tracker for android that helps you " +
                "visualise your progress through maps.",
        github = "https://www.github.com/shub39/Grit",
        links = mapOf(
            "fdroid" to "https://f-droid.org/packages/com.shub39.grit/",
            "izzyOnDroid" to "https://apt.izzysoft.de/packages/com.shub39.grit/latest"
        ),
        badges = listOf(
            "https://ziadoua.github.io/m3-Markdown-Badges/badges/Android/android2.svg",
            "https://ziadoua.github.io/m3-Markdown-Badges/badges/AndroidStudio/androidstudio3.svg",
            "https://ziadoua.github.io/m3-Markdown-Badges/badges/Kotlin/kotlin1.svg",
            "https://m3-markdown-badges.vercel.app/stars/1/3/shub39/Grit",
            "https://m3-markdown-badges.vercel.app/issues/1/2/shub39/Grit"
        ),
        images = listOf(
            "https://github.com/shub39/Grit/blob/master/fastlane/metadata/android/en-US/images/phoneScreenshots/1.png?raw=true",
            "https://github.com/shub39/Grit/blob/master/fastlane/metadata/android/en-US/images/phoneScreenshots/2.png?raw=true",
            "https://github.com/shub39/Grit/blob/master/fastlane/metadata/android/en-US/images/phoneScreenshots/3.png?raw=true",
            "https://github.com/shub39/Grit/blob/master/fastlane/metadata/android/en-US/images/phoneScreenshots/6.png?raw=true"
        ),
        achievements = mapOf()
    ),

    App(
        name = "Plumbus",
        shortDesc = "Multiplatform app to browse info on the Rick and Morty universe",
        desc = "Plumbus is a Compose Multiplatform app targeting android and desktop that " +
                "lets you browse information on characters, episodes and locations from the Rick and Morty" +
                "Universe",
        badges = listOf(
            "https://ziadoua.github.io/m3-Markdown-Badges/badges/Android/android2.svg",
            "https://ziadoua.github.io/m3-Markdown-Badges/badges/Windows/windows2.svg",
            "https://ziadoua.github.io/m3-Markdown-Badges/badges/macOS/macos3.svg",
            "https://ziadoua.github.io/m3-Markdown-Badges/badges/Linux/linux2.svg",
            "https://ziadoua.github.io/m3-Markdown-Badges/badges/AndroidStudio/androidstudio2.svg",
            "https://ziadoua.github.io/m3-Markdown-Badges/badges/Kotlin/kotlin1.svg"
        ),
        github = "https://github.com/shub39/Plumbus",
        links = mapOf(),
        images = listOf(
            "https://github.com/shub39/Plumbus/blob/master/fastlane/metadata/android/en-US/images/phoneScreenshots/1.png?raw=true",
            "https://github.com/shub39/Plumbus/blob/master/fastlane/metadata/android/en-US/images/phoneScreenshots/2.png?raw=true",
            "https://github.com/shub39/Plumbus/blob/master/fastlane/metadata/android/en-US/images/phoneScreenshots/3.png?raw=true",
            "https://github.com/shub39/Plumbus/blob/master/fastlane/metadata/android/en-US/images/phoneScreenshots/6.png?raw=true"
        ),
        achievements = mapOf()
    )
)

val MY_PROJECTS = listOf<Project>(
    Project(
        name = "Portfolio Site",
        shortDesc = "My portfolio site made using kobweb",
        desc = "This site was made in compose multiplatform using kobweb, " +
                "a web framework for kotlin and compose. This is for primarily " +
                "showcasing my work and some basic utilities like color pickers " +
                "that I find myself using often.",
        images = listOf(),
        badges = listOf(
            "https://img.shields.io/github/last-commit/shub39/portfolio?&style=for-the-badge&logo=github&color=$color&logoColor=$logoColor&labelColor=$labelColor"
        ),
        github = "https://github.com/shub39/portfolio"
    ),

    Project(
        name = "Biometric Attendance",
        shortDesc = "An attendance system made with raspberry pi 4B",
        desc = "This is a simple biometric attendance system made with " +
                "Raspberry Pi 4B, it can enroll students through fingerprints, take attendance and share them" +
                "directly with teachers to save time during classes, A better version with facial recognition is " +
                "currently in the works.",
        images = listOf(),
        badges = listOf(),
        github = "https://github.com/shub39/biometric-attendance"
    ),

    Project(
        name = "Dotfiles",
        shortDesc = "dotfiles for my Arch linux + Hyprland config",
        desc = "dotfiles stand for configuration files. As an arch user I've spent a lot of time customising " +
                "my desktop for maximum productivity and performance without looking bad. Used some basic shell scripting " +
                "and CSS to get this",
        images = listOf(
            "https://github.com/shub39/dotfiles/blob/main/screenshots/1.png?raw=true",
            "https://github.com/shub39/dotfiles/blob/main/screenshots/2.png?raw=true",
            "https://github.com/shub39/dotfiles/blob/main/screenshots/3.png?raw=true",
            "https://github.com/shub39/dotfiles/blob/main/screenshots/4.png?raw=true"
        ),
        badges = listOf(
            "https://img.shields.io/github/last-commit/shub39/dotfiles?&style=for-the-badge&logo=github&color=$color&logoColor=$logoColor&labelColor=$labelColor",
            "https://img.shields.io/github/stars/shub39/dotfiles?style=for-the-badge&logo=andela&color=$color&logoColor=$logoColor&labelColor=$labelColor",
        ),
        github = "https://github.com/shub39/dotfiles"
    )
)