package com.example.myapplication

fun main(){
    /*
    Arrays are used to store multiple values in a single variable,
    instead of creating separate variables for each value.

    To create an array, use the arrayOf() function, and place the values in a comma-separated list inside it:

     */

    /*
    Access the Elements of an Array
    You can access an array element by referring to the index number, inside square brackets.
    In this example, we access the value of the first element in cars:
     */
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    println(cars[0])
    // Outputs Volvo

    /*
    Change an Array Element
    To change the value of a specific element, refer to the index number:
     */

    val carsEx1 = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    carsEx1[0] = "Opel"
    println(carsEx1[0])
    // Now outputs Opel instead of Volvo

    /*
    Array Length / Size
    To find out how many elements an array have, use the size property:
     */

    val carsEx2 = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    println(carsEx2.size)
    // Outputs 4

    /*
    Check if an Element Exists
    You can use the in operator to check if an element exists in an array:
     */

    val carsEx3 = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    if ("Volvo" in carsEx3) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }

    val test = carsEx3.filter { it == "Volvo" }
    println(test.toString())

    println(carsEx3.filter { test -> test == "Volvo"})
    //stream or linq
    //https://www.youtube.com/watch?v=qCIHWXaeaB0

    /*
    Loop Through an Array
    Often when you work with arrays, you need to loop through all of the elements.
    You can loop through the array elements with the for loop,
    which you will learn even more about in the next chapter.
    The following example outputs all elements in the cars array:
     */

    val carsEx4 = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    for (x in carsEx4) {
        println(x)
    }

    //Array with datatype
    val carsModel = arrayOf<Int>(2020,2021,1989,1983)
    for (x in carsModel){
        println("car model : $x")
    }




}