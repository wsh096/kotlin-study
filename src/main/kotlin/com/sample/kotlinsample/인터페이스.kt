package com.sample.kotlinsample

interface Clickable{
    fun click()//인터페이스는 최소한으로만 만드는 것이 좋다.
}

class Button: Clickable{//: 으로 상속과 구현 모두를 표현하게 바꼈다.
    override fun click() { //override가 필수로 들어가게 되었으며
        println("Button is clicked")
    }

}
//메인을 만들 때 클래스 내부가 아니라 파일 내부에 별도로 선언 해야 한다.
fun main(){
    Button().click()//클래스 선언을 하고 메서드 호출
}

// 코틀린의 상속은 기본적으로 final == 상속 불가능으로 막혀 있으며 open으로 권한을 열어 주거나
// 코틀린 문법 open 상속 가능, final 상속 불가능 abstarct <- 처럼 무조건 해야하는 걸로 나뉜다.