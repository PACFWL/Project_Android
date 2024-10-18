package com.example.jetpackcomposebasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposebasics.ui.theme.JetpackComposeBasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeBasicsTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SaudacaoApp()
                }
            }
        }
    }
}

@Composable
fun SaudacaoApp() {
    val saudacao = remember { mutableStateOf("Olá, Jetpack Compose!") }

    Column {
        Text(text = saudacao.value)
        Button(onClick = {
            if (saudacao.value == "Olá, Jetpack Compose!") {
                saudacao.value = "Botão Clicado!"
            } else {
                saudacao.value = "Olá, Jetpack Compose!"
            }
        }) {
            Text("Clique Aqui")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewPadrao() {
    JetpackComposeBasicsTheme {
        SaudacaoApp()
    }
}
