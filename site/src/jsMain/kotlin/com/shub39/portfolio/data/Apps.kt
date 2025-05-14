package com.shub39.portfolio.data

data class App(
    val name: String,
    val iconUrl: String,
    val screenshots: List<String>,
    val shortDescription: String,
    val description: String,
    val github: String? = null,
    val stars: Int? = null,
    val rating: Float? = null,
    val playstore: String? = null,
    val otherLinks: Map<String, String>? = null,
)

val APPS = listOf(
    App(
        name = "Rush",
        iconUrl = "https://raw.githubusercontent.com/shub39/Rush/refs/heads/master/fastlane/metadata/android/en-US/images/icon.png",
        screenshots = listOf(
            "https://raw.githubusercontent.com/shub39/Rush/refs/heads/master/fastlane/metadata/android/en-US/images/phoneScreenshots/1.png",
            "https://raw.githubusercontent.com/shub39/Rush/refs/heads/master/fastlane/metadata/android/en-US/images/phoneScreenshots/2.png",
            "https://raw.githubusercontent.com/shub39/Rush/refs/heads/master/fastlane/metadata/android/en-US/images/phoneScreenshots/3.png",
            "https://raw.githubusercontent.com/shub39/Rush/refs/heads/master/fastlane/metadata/android/en-US/images/phoneScreenshots/4.png",
            "https://raw.githubusercontent.com/shub39/Rush/refs/heads/master/fastlane/metadata/android/en-US/images/phoneScreenshots/5.png",
            "https://raw.githubusercontent.com/shub39/Rush/refs/heads/master/fastlane/metadata/android/en-US/images/phoneScreenshots/6.png",
            "https://raw.githubusercontent.com/shub39/Rush/refs/heads/master/fastlane/metadata/android/en-US/images/phoneScreenshots/7.png"
        ),
        shortDescription = "Search, Save and Share Lyrics like Spotify!",
        description = "Rush is an Android App to get lyrics for your favorite tracks and share them through " +
                "colorful cards, with features like synced lyrics and importing lyrics for local files. " +
                "it is a perfect tool for audiophiles and music nerds like myself.",
        github = "https://github.com/shub39/Rush",
        stars = 550,
        rating = 5f,
        playstore = "https://play.google.com/store/apps/details?id=com.shub39.rush.play",
        otherLinks = mapOf(
            "Fdroid" to "https://f-droid.org/packages/com.shub39.rush",
            "IzzyOnDroid" to "https://apt.izzysoft.de/packages/com.shub39.rush/latest"
        )
    ),
    App(
        name = "Grit",
        iconUrl = "https://raw.githubusercontent.com/shub39/Grit/refs/heads/master/fastlane/metadata/android/en-US/images/icon.png",
        screenshots = listOf(
            "https://raw.githubusercontent.com/shub39/Grit/refs/heads/master/fastlane/metadata/android/en-US/images/phoneScreenshots/1.png",
            "https://raw.githubusercontent.com/shub39/Grit/refs/heads/master/fastlane/metadata/android/en-US/images/phoneScreenshots/2.png",
            "https://raw.githubusercontent.com/shub39/Grit/refs/heads/master/fastlane/metadata/android/en-US/images/phoneScreenshots/3.png",
            "https://raw.githubusercontent.com/shub39/Grit/refs/heads/master/fastlane/metadata/android/en-US/images/phoneScreenshots/4.png",
            "https://raw.githubusercontent.com/shub39/Grit/refs/heads/master/fastlane/metadata/android/en-US/images/phoneScreenshots/5.png",
            "https://raw.githubusercontent.com/shub39/Grit/refs/heads/master/fastlane/metadata/android/en-US/images/phoneScreenshots/6.png",
        ),
        shortDescription = "A simple ToDo list and Habit Tracker",
        description = "There are plenty of todo list and habit tracker apps for android. " +
                "Some have the features I love while some have good UI design." +
                " While learning android I made this app for myself that brings together all the features that I" +
                " like keeping everything simple.",
        github = "https://github.com/shub39/Grit",
        stars = 160,
        playstore = null,
        otherLinks = mapOf(
            "Fdroid" to "https://f-droid.org/packages/com.shub39.grit",
            "IzzyOnDroid" to "https://apt.izzysoft.de/packages/com.shub39.grit/latest"
        )
    ),
    App(
        name = "Dharmik",
        iconUrl = "https://raw.githubusercontent.com/shub39/Dharmik/refs/heads/master/fastlane/metadata/android/en-US/images/icon.png",
        screenshots = listOf(
            "https://raw.githubusercontent.com/shub39/Dharmik/refs/heads/master/fastlane/metadata/android/en-US/images/phoneScreenshots/1.png",
            "https://raw.githubusercontent.com/shub39/Dharmik/refs/heads/master/fastlane/metadata/android/en-US/images/phoneScreenshots/2.png",
            "https://raw.githubusercontent.com/shub39/Dharmik/refs/heads/master/fastlane/metadata/android/en-US/images/phoneScreenshots/3.png",
            "https://raw.githubusercontent.com/shub39/Dharmik/refs/heads/master/fastlane/metadata/android/en-US/images/phoneScreenshots/4.png",
        ),
        shortDescription = "Browse Bhagavad Gita",
        description = "A simple app to browse Bhagavad Gita with auduio transcriptions in three languages",
        github = "https://github.com/shub39/Dharmik",
        stars = 34,
        playstore = null,
        otherLinks = mapOf(
            "IzzyOnDroid" to "https://apt.izzysoft.de/packages/com.shub39.dharmik/latest"
        )
    ),
    App(
        name = "Plumbus",
        iconUrl = "https://raw.githubusercontent.com/shub39/Plumbus/refs/heads/master/fastlane/metadata/android/en-US/images/icon.png",
        screenshots = listOf(
            "https://raw.githubusercontent.com/shub39/Plumbus/refs/heads/master/fastlane/metadata/android/en-US/images/phoneScreenshots/1.png",
            "https://raw.githubusercontent.com/shub39/Plumbus/refs/heads/master/fastlane/metadata/android/en-US/images/phoneScreenshots/2.png",
            "https://raw.githubusercontent.com/shub39/Plumbus/refs/heads/master/fastlane/metadata/android/en-US/images/phoneScreenshots/3.png",
            "https://raw.githubusercontent.com/shub39/Plumbus/refs/heads/master/fastlane/metadata/android/en-US/images/phoneScreenshots/4.png",
            "https://raw.githubusercontent.com/shub39/Plumbus/refs/heads/master/fastlane/metadata/android/en-US/images/phoneScreenshots/5.png",
            "https://raw.githubusercontent.com/shub39/Plumbus/refs/heads/master/fastlane/metadata/android/en-US/images/phoneScreenshots/6.png",
            "https://raw.githubusercontent.com/shub39/Plumbus/refs/heads/master/fastlane/metadata/android/en-US/images/phoneScreenshots/7.png",
            "https://raw.githubusercontent.com/shub39/Plumbus/refs/heads/master/fastlane/metadata/android/en-US/images/phoneScreenshots/8.png"
        ),
        shortDescription = "Browse info on Rick and Morty",
        description = "Compose Multiplatform app to browse info on Characters, " +
                "Locations and Episodes from Rick and Morty.",
        github = "https://github.com/shub39/Plumbus",
        stars = 13,
        playstore = null,
        otherLinks = null
    )
)