package com.tesji.figuras

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PantallaCohete()
        }
    }
}

@Composable
fun PantallaCohete() {
    Canvas(modifier = Modifier.fillMaxSize()) {
        val ancho = size.width
        val alto = size.height

        // Cuerpo del cohete
        drawRect(
            color = Color.Gray,
            topLeft = Offset(ancho * 0.45f, alto * 0.3f),
            size = Size(ancho * 0.1f, alto * 0.3f)
        )

        // Punta
        drawCircle(
            color = Color.Red,
            radius = ancho * 0.08f,
            center = Offset(ancho * 0.5f, alto * 0.28f)
        )

        // Ventana
        drawCircle(
            color = Color.Blue,
            radius = ancho * 0.03f,
            center = Offset(ancho * 0.5f, alto * 0.42f)
        )

        // Llamas
        drawOval(
            color = Color.Yellow,
            topLeft = Offset(ancho * 0.46f, alto * 0.6f),
            size = Size(ancho * 0.08f, alto * 0.12f)
        )
    }
}
