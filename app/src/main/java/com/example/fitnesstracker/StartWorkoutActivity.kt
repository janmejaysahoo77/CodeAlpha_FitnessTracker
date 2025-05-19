package com.example.fitnesstracker

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class StartWorkoutActivity : AppCompatActivity() {

    private var seconds = 0
    private var isRunning = true
    private val handler = Handler(Looper.getMainLooper())
    private lateinit var timerText: TextView

    private val runnable: Runnable = object : Runnable {
        override fun run() {
            if (isRunning) {
                seconds++
                val mins = seconds / 60
                val secs = seconds % 60
                timerText.text = String.format("%02d:%02d", mins, secs)
                handler.postDelayed(this, 1000)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_workout)

        timerText = findViewById(R.id.timerText)
        val stopBtn = findViewById<Button>(R.id.btnStopWorkout)

        handler.post(runnable)

        stopBtn.setOnClickListener {
            isRunning = false
            handler.removeCallbacks(runnable)
            finish() // close activity and return to HomeFragment
        }
    }
}
