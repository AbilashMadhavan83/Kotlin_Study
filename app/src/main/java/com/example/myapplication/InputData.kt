package com.example.myapplication

import java.util.*

fun main() {
    var name:String
    var age:Int
    val reader = Scanner(System.`in`)
    println("Enter Name :")
    //name = readln()
    name = reader.nextLine()
    println("Enter Age  :")
    age = reader.nextInt()
    println("Name :$name,Age :$age")
}