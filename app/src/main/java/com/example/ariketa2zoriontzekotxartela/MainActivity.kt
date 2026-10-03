package com.example.ariketa2zoriontzekotxartela

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.Image
import androidx.compose.material3.Scaffold
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ariketa2zoriontzekotxartela.ui.theme.Ariketa2ZoriontzekoTxartelaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ariketa2ZoriontzekoTxartelaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ZorionakTestua(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun ZorionakTestua(modifier: Modifier = Modifier) {
    val fondoa = painterResource(R.drawable.ariketa_background)
    Column(modifier.padding(all=30.dp).fillMaxSize()) {
        Image (
            painter = fondoa,
            contentDescription = null
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ZorionakTestuaPreview() {
    Ariketa2ZoriontzekoTxartelaTheme {
        ZorionakTestua()
    }
}