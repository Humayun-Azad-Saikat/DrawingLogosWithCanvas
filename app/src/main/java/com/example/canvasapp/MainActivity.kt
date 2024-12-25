package com.example.canvasapp

import android.icu.text.ListFormatter
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.canvasapp.canvasLogoMaking.FaceBookLogo
import com.example.canvasapp.canvasLogoMaking.GooglePhotoIcon
import com.example.canvasapp.canvasLogoMaking.InstagramLogo
import com.example.canvasapp.canvasLogoMaking.MessangerLogo
import com.example.canvasapp.ui.theme.CanvasAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CanvasAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->


                    Column(
                        modifier = Modifier.fillMaxSize().padding(30.dp).padding(innerPadding),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        InstagramLogo()
                        FaceBookLogo()
                        MessangerLogo()
                        GooglePhotoIcon()
                    }

                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CanvasAppTheme {

    }
}