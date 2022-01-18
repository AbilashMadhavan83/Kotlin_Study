package com.example.myapplication

fun main() {
    /*

    Loops
    Loops can execute a block of code as long as a specified condition is reached.

    Loops are handy because they save time, reduce errors, and they make code more readable.

    Kotlin While Loop
    The while loop loops through a block of code as long as a specified condition is true:

    while (condition) {
    // code block to be executed
    }
     */

    var i = 0
    while (i < 5) {
        println("$i while")
        i++
    }

    //Do..While Loop
    /*
    The do..while loop is a variant of the while loop.
    This loop will execute the code block once,
    before checking if the condition is true,
    then it will repeat the loop as long as the condition is true.
    do {
      // code block to be executed
    }
    while (condition);
     */

    var j = 0
    do {
        println("$j do while")
        j++
    }
    while (j < 5)
}