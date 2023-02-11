package com.pxd.kotlinbasics.day1_types

import kotlin.system.exitProcess

//使用Kotlin实现ATMDemo
/**
 **************
 * 欢迎使用ATM
 * ************
请输入密码：123
密码错误(剩余2次)请重新输入：
密码错误(剩余1次)请重新输入：
密码错误次数过多请联系管理员
密码解锁成功

 **********
 * 1.查询余额
 * 2.取款
 * 3.存款
 * 4.退出
 * ********
请选择操作：1
当前余额为1000
是否继续？(y/n):
 */
fun main() {

    val password = 123
    var wrongTime = 3
    var totalMoney = 1000

    println("**********************")
    println("  欢迎使用ATM")
    println("**********************")

    while (true) {
        print("请输入密码:")
        try {
            val inputpwd = readLine()!!.toInt()
            if (inputpwd == password){
                println("密码解锁成功")
                break
            }else{
                wrongTime--
            }
        } catch (e: Exception) {
            println("以下是捕获的异常信息:")
            e.printStackTrace()
            wrongTime--
        }

        if (wrongTime == 0){
            println("密码错误次数过多 请联系管理员！！！")
            exitProcess(0)
        }
        print("密码错误(剩余${wrongTime}次),")
    }

    while(true) {
        //显示操作
        println("********************")
        println("1. 查询余额")
        println("2. 取款")
        println("3. 存款")
        println("4. 退出")
        println("********************")
        print("请选择操作:")
        val choice = readLine()!!

        when(choice){
            "1" -> println("当前余额为：$totalMoney")
            "2" ->{
                print("请输入取款金额:")
                try {
                    val money = readLine()!!.toInt()
                    if (money > totalMoney){
                        println("余额不足")
                    }else{
                        totalMoney -= money
                        println("取款成功 余额为: $totalMoney")
                    }
                }catch (e:Exception){
                    print("输入不合法，")
                }
            }
            "3" ->{
                print("请输入存款金额:")
                try {
                    val money = readLine()!!.toInt()
                    totalMoney += money
                    println("存款成功 当前余额为: $totalMoney")
                }catch (e: Exception){
                    //e.printStackTrace()
                    print("输入不合法，")
                }
            }
            "4" ->{
                println("感谢您的使用 再见！！！")
                exitProcess(0)
            }
            else -> {
                println("输入不合法")
                continue
            }
        }
        while (true){
            print("是否继续?(y/n):")
            val c = readLine()!!
            when(c){
                "y" -> break
                "n" -> exitProcess(0)
                else -> print("输入不合法,")
            }
        }
    }
}








