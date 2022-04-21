package com.chapo.multimoduledemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.chapo.multimoduledemo.core.navigation.Routes
import com.chapo.multimoduledemo.features.login.presentation.LoginScreen
import com.chapo.multimoduledemo.features.registration.RegistrationScreen
import com.chapo.multimoduledemo.features.todo.presentation.TodosScreen
import com.chapo.multimoduledemo.ui.theme.MultiModuleDemoTheme
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
