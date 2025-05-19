package com.example.fitnesstracker

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment

class GoalsFragment : Fragment() {

    private lateinit var goalStepsInput: EditText
    private lateinit var goalWorkoutInput: EditText
    private lateinit var saveGoalsButton: Button
    private lateinit var goalsStatusText: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_goals, container, false)

        goalStepsInput = view.findViewById(R.id.goalStepsInput)
        goalWorkoutInput = view.findViewById(R.id.goalWorkoutInput)
        saveGoalsButton = view.findViewById(R.id.saveGoalsButton)
        goalsStatusText = view.findViewById(R.id.goalsStatusText)

        val prefs = requireActivity().getSharedPreferences("fitness_prefs", Context.MODE_PRIVATE)
        goalStepsInput.setText(prefs.getInt("goal_steps", 0).toString())
        goalWorkoutInput.setText(prefs.getInt("goal_workouts", 0).toString())

        saveGoalsButton.setOnClickListener {
            val steps = goalStepsInput.text.toString().toIntOrNull() ?: 0
            val workouts = goalWorkoutInput.text.toString().toIntOrNull() ?: 0

            prefs.edit().apply {
                putInt("goal_steps", steps)
                putInt("goal_workouts", workouts)
                apply()
            }

            goalsStatusText.text = "Goals saved!"
        }

        return view
    }
}
