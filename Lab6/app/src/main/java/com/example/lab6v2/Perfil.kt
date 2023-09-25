package com.example.lab6v2

import androidx.compose.ui.text.style.TextAlign
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.background
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.BasicText
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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import com.example.lab6v2.ui.theme.Lab6V2Theme


class Perfil : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab6V2Theme {
                Column(
                    modifier = Modifier.fillMaxSize()
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(300.dp),
                        contentAlignment = Alignment.TopCenter
                    ) {
                        BackgroundImage()
                        CircularImage()
                        TextWithGrayBox()

                    }
                    ButtonList()
                    GoBackButton { finish() }

                }
            }
        }
    }
}

@Composable
fun BackgroundImage() {
    val image = painterResource(id = R.drawable.fondop)
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
fun CircularImage() {
    val image = painterResource(id = R.drawable.perfil)
    Image(
        painter = image,
        contentDescription = null,
        modifier = Modifier
            .size(150.dp)
            .offset(y = 100.dp)
            .clip(CircleShape)
    )
}
@Composable
fun TextWithGrayBox() {
    BasicText(
        "  Jack Grealish  ",
        modifier = Modifier
            .offset(y = 250.dp)
            .background(Color.Gray)
            .padding(8.dp),
        style = androidx.compose.ui.text.TextStyle(
            color = Color.White,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
    )
}

@Composable
fun ButtonList() {
    val buttons = listOf("Editar Perfil", "Cambiar Contraseña", "Notificaciones", "Favoritos")
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        buttons.forEach { buttonText ->
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .border(2.dp, Color.White)
                    .background(Color.Gray)
                    .clickable { /* Handle click here */ }
            ) {
                Text(
                    text = buttonText,
                    color = Color.Black,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.align(Alignment.Center),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Composable
fun GoBackButton(onClick: () -> Unit) {
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