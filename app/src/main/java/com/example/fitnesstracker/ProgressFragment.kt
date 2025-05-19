package com.example.fitnesstracker

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import kotlin.random.Random

class ProgressFragment : Fragment() {

    private lateinit var stepsProgress: TextView
    private lateinit var workoutProgress: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_progress, container, false)

        stepsProgress = view.findViewById(R.id.stepsProgress)
        workoutProgress = view.findViewById(R.id.workoutProgress)

        val prefs = requireActivity().getSharedPreferences("fitness_prefs", Context.MODE_PRIVATE)

        val goalSteps = prefs.getInt("goal_steps", 10000)
        val goalWorkouts = prefs.getInt("goal_workouts", 5)

        // Simulated current progress (you’ll replace this with actual data later)
        val currentSteps = Random.nextInt(0, goalSteps + 2000)
        val currentWorkouts = Random.nextInt(0, goalWorkouts + 2)

        stepsProgress.text = "Steps: $currentSteps / $goalSteps"
        workoutProgress.text = "Workouts This Week: $currentWorkouts / $goalWorkouts"

        return view
    }
}
