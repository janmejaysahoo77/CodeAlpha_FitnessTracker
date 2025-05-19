Fitness Tracker App
A simple and intuitive Fitness Tracker Android app built with Kotlin, following modern Android architecture using Fragments, Navigation Component, and Activities.
Users can log workouts, track progress, set fitness goals, and monitor their daily activity — all in one place.

🚀 Features
📋 Home Screen with progress overview

🔥 Start Workout Timer in a separate Activity

➕ Add Workout with details like name, duration, and calories burned

🎯 Set Goals (e.g., daily calorie target)

📈 Track Progress visually through bars and stats

🧭 Bottom Navigation for smooth switching between sections

🧱 Tech Stack
Language: Kotlin

Architecture: MVVM-inspired structure

UI Components: Fragments, Activities, Navigation Component

Material Design: BottomNavigationView, ConstraintLayout

Navigation: Jetpack Navigation

State Handling: Lifecycle-aware
com.example.fitnesstracker/
│
├── MainActivity.kt                # Hosts the Navigation and BottomNav
├── HomeFragment.kt                # Dashboard with workout summary
├── AddWorkoutFragment.kt         # Allows user to log workouts
├── GoalsFragment.kt              # User-defined daily/weekly targets
├── ProgressFragment.kt           # Displays calories burned etc.
├── StartWorkoutActivity.kt       # Separate screen for workout timer
│
├── res/layout/                   # UI XML files
│   ├── activity_main.xml
│   ├── fragment_home.xml
│   ├── fragment_add_workout.xml
│   ├── fragment_goals.xml
│   ├── fragment_progress.xml
│   ├── activity_start_workout.xml
│
├── res/navigation/nav_graph.xml  # Navigation flow
└── res/menu/bottom_nav_menu.xml  # Bottom navigation menu
 Getting Started
To run this app:

Clone the repository

Open in Android Studio

Sync Gradle and build the project

Run the app on an emulator or device with minSdk 28+

📝 Future Improvements
Save workout logs to local DB (Room)

Add charts for weekly/monthly trends

Firebase sync for user history

Notifications/reminders for daily goals

🤝 Contributing
Feel free to fork and suggest improvements.
Pull requests are welcome!
