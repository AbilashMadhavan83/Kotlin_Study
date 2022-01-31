package com.example.myapplication.Lemonade

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import kotlin.properties.Delegates

class LemonadeActivity : AppCompatActivity() {
   // private lateinit var lemonTree: LemonTree
    //private lateinit var randomVal:Int
    private lateinit var txtStatus: TextView
    private lateinit var treeImage: ImageView
    private lateinit var state:String
    private var randomNo by Delegates.notNull<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lemonade)

        state = "SELECT"

        treeImage = findViewById(R.id.img_tree)
        txtStatus = findViewById(R.id.txt_tree)

       // lemonTree = LemonTree()
        //randomVal = lemonTree.pick()


        treeImage.setOnClickListener {changeLemonStatus()}
    }

    private fun changeLemonStatus() {
        val lemonTree = LemonTree()
        //TODO("Not yet implemented")
        if (state == "SELECT") {
            txtStatus.setText("Click to juice the lemon!")
            treeImage.setImageResource(R.drawable.lemon_squeeze)
            randomNo = lemonTree.pick()
            state = "SQUEEZE"
        }else if(state == "DRINK") {
            txtStatus.setText("Click to start again!")
            treeImage.setImageResource(R.drawable.lemon_restart)
            state = "RESTART"
        }else if(state == "RESTART"){
            txtStatus.setText("Click to select a lemon!!")
            treeImage.setImageResource(R.drawable.lemon_tree)
            state = "SELECT"
        }else {
            randomNo--
            if (randomNo==0)
            {
                txtStatus.setText("Click to drink your lemonade!")
                treeImage.setImageResource(R.drawable.lemon_drink)
                state = "DRINK"
            }
        }





    }

//    private fun squeeze() {
//        TODO("Not yet implemented")
//        val drawableResource = when (randomVal){
//            2 -> R.drawable.lemon_squeeze
//            3 -> R.drawable.dice_2
//            else -> R.drawable.dice_6
//        }
//        // Update the ImageView with the correct drawable resource ID
//        //imgDice.setImageResource(drawableResource)
//
//    }
}