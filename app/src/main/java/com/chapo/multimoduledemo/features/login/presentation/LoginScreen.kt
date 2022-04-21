package com.chapo.multimoduledemo.features.login.presentation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.chapo.multimoduledemo.features.login.presentation.LoginViewModel
import kotlinx.coroutines.flow.collect

@Composable
fun LoginScreen(
    onNavigate: (route: String) -> Unit,
    viewModel: LoginViewModel = hiltViewModel()
) {

    LaunchedEffect(key1 = true) {
        viewModel.navigate.collect { route ->
            onNavigate(route)
        }
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            TextField(value = viewModel.name, onValueChange = viewModel::onNameChange)

            Spacer(modifier = Modifier.height(48.dp))

            Button(onClick = { viewModel.onLoginClick() }) {
                Text(text = "Login")
            }

            Spacer(modifier = Modifier.height(24.dp))

            Text(text = "Registration", fontSize = 16.sp, modifier = Modifier.clickable {
                viewModel.onRegistrationClick()
            })

        }
    }
}