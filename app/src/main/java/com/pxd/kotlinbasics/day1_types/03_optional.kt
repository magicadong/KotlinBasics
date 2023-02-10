package com.pxd.kotlinbasics.day1_types

/**
 给一个变量赋初值 不确定具体值时，赋值为null 空
 定义变量时最好初始化 ，不知道如何初始化时，可以定义为可选类型
 */
fun main() {
    //可选类型
    //有值
    //没有值
    var name:String? = null

    println("my name is $name length is ${name?.length}")

    //NullPointerException
    println("my name is $name length is ${name!!.length}")

    val a = readLine()
    val b = a!!.toInt()
}