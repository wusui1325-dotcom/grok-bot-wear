# Grok Bot Wear (Unofficial)

Native Wear OS client for interacting with your existing Grok Bots.

**Status**: Experimental skeleton. No official public API exists for Grok Bot. Direct connection requires reverse-engineering or a phone relay. Upstream changes may break this client.

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

## Project Structure (planned)
```
app/
  src/main/
    java/com/wusper/grokbotwear/
      MainActivity.kt
      ui/
        BotListScreen.kt
        ConversationScreen.kt
        VoiceInput.kt
      data/
        BotRepository.kt   // placeholder for connection layer
    AndroidManifest.xml
  build.gradle.kts
```

## Getting Started
1. Clone this repo
2. Open in Android Studio (Hedgehog or newer recommended)
3. Create a Wear OS module if not present, set minSdk to 30+ (Wear OS 4/5)
4. Implement the connection layer in `BotRepository` (currently stubbed)

## Disclaimer
This is an unofficial client. Not affiliated with xAI or Cursor. Use at your own risk. Do not store credentials in the repo.

## Roadmap
- [ ] Basic Compose UI (bot list + conversation viewer)
- [ ] Voice input via Wear OS SpeechRecognizer
- [ ] Notification handling
- [ ] Auth flow (phone browser then watch Wi-Fi)
- [ ] Real connection to Grok Bot backend
