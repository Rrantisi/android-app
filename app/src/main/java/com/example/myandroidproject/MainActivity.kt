package com.example.myandroidproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myandroidproject.ui.theme.MyAndroidProjectTheme
import net.skyscanner.backpack.compose.card.BpkCard
import net.skyscanner.backpack.compose.card.BpkCardCorner
import net.skyscanner.backpack.compose.theme.BpkTheme

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
    Column {
        Text(text = "Flight Number F900", style = MaterialTheme.typography.headlineMedium)
        BpkTheme{
            BpkCard(corner = BpkCardCorner.Large) {
                Column {
                    Text(text = "Departure Card", style = MaterialTheme.typography.headlineLarge)
                    Text(text = "Airport JAX", style = MaterialTheme.typography.headlineMedium)
                    Text(text = "Departure Time: 14:00", style = MaterialTheme.typography.headlineSmall)
                }
            }
            BpkCard(corner = BpkCardCorner.Large) {
                Column {
                    Text(text = "Arrival Card", style = MaterialTheme.typography.headlineLarge)
                    Text(text = "Airport MIA", style = MaterialTheme.typography.headlineMedium)
                    Text(text = "Arrival Time: 16:00", style = MaterialTheme.typography.headlineSmall)
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