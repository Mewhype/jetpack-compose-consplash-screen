package com.example.splash.splash

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BotonNext(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {

    Box(
        modifier = modifier
            .size(
                width = 70.dp,
                height = 48.dp
            )
            .clip(
                RoundedCornerShape(16.dp)
            )
            .background(
                brush = Brush.horizontalGradient(
                    colors = listOf(
                        Color(0xFF1E1E1E),
                        Color(0xFF2C2C2C)
                    )
                )
            )
            .border(
                width = 1.dp,
                color = Color(0xFF454545),
                shape = RoundedCornerShape(16.dp)
            )
            .clickable {
                onClick()
            },

        contentAlignment = Alignment.Center
    ) {

        Text(
            text = "❯",
            color = Color(0xFFFF6B35),
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )
    }
}