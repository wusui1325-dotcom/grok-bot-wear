# Grok Bot Wear (Unofficial)

Native Wear OS client for interacting with your existing Grok Bots.

**Status**: Early skeleton with basic navigation. No official public API exists for Grok Bot. Direct connection requires reverse-engineering or a phone relay. Upstream changes may break this client.

## Current Progress
- Bot list screen (ScalingLazyColumn + Chips)
- Conversation screen (message list + voice button stub + back)
- Simple state-based navigation between list and conversation
- BotRepository placeholder
- Wear OS Compose setup (standalone)

## Target Features
- Bot status glance (idle / running / waiting)
- Conversation list + small-screen optimized reading (pagination / summary)
- Voice input and quick replies
- Notifications with quick actions (approve, stop, reply)
- Standalone Wi-Fi connection after initial auth (goal)

## Tech Stack
- Kotlin
- Jetpack Compose for Wear OS
- Wear OS 5+ recommended

## Project Structure
```
app/
  src/main/
    java/com/wusper/grokbotwear/
      MainActivity.kt
      ui/
        BotListScreen.kt
        ConversationScreen.kt
      data/
        BotRepository.kt
    AndroidManifest.xml
  build.gradle.kts
```

## Getting Started
1. Clone this repo
2. Open in Android Studio (Hedgehog or newer recommended)
3. Sync Gradle (generate wrapper if prompted)
4. Add mipmap icons if missing
5. Implement the connection layer in `BotRepository`

## Disclaimer
This is an unofficial client. Not affiliated with xAI or Cursor. Use at your own risk. Do not store credentials in the repo.

## Roadmap
- [x] Basic Compose UI (bot list + conversation viewer)
- [ ] Voice input via Wear OS SpeechRecognizer
- [ ] Notification handling
- [ ] Auth flow (phone browser then watch Wi-Fi)
- [ ] Real connection to Grok Bot backend
