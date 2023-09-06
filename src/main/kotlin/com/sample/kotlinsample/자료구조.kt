package com.sample.kotlinsample

val set = setOf(1,2,3)
val list = listOf("a","b","1L")
val map = mapOf(
    1 to "One",
    3 to "Three"
)

fun main(){
    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)
}