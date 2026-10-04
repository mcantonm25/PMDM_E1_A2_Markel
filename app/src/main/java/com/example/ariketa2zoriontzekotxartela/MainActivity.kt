package com.example.ariketa2zoriontzekotxartela

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.Scaffold
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.*
import androidx.compose.material3.Text
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.text.style.TextAlign
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
    Column(
        modifier = modifier.padding(20.dp).fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Zorionak!",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1B5E20),
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 16.dp)
        )

        Image(
            painter = fondoa,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp)
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Eta urte berri on!",
                fontSize = 18.sp,
                color = Color(0xFFB71C1C),
                textAlign = TextAlign.Center
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ZorionakTestuaPreview() {
    Ariketa2ZoriontzekoTxartelaTheme {
        ZorionakTestua()
    }
}