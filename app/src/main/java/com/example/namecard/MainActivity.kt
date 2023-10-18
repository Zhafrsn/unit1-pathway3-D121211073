package com.example.namecard

import android.R.attr.text
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.namecard.ui.theme.NameCardTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NameCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background

                ) {
                    NameCardPreview()
                }
            }
        }
    }
}

@Composable
fun GreetingMiddle() {
        val image = painterResource(R.drawable.eebe9fa62088a13cabf7e663fedf7ba4)
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(
                modifier = Modifier.background(Color(0xFF073042))
            ) {
                Image(painter = image, contentDescription = null, modifier = Modifier.size(158.dp))
            }
            Text(
                text = "A. Zhafran Zaky",
                fontSize = 30.sp,
                modifier = Modifier.padding(top = 16.dp)
            )
            Text(
                text = "Informatics Engineering Student",
                fontSize = 15.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFF073042),
                modifier = Modifier.padding(top = 9.dp)
            )
        }
}

@Composable
fun GreetingData(text: String, icon: ImageVector, modifier: Modifier = Modifier) {
    Row (
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = Modifier
            .padding(top = 17.dp)
    ) {
        Icon(imageVector = icon, contentDescription = null, modifier = Modifier.size(26.dp), tint = Color(0xFF073042))
        Text(text = text, fontSize = 21.sp, modifier = Modifier.padding(start = 11.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun NameCardPreview() {
    NameCardTheme {
        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
        ) {
            GreetingMiddle()
            Column (
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .padding(top = 195.dp, bottom = 58.dp)
            ) {
                GreetingData(text = "085824474779", icon = Icons.Default.Call)
                GreetingData(text = "@zhafrsn", icon = Icons.Default.Share)
                GreetingData(text = "zhafranzaky.imel@gmail.com", icon = Icons.Default.Email)
            }
        }
    }
}