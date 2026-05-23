package com.example.splash.splash

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun SplashScreen(
    @DrawableRes image: Int,
    showButton: Boolean,
    buttonPadding: Dp = 20.dp,
    onNext: () -> Unit
) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {

        Image(
            painter = painterResource(id = image),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        if(showButton){

            BotonNext(
                onClick = onNext,
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = buttonPadding)
            )

        }
    }
}