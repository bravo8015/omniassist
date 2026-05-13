# OmniAssist - AI-Powered Android Voice Assistant

![Status](https://img.shields.io/badge/Status-Phase%201%20%26%202%20Complete-brightgreen)
![Language](https://img.shields.io/badge/Language-Kotlin-blue)
![Android](https://img.shields.io/badge/Android-14%2B-green)
![Compose](https://img.shields.io/badge/Compose-1.5%2B-blue)
![License](https://img.shields.io/badge/License-MIT-orange)

## 📱 About OmniAssist

OmniAssist is an enterprise-grade Android application that transforms your device into an intelligent voice-controlled automation assistant. It leverages cutting-edge AI models (OpenAI GPT, Google Gemini, Anthropic Claude) to understand and execute complex tasks through natural language commands.

### Key Features
- 🎙️ **Multi-Language Voice Control** (English, Urdu, Roman Urdu)
- 🤖 **Multi-AI Orchestration** (OpenAI, Gemini, Claude)
- ⚡ **Deep Device Automation** (Accessibility Services)
- 🧠 **Autonomous Learning** (Behavioral patterns, routine prediction)
- 🔐 **Enterprise Security** (Biometric, encrypted storage)
- 💾 **Smart Caching** (Local-first architecture)
- 📊 **Real-time Analytics** (Usage tracking, cost monitoring)

## 🏗️ Architecture

### Clean Architecture + MVVM + Repository Pattern

```
┌─────────────────────────────────────────┐
│           UI Layer (Compose)             │
│   (Screens, Navigation, Theme)           │
└─────────────────────────────────────────┘
                    ↓
┌─────────────────────────────────────────┐
│         ViewModel + State Management      │
│    (BaseViewModel, UIState, UIEvent)     │
└─────────────────────────────────────────┘
                    ↓
┌─────────────────────────────────────────┐
│       Repository + UseCase Layer         │
│  (Data abstraction, business logic)      │
└─────────────────────────────────────────┘
                    ↓
┌──────────────────┬──────────────────┐
│  Local Database  │  Remote APIs     │
│  (Room, Cache)   │  (Retrofit)      │
└──────────────────┴──────────────────┘
```

## 📦 Tech Stack

### Core Framework
- **Language:** Kotlin 1.9.20
- **UI Framework:** Jetpack Compose
- **Architecture:** MVVM + Clean Architecture
- **DI:** Hilt 2.48
- **Database:** Room 2.6.1
- **Async:** Kotlin Coroutines + Flow

### Backend Integration
- **APIs:** Retrofit 2.9.0 + OkHttp 4.11.0
- **Authentication:** Firebase Auth
- **Cloud Sync:** Firestore
- **Storage:** Firebase Storage
- **Logging:** Crashlytics + Timber
- **Analytics:** Firebase Analytics

### AI & Voice
- **Speech Recognition:** Android SpeechRecognizer + Whisper API
- **Text-to-Speech:** Android TTS + ElevenLabs
- **AI Providers:** OpenAI, Google Gemini, Anthropic Claude
- **ML:** TensorFlow Lite (Phase 5)

### Utilities
- **Security:** Android Keystore + AES-256
- **Permissions:** Android Permissions Framework
- **Background Tasks:** WorkManager 2.8.1
- **Media:** ExoPlayer 1.1.1
- **PDF Processing:** PDFBox + Apache POI

## 🚀 Getting Started

### Prerequisites
- Android Studio Giraffe or newer
- JDK 11+
- Android SDK API 28+
- Kotlin 1.9.20+

### Quick Setup (5 minutes)

1. **Clone Repository**
```bash
git clone https://github.com/bravo8015/omniassist.git
cd omniassist
```

2. **Copy Phase 1 & 2 Files**
```bash
# All files are in the omniassist_phase1_2/ directory
# Copy Gradle files, manifests, and Kotlin source files
```

3. **Configure Firebase**
- Create project at https://console.firebase.google.com
- Download `google-services.json`
- Place in `app/` folder

4. **Set API Keys**
```bash
# Create local.properties or set environment variables
export OPENAI_API_KEY="sk-..."
export GEMINI_API_KEY="..."
export CLAUDE_API_KEY="sk-ant-..."
export ELEVENLABS_API_KEY="..."
```

5. **Build & Run**
```bash
./gradlew clean build
# Run on emulator or device
```

## 📁 Project Structure

```
omniassist/
├── app/
│   ├── src/main/
│   │   ├── java/com/omniassist/
│   │   │   ├── OmniAssistApp.kt          [Phase 1]
│   │   │   ├── core/
│   │   │   │   ├── di/
│   │   │   │   │   ├── AppModule.kt      [Phase 2]
│   │   │   │   │   └── NetworkModule.kt  [Phase 2]
│   │   │   │   └── base/
│   │   │   │       └── BaseArchitecture.kt [Phase 2]
│   │   │   ├── data/
│   │   │   │   ├── local/
│   │   │   │   │   ├── database/
│   │   │   │   │   │   ├── OmniAssistDatabase.kt [Phase 2]
│   │   │   │   │   │   └── dao/ [Phase 2]
│   │   │   │   │   └── entity/ [Phase 2]
│   │   │   │   └── remote/
│   │   │   │       └── api/ [Phase 2]
│   │   │   ├── domain/
│   │   │   │   └── ai/
│   │   │   │       └── AIRouter.kt [Phase 2]
│   │   │   ├── features/
│   │   │   │   ├── automation/ [Phase 3]
│   │   │   │   ├── voice/ [Phase 3]
│   │   │   │   ├── dashboard/ [Phase 4]
│   │   │   │   └── security/ [Phase 5]
│   │   │   ├── services/ [Phase 3+]
│   │   │   ├── ui/ [Phase 4+]
│   │   │   └── utils/
│   │   │       └── ExtensionFunctions.kt [Phase 2]
│   │   └── AndroidManifest.xml [Phase 1]
│   └── build.gradle.kts [Phase 1]
├── build.gradle.kts [Phase 1]
├── settings.gradle.kts [Phase 1]
├── gradle.properties [Phase 1]
├── proguard-rules.pro [Phase 1]
└── README.md (this file)
```

## 📚 Documentation

### Phase 1 & 2 Complete
- ✅ [PHASE_1_2_COMPLETE_GUIDE.md](PHASE_1_2_COMPLETE_GUIDE.md) - Detailed implementation
- ✅ [DEPLOYMENT_GUIDE.md](DEPLOYMENT_GUIDE.md) - Setup and deployment
- ✅ [README.md](README.md) - This file

### Phase 3+ (To Come)
- [ ] Automation Engine Guide
- [ ] Voice Recognition Setup
- [ ] Dashboard Implementation
- [ ] Security Implementation
- [ ] Testing Guide
- [ ] API Integration Guide

## 🎯 Development Phases

### Phase 1: Architecture ✅ COMPLETE
- [x] Project structure & Gradle setup
- [x] AndroidManifest.xml configuration
- [x] Build configuration & dependencies
- [x] Application class setup
- [x] ProGuard rules

### Phase 2: Core Infrastructure ✅ COMPLETE
- [x] Dependency Injection (Hilt)
- [x] Database Layer (Room)
- [x] Network Layer (Retrofit)
- [x] AI Integration (Multi-provider)
- [x] Base Architecture (MVVM)
- [x] Utilities & Extensions

### Phase 3: Automation Engine 🔄 IN PROGRESS
- [ ] Accessibility Service
- [ ] Action Queue
- [ ] State Detection
- [ ] Error Recovery
- [ ] Multi-step Workflows

### Phase 4: Dashboard UI ⏳ PLANNED
- [ ] Main Dashboard Screen
- [ ] Navigation Structure
- [ ] Theme System
- [ ] Animations
- [ ] Material 3 Design

### Phase 5: Security & Optimization ⏳ PLANNED
- [ ] Biometric Authentication
- [ ] Emergency STOP Button
- [ ] Privacy Mode
- [ ] Performance Optimization
- [ ] Testing Suite

## 💡 Example Usage

### Voice Commands Supported

```
"Hey Omni, send WhatsApp message to Ali"
"OmniAssist, open Instagram"
"Navigate to Islamabad"
"Read my latest emails"
"Turn on battery saver"
"Summarize this PDF"
"Create a reminder for tomorrow at 9 AM"
"What's the weather?"
"Play my favorite music"
```

### Programmatic Usage

```kotlin
// Using AI Router
val router = AIRouter(context, aiLogsDao)

val provider = router.routeTask(
    TaskType.CODING,
    listOf(AIProvider.OPENAI, AIProvider.CLAUDE)
)

// Log operation
router.logOperation(
    userId = "user123",
    provider = provider,
    prompt = "Write a function",
    response = "fun example() { ... }",
    inputTokens = 50,
    outputTokens = 100,
    latencyMs = 1500,
    success = true
)
```

## 📊 Dependency Statistics

| Category | Count | Examples |
|----------|-------|----------|
| AndroidX | 14 | Core, Lifecycle, Compose |
| Firebase | 6 | Auth, Firestore, Crashlytics |
| Networking | 4 | Retrofit, OkHttp, Gson |
| Jetpack | 7 | Compose, Room, Hilt |
| Kotlin | 2 | Coroutines, Serialization |
| **Total** | **65+** | All integrated |

## 🔐 Security Features

### Implemented ✅
- Encrypted SharedPreferences
- API key management
- HTTPS-only networking
- ProGuard obfuscation
- Firebase security
- Runtime permission handling

### Planned 🔄
- Biometric authentication
- Certificate pinning
- Encrypted database
- Secure enclave for keys
- AppIntegrity verification

## 🧪 Testing

### Unit Tests
```bash
./gradlew test
```

### Integration Tests
```bash
./gradlew connectedAndroidTest
```

### Code Coverage
```bash
./gradlew testDebugUnitTestCoverage
```

## 📈 Performance Metrics

### Target Metrics
- **Startup Time:** < 2 seconds
- **Voice Latency:** < 500ms
- **Response Time:** < 3 seconds
- **Memory Usage:** < 150MB
- **Battery Impact:** < 5% per hour

### Current (Phase 2)
- Core infrastructure loaded
- Database operations: ~50ms
- API calls: ~1-3 seconds (depends on provider)

## 🤝 Contributing

Contributions welcome! Please:
1. Fork the repository
2. Create feature branch
3. Follow Kotlin style guide
4. Submit PR with tests

## 📝 Changelog

### v1.0.0 (Phase 1 & 2)
- ✅ Project architecture complete
- ✅ Database layer implemented
- ✅ AI integration setup
- ✅ DI configuration complete
- ✅ Base architecture ready

### v0.3.0 (Phase 3 - Coming)
- Automation engine
- Voice recognition
- Learning system

### v0.2.0 (Phase 4 - Coming)
- Dashboard UI
- Navigation
- Animations

### v0.1.0 (Phase 5 - Coming)
- Security implementation
- Testing suite
- App store release

## 📞 Support

### Issues & Bugs
- Report on GitHub Issues
- Include logs and reproduction steps
- Use [BUG REPORT](ISSUE_TEMPLATE/bug_report.md) template

### Feature Requests
- Use [FEATURE REQUEST](ISSUE_TEMPLATE/feature_request.md) template
- Vote on existing requests

### Questions
- Check [FAQ](FAQ.md)
- Ask on [Discussions](https://github.com/bravo8015/omniassist/discussions)

## 📜 License

MIT License - See [LICENSE](LICENSE) file

```
MIT License

Copyright (c) 2026 OmniAssist

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions...
```

## 👨‍💻 Authors

- **Lead Developer:** Bravo8015
- **Architecture:** Enterprise Clean Architecture Pattern
- **Contributors:** Community contributions welcome!

## 🙏 Acknowledgments

- Android Development Team
- Jetpack Compose Community
- Firebase & Google Cloud
- OpenAI, Google, Anthropic for AI APIs
- Kotlin Community

## 📱 Download

### Requirements
- Android 14+ (API 34+)
- Minimum 200MB storage
- 2GB RAM minimum
- Network connection

### From Source
```bash
git clone https://github.com/bravo8015/omniassist
cd omniassist
./gradlew installDebug
```

### From Google Play
Coming soon! (Currently in development)

---

## 🎯 Status Summary

| Phase | Component | Status |
|-------|-----------|--------|
| 1 | Architecture | ✅ Complete |
| 2 | Infrastructure | ✅ Complete |
| 3 | Automation | 🔄 In Progress |
| 4 | UI | ⏳ Planned |
| 5 | Security | ⏳ Planned |

**Overall Progress: 40% Complete** (Phase 1 & 2 of 5)

---

**Last Updated:** May 2026
**Version:** 1.0.0-PHASE2
**Status:** Active Development ✅

For the latest updates, visit https://github.com/bravo8015/omniassist
