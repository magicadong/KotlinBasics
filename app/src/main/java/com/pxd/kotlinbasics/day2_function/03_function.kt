package com.pxd.kotlinbasics.day2_function


fun main() {
    foo1()
    foo3(1,2)
}

//无参 无返回值的函数
fun foo1(){}
fun foo2():Unit{}

//有参 有返回值的函数
fun foo3(a:Int, b:Int):Int{
    return a + b
}

/**
 类型自动推断
 1. 代码块里面只有一条执行语句
 2. 省略函数的返回值 用 = 来替代
 */
//fun foo4(a:Int, b:Int):Int {
//    return  a + b
//}
fun foo4(a:Int, b:Int) = a + b

fun foo5():Unit{
    println("hello foo5")
}
fun foo6() = println("hello foo6")

fun foo7():Int{
    println("hello foo7")
    return 10
}

fun foo8() = foo7()
fun foo9():Int {
    val a = foo7()
    return a
}

