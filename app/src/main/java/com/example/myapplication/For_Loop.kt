package com.example.myapplication

fun main(){
    /*
    Kotlin For Loop
    Often when you work with arrays, you need to loop through all of the elements.

    To loop through array elements, use the for loop together with the in operator:

     */

    //1 to 5 range
    for (x in 1..5) {
        println(x)
    }

    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    for (x in cars) {
        println(x)
    }

    val nums = arrayOf(1, 5, 10, 15, 20)
    for (x in nums) {
        println(x)
    }

}