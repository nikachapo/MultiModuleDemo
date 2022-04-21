package com.chapo.multimoduledemo.features.todo.presentation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun TodosScreen(
    viewModel: TodosViewModel = hiltViewModel()
) {
    val state = viewModel.state

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        items(items = state) { todo ->
            Card(modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp)) {
                Text(
                    modifier = Modifier.padding(8.dp),
                    text = todo.todo,
                    fontSize = 24.sp,
                    style = MaterialTheme.typography.body1
                )
            }
        }
    }
}