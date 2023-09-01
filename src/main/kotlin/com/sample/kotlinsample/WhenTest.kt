package com.sample.kotlinsample
import com.sample.kotlinsample.Color.*;

fun main(){
    println("Color is ${getKoreanColorName(GREY)}")
}
enum class Color{
    RED, GREEN, BLUE, GREY
}

fun getKoreanColorName(color:Color) = when(color){
    Color.RED -> "빨강"
    Color.GREEN -> "녹색"
    Color.BLUE -> "파랑"
    Color.GREY -> "회색"
}