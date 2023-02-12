package com.pxd.kotlinbasics.day2_function

fun main() {
    showMenu("输入密码")

    showMenu("张三","李四")
}

fun showMenu(vararg menus:String){
    menus.forEachIndexed { index, s ->
        println("$index $s")
    }
}