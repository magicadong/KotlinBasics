package com.pxd.kotlinbasics.day1_types

import java.util.Scanner

//
/* */
/**
c: 输出使用printf
kotlin： print/println

kotlin里面语句结束不需要分号
 */
fun main() {
    //接收字符串
/*
    var a = readLine()!!  //123
    println(a) //123

    var temp = a.toInt() + 123 //124
    println(temp) //124
*/

    //使用Scanner来接收
    //终端  文件  打印机
    //得到一个扫描仪
    //val scanner = Scanner(System.`in`)
    //接收数据
    //val b = scanner.nextInt()  //整数
    //val c = scanner.nextLine() //字符串
    //val d = scanner.nextFloat()//浮点数
    //println(b)

    //设定一个密码 从终端输入另一个 判断是否相同
    val password = 123
    print("请输入密码:")
    val inputPwd = readLine()!!.toInt()

    if (password == inputPwd){
        println("密码正确")
    }else{
        println("密码不正确")
    }
}