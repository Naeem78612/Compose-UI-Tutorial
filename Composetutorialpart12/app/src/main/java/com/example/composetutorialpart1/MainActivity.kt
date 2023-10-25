package com.example.composetutorialpart1
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import android.os.Bundle
import androidx.compose.ui.res.stringResource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

import androidx.compose.ui.tooling.preview.Preview
import com.example.composetutorialpart1.ui.theme.Composetutorialpart1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Composetutorialpart1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TextExamples()
                }
            }
        }
    }
}
@Composable
fun TextExamples() {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(36.dp)
    ) {
        Image(

            painter = painterResource(id = R.drawable.bg_compose_background),
            modifier = Modifier
                .fillMaxWidth(),
            contentDescription = "Image",


        )
        Text(

            text="Jetpack Compose Tutorial",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold

        )

        Text(

            text = stringResource(R.string.message1)


        ) // Styled text with custom font size, weight, and color

        Text(

            text = stringResource(R.string.message2)

        ) // Centered text using alignment modifier

    }
}

