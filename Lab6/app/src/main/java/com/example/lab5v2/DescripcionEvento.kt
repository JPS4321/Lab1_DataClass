package com.example.lab5v2

import androidx.compose.ui.text.style.TextAlign
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.background
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import com.example.lab5v2.ui.theme.Lab5V2Theme


class DescripcionEvento : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab5V2Theme {
                // A surface container using the 'background' color from the theme
                Column(
                    modifier = Modifier.fillMaxSize()
                ){
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(300.dp),
                        contentAlignment = Alignment.TopCenter
                    ){
                        Imagen()
                        TextoGris()
                    }
                    BoldTexto("Fecha")
                    TextoNormal("7/2/2023")
                    BoldTexto("About")
                    TextoNormal("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse at ante pretium, dictum felis sed, volutpat lacus. Pellentesque eget facilisis sem, vitae mattis nisi. Vestibulum sollicitudin sagittis nunc ac tempus. Praesent vel imperdiet neque. Sed sed gravida odio. Phasellus pharetra venenatis purus, at porta nisl tincidunt id. Morbi sodales sagittis massa eu tempus. Mauris mi metus, tincidunt ac mi ut, dignissim sollicitudin metus.")
                    Regreso { finish() }

                }
            }
        }
    }
}

@Composable
fun Imagen() {
    val image = painterResource(id = R.drawable.mundial) // Make sure this image is in your `res/drawable` folder
    Image(
        painter = image,
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp)
    )
}

@Composable
fun TextoGris() {
    BasicText(
        "  MUNDIAL QATAR  ",
        modifier = Modifier
            .offset(y = 250.dp, x = 0.dp) // Positioning below the circular image
            .background(Color.Gray) // Gray box
            .padding(8.dp),  // Padding inside the gray box
        style = androidx.compose.ui.text.TextStyle(
            color = Color.White,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
    )
}
@Composable
fun BoldTexto(

    textoB: String = ""
) {
    Box(
        modifier = Modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.Center

    ) {
        Text(
            text = textoB,
            fontWeight = FontWeight.Bold
        )
    }
}
@Composable
fun TextoNormal(
    texto: String = ""
) {
    Box(
        modifier = Modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.Center

    ) {
        Text(
            text = texto,
        )
    }
}

@Composable
fun Regreso(onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .border(2.dp, Color.Gray)
            .background(Color.White)
            .clickable { onClick() },
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Go Back",
            color = Color.Black,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
    }
}