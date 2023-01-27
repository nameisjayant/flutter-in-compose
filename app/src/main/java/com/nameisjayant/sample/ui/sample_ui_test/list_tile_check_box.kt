package com.nameisjayant.sample.ui.sample_ui_test

import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.unit.dp
import com.nameisjayant.flutter_in_compose.screens.ListTileCheckbox

@Composable
fun ListTileCheckBoxTest() {
    var selected by remember { mutableStateOf(false) }
    ListTileCheckbox(
        title = { Text(text = "Check Box Title") },
        selected = selected,
        size = 30.dp
    ) {
        selected = it
    }
}