package com.sample.kotlinsample

fun String.double() = this + this

fun main(){
    println("do".double())//dodo
    println("do2".double("두 번 이건 오버라이딩"))
    println("이게" add "중위호출 함수")
}
fun String.double(add:String) = this + this + add

//중위호출(infix function) //테스트 코드에서 많이 사용되는 문법
infix fun String.add(postfix: String) = "$this $postfix" // 이렇게 $로 구분한 건 내가 한 것
