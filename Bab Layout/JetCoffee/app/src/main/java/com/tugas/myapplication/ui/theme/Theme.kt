package com.tugas.myapplication.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val CoffeeBrown = Color(0xFF886345)
val LightCoffeeBrown = Color(0xFFC4A68A)
val LightGray = Color(0xFFBBBBBB)

private val DarkColorPalette = darkColors(
    primary = LightCoffeeBrown,
    primaryVariant = LightCoffeeBrown,
    secondary = Teal200
)

private val LightColorPalette = lightColors(
    primary = CoffeeBrown,
    primaryVariant = CoffeeBrown,
    secondary = Teal200

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun JetCoffeeTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}