package com.example.helloword

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.helloword.ui.theme.HelloWordTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Surface (
                color = Color(0xFF2B2D42),
                modifier = Modifier
                    .fillMaxSize()
                    .safeDrawingPadding()
            ){
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Surface (
                        color = Color(0xFFEDF2F4),
                        modifier = Modifier
                            .size(320.dp),
                        shape = RoundedCornerShape(16.dp),
                        shadowElevation = 10.dp,
                    ){
                        Column(modifier = Modifier.padding(24.dp),
                            horizontalAlignment = Alignment.CenterHorizontally) {

                            val image = painterResource(R.drawable.avatar)
                            Image(
                                painter = image,
                                contentDescription = null
                            )
                            Spacer(modifier = Modifier.padding(18.dp))

                            Text(
                                text = "Guerreiro Kotlin",
                                color = Color.Black,
                                fontSize = 28.sp,
                                fontWeight = FontWeight.Bold,
                            )
                            Text(
                                text = "Mago Supremo",
                                color = Color.Gray,
                                fontSize = 16.sp,
                            )
                            Spacer(modifier = Modifier.padding(bottom = 32.dp))
                            Row(
                                horizontalArrangement = Arrangement.SpaceBetween,
                                modifier = Modifier.fillMaxWidth(),
                            ) {
                                Text(
                                    text = "LVL 99",
                                    color = Color.Black,
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold,
                                )
                                Text(
                                    text = "HP 5000",
                                    color = Color.Red,
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold,
                                    )
                            }
                            Spacer(modifier = Modifier.padding(top = 24.dp))
                            Text(
                                text = "Mestre no código limpo e caçador de bugs.",
                                fontSize = 14.sp,
                                textAlign = TextAlign.Center,
                            )
                            Button(
                                onClick = { /*TODO*/ },
                                modifier = Modifier
                                    .padding(top = 18.dp, bottom = 18.dp),
                                    colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(0xFF2B2D42),
                                    )
                                ) { Text(
                                    text = "JOGAR",
                                )
                            }
                        }
                    }


                }
            }
        }
    }

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HelloWordTheme {
        Greeting("World")
    }
}