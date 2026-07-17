package com.example.gymtrackerapp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

    val displayExercise = findViewById<TextView>(R.id.displayExercise)
    var displayTxt = " "

    //Creating 6 exercise objects (mixing all three constructors

    var exercise1 = Exercise( "Bicep Curls", "arms",
        2, "till failure"   )
    //Muscle group is unknown//
    var exercise2 = Exercise("Goblet Squats",3, "15")
    //muscle group and sets is unknown
    var exercise3 = Exercise("Lateral Raises",
        "till failure", true)

    var exercise4 = Exercise("Bench Press", "chest",
        2, "8" )

    //secondary constructor 1 - no muscle group
    var exercise5 = Exercise("Crunches", 3, "30")

    //secondary constructor 2 - no muscle group and no sets
    var exercise6 = Exercise("Hammer Curls", "till failure",
        true )

    //Putting exercises into an array
    var exercises = arrayOf<Exercise>(exercise1, exercise2, exercise3, exercise4,
        exercise5, exercise6)




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}