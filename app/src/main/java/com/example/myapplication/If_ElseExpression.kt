package com.example.myapplication

fun main() {
    /*
    Kotlin Conditions and If..Else
    Kotlin supports the usual logical conditions from mathematics:

            Less than                   : a < b
            Less than or equal to       : a <= b
            Greater than                : a > b
            Greater than or equal to    : a >= b
            Equal to                    : a == b
            Not Equal to                : a != b

    You can use these conditions to perform different actions for different decisions.

    Kotlin has the following conditionals:

    Use if to specify a block of code to be executed, if a specified condition is true
    Use else to specify a block of code to be executed, if the same condition is false
    Use else if to specify a new condition to test, if the first condition is false
    Use when to specify many alternative blocks of code to be executed

     */

    //Example

    /*
    if (condition1) {
        // block of code to be executed if condition1 is true
    } else if (condition2) {
        // block of code to be executed if the condition1 is false and condition2 is true
    } else {
        // block of code to be executed if the condition1 is false and condition2 is false
    }
     */

    val timeEx1 = 22
    if (timeEx1 < 10) {
        println("Good morning.")
    } else if (timeEx1 < 20) {
        println("Good day.")
    } else {
        println("Good evening.")
    }

    // or
    val timeEx2 = 20
    val greeting = if (timeEx2 < 18) "Good day." else "Good evening."
    println(greeting)


}