package com.example.myapplication.DiceRoll

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

class DiceRollerAppActivity : AppCompatActivity() {

    private val TAG = "DiceRollerAppActivity"
    /*
    Log.e(TAG, "ERROR: a serious error like an app crash")
    Log.w(TAG, "WARN: warns about the potential for serious errors")
    Log.i(TAG, "INFO: reporting technical information, such as an operation succeeding")
    Log.d(TAG, "DEBUG: reporting technical information useful for debugging")
    Log.v(TAG, "VERBOSE: more verbose than DEBUG logs")
     */
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice_roller_app)
        val rollButton : Button = findViewById(R.id.btn_roll)
        rollButton.setOnClickListener{rollDice()}

        rollDice()
    }

    private fun rollDice() {
        // Create new Dice object with 6 sides and roll the dice
        val myFirstDice = Dice(6)

        // Find the ImageView in the layout
        val imgDice : ImageView = findViewById(R.id.img_dice)

        //val luckyNumber = 4

        // Determine which drawable resource ID to use based on the dice roll
        Log.e(TAG, "ERROR: a serious error like an app crash " + myFirstDice.roll())
        val drawableResource = when (myFirstDice.roll()){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        // Update the ImageView with the correct drawable resource ID
        imgDice.setImageResource(drawableResource)

        // Update the content description
        imgDice.contentDescription = drawableResource.toString()
    }
}