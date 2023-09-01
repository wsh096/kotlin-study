package com.sample.kotlinsample

fun main() {
    println("Max value is ${max(5, 3)}")
    val person = Person("King", false)
    println("person name ${person.name}, isMarried ${person.isMarried}")
}
fun max(a : Int, b : Int) = if(a > b) a else b
