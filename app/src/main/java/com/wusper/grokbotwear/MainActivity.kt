package com.wusper.grokbotwear

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.Scaffold
import androidx.wear.compose.material.TimeText
import com.wusper.grokbotwear.ui.BotListScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GrokBotWearApp()
        }
    }
}

@Composable
fun GrokBotWearApp() {
    MaterialTheme {
        Scaffold(
            timeText = { TimeText() }
        ) {
            BotListScreen()
        }
    }
}
