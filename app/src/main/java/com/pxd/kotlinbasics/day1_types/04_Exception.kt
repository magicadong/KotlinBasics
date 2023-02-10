package com.pxd.kotlinbasics.day1_types

fun main() {

    try {
        //尝试执行这段代码
        //一旦代码出现异常 停止执行try里面的代码
        //1/0
        val a = readLine()!!.toInt()//NumberFormatException
        println("here1")
    }catch (e: Exception){ //如果出现某种类型的异常就捕获
        //得到异常之后需要如何处理
        //println(e.message)
        //输出错误日志信息
        e.printStackTrace()
    }

    println("here2")
}