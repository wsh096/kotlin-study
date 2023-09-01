package com.sample.kotlinsample

fun main(){
    println("RED is ${getKoreanColorName(Color.RED)}")
}
enum class Color{
    RED, GREEN, BLUE
}

fun getKoreanColorName(color:Color) = when(color){
    Color.RED -> "빨강"
    Color.GREEN -> "녹색"
    Color.BLUE -> "파랑"
}