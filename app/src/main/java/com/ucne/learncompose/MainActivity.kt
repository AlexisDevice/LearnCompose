package com.ucne.learncompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ucne.learncompose.ui.theme.LearnComposeTheme
import java.time.LocalDateTime

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SimpleOutlinedTextFieldSample()
                }
            }
        }
    }
}

@Composable
fun SimpleOutlinedTextFieldSample() {
    var text by remember { mutableStateOf("") }
    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        value = text,
        onValueChange = { text = it },
        label = { Text("Nombres") }
    )
}

@Composable
fun OutlinedButtonExample() {
    OutlinedButton(
        onClick = { },
        modifier = Modifier.fillMaxWidth()
    ) {
        Text("Guardar")
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    LearnComposeTheme {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            SimpleOutlinedTextFieldSample()
            OutlinedButtonExample()
        }
    }
}