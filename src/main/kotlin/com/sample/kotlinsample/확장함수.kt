package com.sample.kotlinsample

fun String.double() = this + this

fun main(){
    println("do".double())//dodo
    println("do2".double("두 번 이건 오버라이딩"))
}
fun String.double(add:String) = this + this + add
