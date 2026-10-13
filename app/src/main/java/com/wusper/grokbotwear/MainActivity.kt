package com.wusper.grokbotwear

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.Scaffold
import androidx.wear.compose.material.TimeText
import com.wusper.grokbotwear.ui.BotListScreen
import com.wusper.grokbotwear.ui.ConversationScreen

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
    var currentBot by remember { mutableStateOf<String?>(null) }

    MaterialTheme {
        Scaffold(
            timeText = { TimeText() }
        ) {
            if (currentBot == null) {
                BotListScreen(onBotClick = { name -> currentBot = name })
            } else {
                ConversationScreen(
                    botName = currentBot!!,
                    onBack = { currentBot = null },
                    onVoiceInput = {
                        // TODO: launch SpeechRecognizer / voice session
                    }
                )
            }
        }
    }
}
