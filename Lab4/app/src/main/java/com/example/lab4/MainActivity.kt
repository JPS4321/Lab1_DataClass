package com.example.lab4

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.size.Size
import com.example.lab4.ui.theme.Lab4Theme
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import coil.compose.rememberImagePainter
import androidx.compose.foundation.layout.size


class MainActivity : ComponentActivity() {
    val itemList = mutableStateListOf<String>()


    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.LightGray)
            ) {
                Text(
                    text = "Bienvenidos al programa",
                    color = Color.Black,
                    fontSize = 30.sp,
                    modifier = Modifier.align(Alignment.TopCenter)
                )
                Text(
                    text = "Ingresa el nombre de la receta",
                    color = Color.Black,
                    fontSize = 20.sp,
                    modifier = Modifier.offset(x = 60.dp, y = 100.dp)
                )
                Text(
                    text = "Ingresa el url de la imagen",
                    color = Color.Black,
                    fontSize = 20.sp,
                    modifier = Modifier.offset(x = 60.dp, y = 230.dp)
                )
                LazyColumn(
                    modifier = Modifier
                        .align(Alignment.BottomStart)
                        .padding(16.dp)
                ) {
                    items(itemList) { item ->
                        val (recipeName, imageUrl) = item.split(", ")
                        Column(modifier = Modifier.padding(8.dp)) {
                            Text(recipeName)
                            Text(imageUrl)
                        }
                    }
                }

                var textValue by remember { mutableStateOf("") }
                var textoValue by remember { mutableStateOf("") }

                Slate1(text = textValue, onTextChange = { newValue -> textValue = newValue })
                Slate2(texto = textoValue, onTextoChange = { newValue -> textoValue = newValue })

                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    MiPrimerBoton(text = textValue, texto = textoValue) {
                        itemList.add("Receta: $textValue, URL: $textoValue")
                        textValue = ""
                        textoValue = ""
                    }
                }
            }
        }


    }
}


@Composable
fun MiPrimerBoton(text: String, texto: String, onSave: () -> Unit) {
    val context = LocalContext.current
    var showToast by remember { mutableStateOf(false) }

    Button(onClick = {
        onSave()
        showToast = true
    }) {
        Text(text = "Guardar Informacion")
    }

    LaunchedEffect(showToast) {
        if (showToast) {
            Toast.makeText(context, "Se ha guardado la receta", Toast.LENGTH_SHORT).show()
            showToast = false
        }
    }
}






@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Slate1(text: String, onTextChange: (String) -> Unit) {
    Column(modifier = Modifier.fillMaxSize()) {
        OutlinedTextField(
            value = text,
            onValueChange = onTextChange,
            modifier = Modifier.offset(x = 60.dp, y = 145.dp)
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Slate2(texto: String, onTextoChange: (String) -> Unit) {
    Column(modifier = Modifier.fillMaxSize()) {
        OutlinedTextField(
            value = texto,
            onValueChange = onTextoChange,
            modifier = Modifier.offset(x = 60.dp, y = 270.dp)
        )
    }
}


