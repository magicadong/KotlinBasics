package com.pxd.kotlinbasics.day1_types

/**
 int long double float char bool    short

 Int Long Double Float Char Boolean Short
 String Any(任意类型)

 val: 不可变的变量
 var: 可变的变量
 */
fun main() {
    //类型自动推断
    val a = 10     //Int
    val b = 10.0   //Double
    val c = 10f
    val d = 10L
    val e = 'c'
    val f = "abc"
    val g = true

    //明确指定对应的数据类型
    val a1: Int = 10
    val f1: String = "abc"

    var a2 = a

    //println(a)
    //println(g)
    //字符串模板
    println("this is $a this is $b")
    println("this is ${a}this is $b")

}