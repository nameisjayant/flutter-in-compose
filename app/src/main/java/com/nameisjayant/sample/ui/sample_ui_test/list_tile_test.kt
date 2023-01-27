package com.nameisjayant.sample.ui.sample_ui_test

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.nameisjayant.flutter_in_compose.screens.ListTile


@Composable
fun ListTileTest() {
    Column() {
        (1..5).forEach {
            ListTile(
                leading = { Icon(Icons.Default.Home, contentDescription = "") },
                trailing = {
                    IconButton(onClick = { }, modifier = Modifier.size(25.dp)) {
                        Icon(Icons.Default.MoreVert, contentDescription = "")
                    }
                },
                title = { Text(text = "Title$it") },
                subTitle = { Text(text = "Subtitle $it") },
                backgroundColor = Color.Gray.copy(alpha = 0.1f),
                elevation = 2.dp,
                shape = RoundedCornerShape(8.dp),
                borderStroke = BorderStroke(2.dp, Color.Black),
                horizontalTitleGap = 5.dp,
                contentPadding = 15.dp
            )
        }
    }
}