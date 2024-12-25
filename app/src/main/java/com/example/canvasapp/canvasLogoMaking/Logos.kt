package com.example.canvasapp.canvasLogoMaking

import android.graphics.Paint
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposeCompilerApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


//@Preview(showBackground = true)
@Composable
fun InstagramLogo(){

    Canvas(
        modifier = Modifier
            .padding(12.dp)
            .size(200.dp)
    ) {
        drawRoundRect(
            brush = Brush.linearGradient(
                listOf(Color.Red,Color.Blue)
            ),
            style = Stroke(50f),
            cornerRadius = CornerRadius(120f,120f)
        )

        drawCircle(
            brush = Brush.linearGradient(
                listOf(Color.Red,Color.Blue)
            ),
            style = Stroke(40f),
            radius = 100f
        )

        drawCircle(
            brush = Brush.linearGradient(
                listOf(Color.Red,Color.Blue)
            ),
            radius = 40f,
            center = Offset(
                x = size.width.times(.8f),
                y = size.width.times(.2f)
            )
        )

    }

}

//@Preview(showBackground = true)
@Composable
fun FaceBookLogo(){

    Canvas(
        modifier = Modifier
            .size(200.dp)
            .padding(12.dp)
    ) {


        val paint = Paint().apply {
            textAlign = Paint.Align.CENTER
            textSize = 500f
            color = Color.White.toArgb()
            strokeWidth = 320f
        }

        drawRoundRect(
            color = Color.Blue,
            cornerRadius = CornerRadius(x = 120f, y = 120f)
        )

        drawContext.canvas.nativeCanvas.drawText(
            "f",
            center.x,
            center.y+200f,
            paint
        )

    }

}

//@Preview(showBackground = true)
@Composable
fun MessangerLogo(){


    Canvas(
        modifier = Modifier
            .size(width = 200.dp, height = 200.dp)
            .padding(12.dp)
    ) {

        drawOval(
            color = Color.Blue,
            size = Size(
                width = size.width,
                height = size.height.times(.85f)
            )
        )

        val trianglePath = Path().apply {
            moveTo(
                size.width.times(.20f),
                size.height.times(.70f)
            )
            lineTo(
                size.width.times(0.20f),
                size.height.times(.95f)
            )
            lineTo(
                size.width.times(0.50f),
                size.height.times(0.80f)
            )
        }

        val electricSignPath = Path().apply {
            moveTo(
                size.width.times(.10f),
                size.height.times(.50f)
            )
            lineTo(
                size.width.times(.40f),
                size.height.times(.30f)
            )
            lineTo(
                size.width.times(.57f),
                size.height.times(.45f)
            )
            lineTo(
                size.width.times(.87f),
                size.height.times(.35f)
            )
            lineTo(
                size.width.times(.57f),
                size.height.times(.60f)
            )
            lineTo(
                size.width.times(.40f),
                size.height.times(.45f)
            )
            close()
        }

        drawPath(
            path = trianglePath,
            color = Color.Blue,
            style = Fill
        )

        drawPath(
            path = electricSignPath,
            color = Color.White,
            style = Fill

        )

    }

}

//@Preview(showBackground = true)
@Composable
fun GooglePhotoIcon(){

    Canvas(
        modifier = Modifier
            .size(200.dp, 200.dp)
            .padding(12.dp)
    ) {

        drawArc(
            color = Color.Blue,
            startAngle = 0f,
            sweepAngle = 180f,
            useCenter = true,
            topLeft = Offset(
                size.width.div(2f),
                size.height.times(.25f)
            ),
            size = Size(
                size.width.div(2f),
                size.height.div(2f)
            )
        )

        drawArc(
            color = Color.Red,
            startAngle = -90f,
            sweepAngle = 180f,
            useCenter = true,
            topLeft = Offset(
                size.width.times(.25f),
                0f
            ),
            size = Size(
                size.width.div(2f),
                size.height.div(2f)
            )
        )

        drawArc(
            color = Color.Yellow,
            startAngle = -180f,
            sweepAngle = 180f,
            useCenter = true,
            topLeft = Offset(
                0f,
                size.width.times(.25f)
            ),
            size = Size(
                size.width.div(2f),
                size.height.div(2f)
            )
        )

        drawArc(
            color = Color.Green,
            startAngle = -90f,
            sweepAngle = -180f,
            useCenter = true,
            topLeft = Offset(
                size.width.times(.25f),
                size.width.times(.5f)
            ),
            size = Size(
                size.width.div(2f),
                size.height.div(2f)
            )
        )
    }
    
}

