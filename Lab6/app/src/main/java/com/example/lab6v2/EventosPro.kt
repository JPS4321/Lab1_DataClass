package com.example.lab6v2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.platform.LocalContext

class EventosPro() : ComponentActivity() {
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
                                fontSize = 31.sp
                            )
                        }
                    })
                }
            ) {
                prueba()


            }

        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun prueba() {
    val context = LocalContext.current
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        item {
            Box(
                modifier = Modifier.fillMaxSize()
            ) {
                Text(
                    text = "Favoritos",
                    color = Color.Black,
                    fontSize = 33.sp,
                    modifier = Modifier
                        .offset(x = 20.dp, y = 50.dp)
                        .align(Alignment.TopStart),
                )
            }
            Box(modifier = Modifier) {
                Column() {
                    Row() {
                        Card(
                            modifier = Modifier
                                .width(185.dp)
                                .height(240.dp)
                                .padding(10.dp)
                                .clickable{
                                    val intent = Intent(context, DescripcionEventos::class.java)
                                    context.startActivity(intent)
                                },
                            shape = RoundedCornerShape(15.dp)
                        ) {
                            Box(modifier = Modifier.fillMaxSize()) {
                                Image(
                                    modifier = Modifier,
                                    painter = painterResource(id = R.drawable.shaki),
                                    contentDescription = null
                                )
                                Text(
                                    modifier = Modifier.padding(top = 170.dp, start = 15.dp),
                                    text = "Shakira",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Text(
                                    modifier = Modifier.padding(top = 190.dp, start = 15.dp),
                                    text = "Cayala",
                                    fontSize = 14.sp,
                                )
                            }
                        }
                        Card(
                            modifier = Modifier
                                .width(185.dp)
                                .height(240.dp)
                                .padding(10.dp).clickable{
                                    val intent = Intent(context, DescripcionEventos::class.java)
                                    context.startActivity(intent)
                                },
                            shape = RoundedCornerShape(15.dp)
                        ) {
                            Box(modifier = Modifier.fillMaxSize()) {
                                Image(
                                    modifier = Modifier,
                                    painter = painterResource(id = R.drawable.bad),
                                    contentDescription = null
                                )
                                Text(
                                    modifier = Modifier.padding(top = 170.dp, start = 15.dp),
                                    text = "Bad Bunny",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Text(
                                    modifier = Modifier.padding(top = 190.dp, start = 15.dp),
                                    text = "Cayala",
                                    fontSize = 14.sp,
                                )
                            }
                        }
                    }

                    Row() {
                        Card(
                            modifier = Modifier
                                .width(185.dp)
                                .height(240.dp)
                                .padding(10.dp)
                                .clickable{
                                    val intent = Intent(context, DescripcionEventos::class.java)
                                    context.startActivity(intent)
                                },
                            shape = RoundedCornerShape(15.dp)
                        ) {
                            Box(modifier = Modifier.fillMaxSize()) {
                                Image(
                                    modifier = Modifier,
                                    painter = painterResource(id = R.drawable.peso),
                                    contentDescription = null
                                )
                                Text(
                                    modifier = Modifier.padding(top = 170.dp, start = 15.dp),
                                    text = "Peso Pluma",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Text(
                                    modifier = Modifier.padding(top = 190.dp, start = 15.dp),
                                    text = "Majadas",
                                    fontSize = 14.sp,
                                )
                            }
                        }
                        Card(
                            modifier = Modifier
                                .width(185.dp)
                                .height(240.dp)
                                .padding(10.dp)
                                .clickable{
                                    val intent = Intent(context, DescripcionEventos::class.java)
                                    context.startActivity(intent)
                                },
                            shape = RoundedCornerShape(15.dp)
                        ) {
                            Box(modifier = Modifier.fillMaxSize()) {
                                Image(
                                    modifier = Modifier,
                                    painter = painterResource(id = R.drawable.united),
                                    contentDescription = null
                                )
                                Text(
                                    modifier = Modifier.padding(top = 170.dp, start = 15.dp),
                                    text = "Manchester United",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Text(
                                    modifier = Modifier.padding(top = 190.dp, start = 15.dp),
                                    text = "Old Trafford",
                                    fontSize = 14.sp,
                                )
                            }
                        }
                    }

                }
            }

        }
    }
}

