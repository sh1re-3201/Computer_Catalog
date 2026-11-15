# My City: Yogyakarta
=================================
> *"Your guide to the best places in the city of Yogyakarta"*

My City: Yogyakarta is a native Android application built with Jetpack Compose, Material 3, and Navigation Compose. Adapted from Google's Android Basics architecture (inspired by the "My City" codelab), this app lets users browse curated recommendations across Yogyakarta by category, view photos and details for each spot, and share places via the Android share sheet.

## Features
- **Guided City Exploration Flow**:
  1. **Start Screen**: Displays a Yogyakarta city photo, title, tagline, and an **Explore Yogyakarta** action.
  2. **Categories**: Choose from 5 categories — **Coffee Shops**, **Restaurants**, **Parks & Nature**, **Shopping Centers**, and **Tourist Attractions**.
  3. **Places List**: Browse 5 curated recommendations per category displayed as tappable cards with photo thumbnails.
  4. **Place Details**: View a larger photo, place name, short description, and address.
- **Native Sharing**: Share place details (name, description, address) to external apps (messaging, email, notes) using Android's native share sheet.
- **Modern Theme**: Material 3 Lime Green & Pastel Golden Yellow color scheme with dark mode support.

## Tech Stack & Architecture
- **Language**: Kotlin
- **UI Framework**: Jetpack Compose & Material 3
- **Navigation**: Navigation Compose (`NavHost` with backstack support)
- **Architecture**: Unidirectional Data Flow (UDF) with `ViewModel` and `StateFlow`
- **Gradle**: Gradle 8.4 with Android Gradle Plugin (AGP) 8.1.2

## Pre-requisites
- **JDK 17** (required by AGP 8.1.2 / Gradle 8.4)
- **Android Studio** (Giraffe or newer recommended)
- **Android SDK** (compileSdk 34, minSdk 24)

## Getting Started
1. Clone or open the repository in Android Studio.
2. Ensure your Gradle JDK is configured to **JDK 17** (`Settings/Preferences` -> `Build, Execution, Deployment` -> `Build Tools` -> `Gradle` -> `Gradle JDK`).
3. Build and run on an emulator or physical device running Android 7.0 (API 24) or higher.

To assemble debug APK from command line:
```powershell
$env:JAVA_HOME = "path/to/jdk-17"; .\gradlew.bat assembleDebug
```
