package com.example.contador7wonders

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.contador7wonders.ui.theme.Contador7WondersTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        /*
        setContent {
            Contador7WondersTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
         */
        setContentView(R.layout.activity_main)
    }
    fun onClickCartaAzul(view: android.view.View){
        Log.d("MainActivity","Azul")
    }

    fun onClickCartaVerde(view: android.view.View){
        Log.d("MainActivity","Verde")
    }

    fun onClickCartaAmarillo(view: android.view.View){
        Log.d("MainActivity","Amarillo")
    }

    fun onClickCartaMorado(view: android.view.View){
        Log.d("MainActivity","Morado")
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Contador7WondersTheme {
        Greeting("Android")
    }
}

