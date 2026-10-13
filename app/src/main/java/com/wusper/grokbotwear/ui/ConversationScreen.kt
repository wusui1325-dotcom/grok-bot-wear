package com.wusper.grokbotwear.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.wear.compose.foundation.lazy.ScalingLazyColumn
import androidx.wear.compose.material.Button
import androidx.wear.compose.material.Chip
import androidx.wear.compose.material.ListHeader
import androidx.wear.compose.material.Text

@Composable
fun ConversationScreen(
    botName: String,
    onBack: () -> Unit,
    onVoiceInput: () -> Unit
) {
    // TODO: load real messages from BotRepository
    val messages = listOf(
        "User: 幫我查一下今天的行程",
        "Bot: 已同步 Google Calendar。下午 3 點有 house meeting。",
        "User: 準備要帶什麼？",
        "Bot: 學生證、水壺、科學筆記本。長篇回覆會在這裡分頁顯示，適合小螢幕閱讀。"
    )

    ScalingLazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        item {
            ListHeader { Text(botName) }
        }
        items(messages.size) { index ->
            Text(
                text = messages[index],
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp)
            )
        }
        item {
            Button(
                onClick = onVoiceInput,
                modifier = Modifier.padding(8.dp)
            ) {
                Text("語音輸入")
            }
        }
        item {
            Chip(
                onClick = onBack,
                label = { Text("返回") },
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}
