package com.chapo.presentation.registration

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun RegistrationScreen(
    onNavigate: (route: String) -> Unit,
    viewModel: RegistrationViewModel = hiltViewModel()
) {

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

            Button(onClick = { viewModel.onRegistrationClick() }) {
                Text(text = "Register")
            }

        }
    }
}