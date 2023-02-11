package com.pxd.kotlinbasics.day2_function

fun main() {
    val menus = arrayOf("查询余额","取款","存款","退出","改密码")
    println("********************")
    /*for ((index,menu) in menus.withIndex()){
        println("$index. $menu")
    }*/
    menus.forEachIndexed { index, menu ->
        println("$index. $menu")
    }
    println("********************")

    println(menus.component2())

    val result = menus.contains("退出")
    if (result){
        println("存在")
    }else{
        println("不存在")
    }


}