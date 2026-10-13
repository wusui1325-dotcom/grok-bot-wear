package com.wusper.grokbotwear.data

/**
 * Placeholder for Grok Bot connection layer.
 *
 * Options:
 * 1. Phone companion via Wear Data Layer (safer short-term)
 * 2. Direct cloud connection after auth (goal, requires reverse-engineered or future official API)
 *
 * Current implementation is stub only.
 */
object BotRepository {
    data class BotInfo(
        val id: String,
        val name: String,
        val status: String // idle / running / waiting
    )

    fun getBots(): List<BotInfo> = emptyList()

    suspend fun sendMessage(botId: String, text: String): Result<Unit> {
        // TODO
        return Result.success(Unit)
    }

    suspend fun getConversation(botId: String): List<String> {
        // TODO
        return emptyList()
    }
}
