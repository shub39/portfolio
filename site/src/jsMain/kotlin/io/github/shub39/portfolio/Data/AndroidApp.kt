package io.github.shub39.portfolio.Data

data class AndroidApp(
    val screenshots: List<String>,
    val icon: String,
    val name: String,
    val technologies: List<String>,
    val description: String,
    val link: String
)

val MY_APPS = listOf(
    AndroidApp(
        screenshots = listOf("RushSaved.png", "RushCard.png", "RushLyrics.png"),
        name = "Rush",
        icon = "RushIcon.png",
        technologies = listOf("Kotlin", "Compose", "ROOM", "Retrofit", "MVVM", "Dependency Injection"),
        description = "Android app to search, save and share lyrics like spotify!",
        link = "https://github.com/shub39/Rush"
    ),
    AndroidApp(
        screenshots = listOf("GritTasks.png", "GritAnalytics.png", "GritHabits.png"),
        name = "Grit",
        icon = "GritIcon.png",
        technologies = listOf("Kotlin", "Compose", "ROOM", "MVVM", "AlarmManager API"),
        description = "A Simple TODO list and Habit Tracker",
        link = "https://github.com/shub39/Grit"
    )
)