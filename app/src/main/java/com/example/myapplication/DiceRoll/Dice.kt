package com.example.myapplication.DiceRoll

class Dice(val numSides:Int) {
    fun roll():Int{
       return (1..numSides).random() //Adopt good coding practices
    }

}