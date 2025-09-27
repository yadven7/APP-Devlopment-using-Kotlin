// C:/Users/Yadvendra/AndroidStudioProjects/DEMO2/app/src/main/java/com/example/demo1/demo2/day5.kt
//package com.example.demo1.demo2.APP - Devlopment - using - Kotlin.Day2

import android.R

// The main function is now at the top level of the file.
fun main() {
    val list = mutableListOf(1, 2, 3, 4)
    println(list)
    println(list.size)
    println(list.contains(3))
    list.set(0,10)
    println(list)
    var list1 = listOf(5,4,6,7)
    println(list1)
    list.addAll(list1)
    println(list)

    val subjectSet = mutableSetOf("CS","JAVA","C","++")
    println(subjectSet)
    println(subjectSet.isEmpty())
    subjectSet.add("English")
    subjectSet.remove("++")
    println(subjectSet)
    for(item in subjectSet){
        println("$item")
    }



}