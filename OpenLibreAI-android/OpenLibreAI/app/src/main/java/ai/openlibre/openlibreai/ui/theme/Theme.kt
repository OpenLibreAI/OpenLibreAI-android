package app.unicornapp.openlibreai.ui.theme

import ai.openlibre.openlibreai.ui.theme.OpenLibreColor
import ai.openlibre.openlibreai.ui.theme.Shapes
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import ai.openlibre.openlibreai.ui.theme.Typography

val Purple700 = Color(0xFFEE9972)

private val LightColorPalette = lightColors(
    primary = OpenLibreColor.yellow,
    primaryVariant = Purple700,
    secondary = OpenLibreColor.pink
)

@Composable
fun OpenLibreTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    MaterialTheme(
        colors = LightColorPalette,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
