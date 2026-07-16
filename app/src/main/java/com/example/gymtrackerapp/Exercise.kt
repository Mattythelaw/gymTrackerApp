package com.example.gymtrackerapp

import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Exercise(exerciseName: String, muscleGroup: String, sets: Int, reps: String ){

    //Adding variables for gym tracking attributes//
    var name:  String = " "

    var muscleGroup: String = " "

    var sets: Int = 0

    var reps: String = " "

    //Secondary constructor 1 - user does not know muscleGroup but knows sets//
    constructor( exerciseName: String, sets: Int, reps: String)
            : this(exerciseName, "Unknown Muscle Group", sets, reps )

    //Secondary constructor 2 - user does not know muscle group and sets//
    constructor(exerciseName: String, reps: String, placeholder: Boolean)
            : this(exerciseName, "Unknown Muscle Group", 0, reps )


}




