package com.sample.kotlinsample

import com.sample.kotlinsample.Division.*;
sealed class Person(
    val name: String,
    var isMarried: Boolean
)

class Developer(
    name: String,
    isMarried: Boolean,
    val language: String
) : Person(
    name,
    isMarried
)

class Marketer (
    name: String,
    isMarried: Boolean,
    val division: Division
) : Person(
    name,
    isMarried
)

enum class Division{
    CONTENTS, DIGITAL, BRAND
}

fun printSpecialSkill(person: Person) =
    when(person){
    is Developer -> person.language
    is Marketer -> person.division
}

fun main(){
    val developer = Developer("아무로", true, "Nihongo")
    val marketer = Marketer("카스발", false, CONTENTS)
    println("developer`s special skill is : ${printSpecialSkill(developer)}")
    println("marketer`s special skill is : ${printSpecialSkill(marketer)}")
}