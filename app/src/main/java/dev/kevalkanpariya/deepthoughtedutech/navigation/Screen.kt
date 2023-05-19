package dev.kevalkanpariya.deepthoughtedutech.navigation

sealed class Screen(val route: String) {
    object HomeScreen: Screen("home")
    object ProjectScreen: Screen("project")
    object TaskScreen: Screen("task")
    object ResourceScreen: Screen("resource")
}
