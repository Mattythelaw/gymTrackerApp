package com.example.gymtrackerapp

import android.util.Log


class Exercise(exerciseName: String, muscleGroup: String, sets: Int, reps: String ) {

    //Adding variables for gym tracking attributes//
    var name: String = " "

    var muscleGroup: String = " "

    var sets: Int = 0

    var reps: String = " "

    //Secondary constructor 1 - user does not know muscleGroup but knows sets//
    constructor(exerciseName: String, sets: Int, reps: String)
            : this(exerciseName, "Unknown Muscle Group", sets, reps)

    //Secondary constructor 2 - user does not know muscle group and sets//
    constructor(exerciseName: String, reps: String, placeholder: Boolean)
            : this(exerciseName, "Unknown Muscle Group", 0, reps)

    //Initializing the varibales/attributes for the gym tracking//
    init {
        name = exerciseName
        this.muscleGroup = muscleGroup
        this.sets = sets
        this.reps = reps
    }

    //function that logs that the exercise has started
    fun Start() {
        Log.v("Exercise", "$name has started")

    }

    fun Complete() {
        Log.v("Exercise", "$name has been completed")

    }

    fun Skip() {
        Log.v("Exercise", "$name has been skipped")

    }

    fun MarkPersonalBest(): Boolean {
        Log.v("Exercise", "$name is your personal best")
        //returning placeholder for boolean
        return true
    }

    fun DisplayExercise(): String {
        return "$name - $muscleGroup (Sets: $sets, Reps: $reps)"

    }


}




