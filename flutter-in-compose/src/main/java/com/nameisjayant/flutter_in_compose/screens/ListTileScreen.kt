package com.nameisjayant.flutter_in_compose.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Shape
import com.nameisjayant.flutter_in_compose.commonui.SpacerHeight


@Composable
fun ListTile(
    modifier: Modifier = Modifier,
    backgroundColor: Color = Color.Transparent,
    elevation: Dp = 0.dp,
    shape: Shape = RoundedCornerShape(0.dp),
    borderStroke: BorderStroke = BorderStroke(0.dp, Color.Transparent),
    leading: @Composable () -> Unit = {},
    trailing: @Composable () -> Unit = {},
    title: @Composable () -> Unit = {},
    subTitle: @Composable () -> Unit = {},
    horizontalTitleGap:Dp = 5.dp,
    contentPadding:Dp = 15.dp,
    onTap: () -> Unit = {}
) {

    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 15.dp, vertical = 10.dp),
        elevation = elevation,
        shape = shape,
        border = borderStroke
    ) {
        Box(
            modifier = Modifier
                .background(backgroundColor)
                .clickable { onTap() }
                .fillMaxWidth()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(contentPadding)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(
                        modifier = Modifier.weight(0.8f)
                    ) {
                        leading()
                        Column(
                            modifier = Modifier.padding(start = horizontalTitleGap)
                        ) {
                            title()
                            SpacerHeight()
                            subTitle()
                        }
                    }
                    trailing()
                }
            }
        }
    }

}