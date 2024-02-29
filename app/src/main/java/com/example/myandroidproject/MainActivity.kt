package com.example.myandroidproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.myandroidproject.ui.theme.MyAndroidProjectTheme
import net.skyscanner.backpack.compose.card.BpkCard
import net.skyscanner.backpack.compose.card.BpkCardCorner
import net.skyscanner.backpack.compose.theme.BpkTheme
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAndroidProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyCard()
                }
            }
        }
    }
}

@Composable
fun MyCard() =
    Column (
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "Flight Number FL900", style = MaterialTheme.typography.headlineLarge, modifier = Modifier.padding(top = 40.dp, bottom = 20.dp), color = Color.Black)
        BpkTheme{
            BpkCard(corner = BpkCardCorner.Large, modifier = Modifier.width(350.dp).padding(15.dp)) {
                Column {
                    Text(text = "Departure Card", style = MaterialTheme.typography.headlineLarge, color = Color.DarkGray)
                    Text(text = "JAX Airport", style = MaterialTheme.typography.headlineMedium, color = Color.Gray)
                    Text(text = "Departure Time: 14:00 EST", style = MaterialTheme.typography.headlineSmall, color = Color.LightGray)
                }
            }
            BpkCard(corner = BpkCardCorner.Large, modifier = Modifier.width(350.dp).padding(15.dp)) {
                Column {
                    Text(text = "Arrival Card", style = MaterialTheme.typography.headlineLarge, color = Color.DarkGray)
                    Text(text = "MIA Airport", style = MaterialTheme.typography.headlineMedium, color = Color.Gray)
                    Text(text = "Arrival Time: 16:00 EST", style = MaterialTheme.typography.headlineSmall, color = Color.LightGray)
                }
            }
        }
    }



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name! hey there!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyAndroidProjectTheme {
        Greeting("Android")
    }
}