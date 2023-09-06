package com.sample.kotlinsample

fun getMyName(
    firstName: String,
    lastName: String
): String = "$firstName $lastName"

fun main(arg: Array<String>){
    println(getMyName("석현", "왕"))
    //파라미터가 많아지면 무엇인지 알 수 없어 혼동이 올 수 있기 떄문에, 이름 명시도 가능
    println(getMyName(lastName = "왕", firstName = "석현"))
}

//default 파라미터 예시

//fun getMyNameDefault()