package com.pxd.kotlinbasics.day2_function

fun main() {
    //1.通过中间变量将函数的引用传递给其他函数
    val center:()->Unit = ::show
    doSomething(10,center)

    //2.直接将函数的引用传递给其他函数
    doSomething(20,::show)

    //3.直接将函数的实现传递给其他函数
    doSomething(30,{
        println("show")
    })

    //4.如果函数参数中最后一个参数是函数，可以放在括号外面
    doSomething(40){
        println("show")
    }
}
fun doSomething(money:Int,task:()->Unit){
    println("get money $money")
    task()
}

fun test(value: Int){
    println(value)
}

fun show(){
    println("show")
}


