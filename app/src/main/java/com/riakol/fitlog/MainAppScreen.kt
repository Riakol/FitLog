package com.riakol.fitlog

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.riakol.fitlog.components.BottomNavigationBar
import com.riakol.fitlog.navigation.AppNavHost

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainAppScreen() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            BottomNavigationBar(navController = navController)
        }
    ) { innerPadding ->
        AppNavHost(
            navController = navController,
            startDestination = "home",
            modifier = Modifier.padding(innerPadding)
        )
    }
}