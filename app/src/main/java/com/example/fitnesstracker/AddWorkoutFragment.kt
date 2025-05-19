package com.example.fitnesstracker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment

class AddWorkoutFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_add_workout, container, false)

        val typeInput = view.findViewById<EditText>(R.id.editWorkoutType)
        val durationInput = view.findViewById<EditText>(R.id.editDuration)
        val caloriesInput = view.findViewById<EditText>(R.id.editCalories)
        val dateInput = view.findViewById<EditText>(R.id.editDate)
        val btnSave = view.findViewById<Button>(R.id.btnSaveWorkout)

        btnSave.setOnClickListener {
            val type = typeInput.text.toString()
            val duration = durationInput.text.toString()
            val calories = caloriesInput.text.toString()
            val date = dateInput.text.toString()

            if (type.isEmpty() || duration.isEmpty() || calories.isEmpty() || date.isEmpty()) {
                Toast.makeText(requireContext(), "Please fill all fields", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(requireContext(), "Workout Saved!", Toast.LENGTH_SHORT).show()

                // TODO: Save to Room database or ViewModel
            }
        }

        return view
    }
}
