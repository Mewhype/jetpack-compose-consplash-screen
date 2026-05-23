package com.example.splash.navegacion

import androidx.compose.runtime.*
import kotlinx.coroutines.delay
import com.example.splash.R
import com.example.splash.splash.SplashScreen
import androidx.compose.ui.unit.dp

@Composable
fun Navegacion() {
    var pantalla by remember { mutableIntStateOf(0) }

    LaunchedEffect(Unit) {
        delay(4000)
        pantalla = 1
    }

    when (pantalla) {
        0 -> SplashScreen(
            image = R.drawable.principal,
            showButton = false,
            onNext = {}
        )

        1 -> SplashScreen(
            image = R.drawable.pantalla1,
            showButton = true,
            buttonPadding = 18.dp,
            onNext = {
                pantalla = 2
            }
        )

        2 -> SplashScreen(
            image = R.drawable.pantalla2,
            showButton = true,
            buttonPadding = 18.dp,
            onNext = {
                pantalla = 3
            }
        )

        3 -> SplashScreen(
            image = R.drawable.pantalla3,
            showButton = true,
            buttonPadding = 18.dp,
            onNext = { }
        )
    }
}