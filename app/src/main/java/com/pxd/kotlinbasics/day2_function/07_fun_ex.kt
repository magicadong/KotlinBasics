package com.pxd.kotlinbasics.day2_function

fun main() {
    //1
    val center:()->Unit = ::show
    doSomething(10,center)

    //2
    doSomething(20,::show)

    //3
    doSomething(30,{
        println("show")
    })

    //4
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


