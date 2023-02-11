package com.pxd.kotlinbasics.day2_function

fun main() {
    //val cookRef = ::baby
    buy(200, ::baby)
    buy(200, ::cook)
}

fun buy(money:Int, task:()->Unit){
    println("拿着${money}去买菜")
    println("才买好了")
    task()
}

fun cook(){
    println("主人 我去烧饭了！")
}

fun baby(){
    println("主人 我去看小孩了")
}