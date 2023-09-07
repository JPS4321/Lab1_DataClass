package com.example.lab5v2

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class Evento(val nombre: String,val Descripcion: String,val Lugar: String,val fecha: String)

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Scaffold(
                topBar = {
                    TopAppBar(title = {
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier.fillMaxSize()
                        ) {
                            Text(
                                text = "TodoEvento+",
                                color = Color.White,
                                fontSize = 30.sp
                            )
                        }
                    })
                }
            ) {
                Box(
                    modifier = Modifier.fillMaxSize()
                ) {
                    Text(
                        text = "Informacion de Conciertos Proximos",
                        color = Color.Black,
                        fontSize = 22.sp,
                        modifier = Modifier.offset(x = 20.dp, y = 100.dp)
                    )
                    Text(
                        text = "Ubicaciones",
                        color = Color.Black,
                        fontSize = 24.sp,
                        modifier = Modifier.offset(x = 130.dp, y = 255.dp)
                    )
                    Text(
                        text = "Mi Perfil",
                        color = Color.Black,
                        fontSize = 25.sp,
                        modifier = Modifier.offset(x = 150.dp, y = 400.dp)
                    )
                    Text(
                        text = "Informacion Evento Especifico",
                        color = Color.Black,
                        fontSize = 24.sp,
                        modifier = Modifier.offset(x = 30.dp, y = 550.dp)
                    )
                    CustomButton(
                        icon = Icons.Default.ArrowForward,  // Use the ArrowForward icon
                        xPos = 130.dp, yPos = 590.dp, width = 140.dp, height = 80.dp,
                        context = this@MainActivity,
                        destinationActivity =  DescripcionEvento::class.java,
                        iconSize = 40.dp,  // Set the desired size for the icon

                    )


                    CustomButton(
                        icon = Icons.Default.ArrowForward,  // Use the ArrowForward icon
                        xPos = 120.dp, yPos = 150.dp, width = 140.dp, height = 80.dp,
                        context = this@MainActivity,
                        destinationActivity =  EventosPro::class.java,
                        iconSize = 40.dp,  // Set the desired size for the icon

                    )

                    CustomButton(
                        icon = Icons.Default.ArrowForward,  // Use the ArrowForward icon
                        xPos = 120.dp, yPos = 300.dp, width = 140.dp, height = 80.dp,
                        context = this@MainActivity,
                        destinationActivity =  LugaresLista::class.java,
                        iconSize = 40.dp,  // Set the desired size for the icon

                    )
                    CustomButton(
                        icon = Icons.Default.ArrowForward,  // Use the ArrowForward icon
                        xPos = 126.dp, yPos = 450.dp, width = 140.dp, height = 80.dp,
                        context = this@MainActivity,
                        destinationActivity =  Perfil::class.java,
                        iconSize = 40.dp,  // Set the desired size for the icon

                    )



                }
            }
        }
    }
}
@Composable
fun CustomButton(
    icon: ImageVector,  // ImageVector for the icon
    xPos: Dp,
    yPos: Dp,
    width: Dp,
    height: Dp,
    iconSize: Dp,  // New parameter for the icon size
    context: Context,
    destinationActivity: Class<*>,
    onClickExtras: (() -> Unit)? = null
) {
    Button(
        modifier = Modifier
            .offset(x = xPos, y = yPos)
            .size(width = width, height = height),
        onClick = {
            val intent = Intent(context, destinationActivity)
            context.startActivity(intent)

            // Execute any extra actions if provided
            onClickExtras?.invoke()
        }
    ) {
        Icon(
            icon,
            contentDescription = null,
            modifier = Modifier.size(iconSize),  // Adjust the size
            tint = Color.White  // Set the color to white
        )
    }
}




