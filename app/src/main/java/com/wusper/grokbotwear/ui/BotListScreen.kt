package com.wusper.grokbotwear.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.wear.compose.foundation.lazy.ScalingLazyColumn
import androidx.wear.compose.material.Chip
import androidx.wear.compose.material.ListHeader
import androidx.wear.compose.material.Text

@Composable
fun BotListScreen() {
    // TODO: replace with real data from BotRepository
    val bots = listOf(
        "Grok 新" to "idle",
        "幕僚長助手" to "running",
        "秘書" to "waiting"
    )

    ScalingLazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        item {
            ListHeader {
                Text("Grok Bots")
            }
        }
        items(bots.size) { index ->
            val (name, status) = bots[index]
            Chip(
                onClick = { /* navigate to conversation */ },
                label = { Text(name) },
                secondaryLabel = { Text(status) },
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
            )
        }
    }
}
