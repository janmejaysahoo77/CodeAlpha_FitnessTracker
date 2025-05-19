package com.example.fitnesstracker

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val progressBar = view.findViewById<ProgressBar>(R.id.progressBar)
        val progressText = view.findViewById<TextView>(R.id.progressText)
        val lastWorkout = view.findViewById<TextView>(R.id.lastWorkout)
        val weeklyCalories = view.findViewById<TextView>(R.id.weeklyCalories)
        val btnAddWorkout = view.findViewById<Button>(R.id.btnAddWorkout)
        val btnStartWorkout = view.findViewById<Button>(R.id.btnStartWorkout)

        // Dummy data
        val goal = 500
        val todayBurned = 250
        val lastWorkoutText = "Cycling - 45 min - 400 kcal"
        val weeklyTotal = 1600

        progressBar.progress = (todayBurned * 100 / goal)
        progressText.text = "${todayBurned * 100 / goal}% of $goal kcal"
        lastWorkout.text = lastWorkoutText
        weeklyCalories.text = "$weeklyTotal kcal"

        // Navigate to AddWorkout on button click
        btnAddWorkout.setOnClickListener {
            findNavController().navigate(R.id.addWorkoutFragment)
        }

        // Later: Implement actual workout tracking here
        btnStartWorkout.setOnClickListener {
            btnStartWorkout.setOnClickListener {
                val intent = Intent(requireContext(), StartWorkoutActivity::class.java)
                startActivity(intent)
                // For now, show a placeholder or toast
            }


        }
        return view
    }
}

