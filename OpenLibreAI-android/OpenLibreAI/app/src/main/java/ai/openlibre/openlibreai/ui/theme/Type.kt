package ai.openlibre.openlibreai.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import app.unicornapp.openlibreai.ui.theme.OpenLibreColor

val Typography = Typography(
    h1 = TextStyle(
        fontSize = 26.sp,
        fontWeight = FontWeight.Bold,
        color = OpenLibreColor.charcoal
    ),
    h2 = TextStyle(
        color = OpenLibreColor.charcoal,
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold
    ),
    body1 = TextStyle(
        color = OpenLibreColor.green
    ),
    body2 = TextStyle(
        fontWeight = FontWeight.Bold,
        color = OpenLibreColor.green
    ),
    button = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold
    )
)
