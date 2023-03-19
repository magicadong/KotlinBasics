package com.pxd.kotlinbasics.day2_function.atm_function

import kotlin.system.exitProcess

/**
 * 欢迎界面
 */
fun welcome(){
    showMenu(arrayOf("欢迎使用ATM"))
}
/**
 * 显示菜单
 */
fun showMenu(menus:Array<String>){
    println("********************")
    if (menus.size == 1){
        println(menus.first())
    }else{
        menus.forEachIndexed { index, menu ->
            println("${index+1}. $menu")
        }
    }
    println("********************")
}

/**
 * 输入密码
 * return：true 密码正确  false 密码错误
 */
fun inputPassword():Boolean{
    var wrongTime = WRONG_TIME
    while (true) {
        showMessage("请输入密码:")
        val password = nextInt()
        if (password == ERROR_RESULT) {
            wrongTime--
        } else {
            if (password == PASSWORD){
                return true
            }else{
                wrongTime--
            }
        }

        if (wrongTime == 0){
            return false
        }

        showMessage("密码错误(剩余${wrongTime}次) ")
    }
}

/**
 * 从终端接收一个整数
 */
fun nextInt():Int{
    try {
        return readLine()!!.toInt()
    }catch (e: Exception){
        e.printStackTrace()
        return ERROR_RESULT
    }
}

/**
 * 显示一行数据 不换行
 */
fun showMessage(msg: String){
    print(msg)
}
/**
 * 显示一行数据 换行
 */
fun showMessageln(msg: String){
    println(msg)
}
/**
 * 退出程序
 * msg: 退出的提示信息
 */
fun exit(msg:String){
    showMenu(arrayOf(msg))
    exitProcess(0)
}

/**
 * 选择菜单
 * return： 菜单的编号
 */
fun chooseMenu(menus: Array<String>):Int{
    while (true){
        showMessage("请选择操作:")
        val choice = nextInt()
        if (choice in 1..menus.size){
            return choice
        }
        showMessage("输入不合法,")
    }
}

fun queryMoney(){
    showMessage("当前余额为：$totalMoney")
}
fun takeMoney(){
    showMessage("请输入取款金额:")
    val money = nextInt()
    if (money > totalMoney){
        showMessageln("余额不足！！")
    }else{
        totalMoney -= money
        showMessageln("取款成功 余额为: $totalMoney")
    }
}
fun saveMoney(){
    showMessage("请输入存款金额:")
    val money = nextInt()
    totalMoney += money
    showMessageln("存款成功 余额为: $totalMoney")

}

fun quit(){
    exit("感谢您的使用 再见!!")
}

/**
 * 是否继续
 */
fun shouldContinue(){
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