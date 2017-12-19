package com.example.petergabor.habittrainer

/**
 * Created by PepovPC on 12/19/2017.
 */

data class Habit(val title: String, val description: String, val image: Int)

fun getSambleHabits(): List<Habit>{
    return listOf(
            Habit("Go walk", "Sun is nice for walk", R.drawable.walk),
            Habit("Go drink", "Glass is ok", R.drawable.water)
    )

}