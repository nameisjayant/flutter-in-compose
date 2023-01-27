package com.nameisjayant.flutter_in_compose.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun ListTileCheckbox(
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(8.dp),
    selected: Boolean,
    borderStroke: BorderStroke = BorderStroke(1.dp, Color.Gray),
    size: Dp = 25.dp,
    backgroundColor: Color = MaterialTheme.colors.primary,
    checkedColor: Color = Color.White,
    onChangeValue: (Boolean) -> Unit
) {

    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 10.dp)
    ) {
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Box(modifier = Modifier.align(CenterVertically)){
                title()
            }
            CustomCheckBox(
                selected = selected,
                onChangeValue = { onChangeValue(it) },
                borderStroke = borderStroke,
                size = size,
                backgroundColor = backgroundColor,
                checkedColor = checkedColor,
                shape = shape
            )
        }
    }

}

@Composable
fun CustomCheckBox(
    shape: Shape = RoundedCornerShape(8.dp),
    selected: Boolean,
    borderStroke: BorderStroke = BorderStroke(1.dp, Color.Gray),
    size: Dp = 25.dp,
    backgroundColor: Color = MaterialTheme.colors.primary,
    checkedColor: Color = Color.White,
    onChangeValue: (Boolean) -> Unit
) {

    Card(
        elevation = 0.dp,
        shape = shape,
        border = if (selected) BorderStroke(0.dp, Color.Transparent) else borderStroke,
        modifier = Modifier.size(size)
    ) {
        Box(
            modifier = Modifier
                .size(size)
                .clickable { onChangeValue(!selected) }
                .background(
                    if (selected) backgroundColor else Color.Transparent
                ), contentAlignment = Alignment.Center
        ) {
            if (selected)
                Icon(Icons.Default.Check, contentDescription = "", tint = checkedColor)
        }
    }

}