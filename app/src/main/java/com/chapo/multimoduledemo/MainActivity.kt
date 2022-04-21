package com.chapo.multimoduledemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.chapo.core.navigation.Routes
import com.chapo.multimoduledemo.ui.theme.MultiModuleDemoTheme
import com.chapo.presentation.login.LoginScreen
import com.chapo.presentation.TodosScreen
import com.chapo.presentation.registration.RegistrationScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MultiModuleDemoTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = Routes.Login
                ) {

                    composable(Routes.Login) {
                        LoginScreen(onNavigate = navController::navigate)
                    }
                    composable(Routes.Registration) {
                        RegistrationScreen(onNavigate = navController::navigate)
                    }
                    composable(Routes.Todo) {
                        TodosScreen()
                    }
                }

            }
        }
    }
}
