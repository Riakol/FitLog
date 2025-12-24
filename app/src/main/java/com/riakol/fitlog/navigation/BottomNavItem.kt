package com.riakol.fitlog.navigation

import com.riakol.fitlog.R
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BarChart
import androidx.compose.material.icons.filled.FitnessCenter
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(
    val route: String,
    val titleResId: Int,
    val icon: ImageVector) {
    object Home : BottomNavItem("home", R.string.home_title, Icons.Default.Home)
    object Workout : BottomNavItem("workout", R.string.workout_title, Icons.Default.FitnessCenter)
    object Stats : BottomNavItem("stats", R.string.stats_title, Icons.Default.BarChart)
    object Profile : BottomNavItem("profile", R.string.profile_title, Icons.Default.Person)
}

val bottomNavItems = listOf(
    BottomNavItem.Home,
    BottomNavItem.Workout,
    BottomNavItem.Stats,
    BottomNavItem.Profile,
)