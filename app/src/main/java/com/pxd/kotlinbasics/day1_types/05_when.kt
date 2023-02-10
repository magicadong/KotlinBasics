package com.pxd.kotlinbasics.day1_types

import kotlin.system.exitProcess

/**
 switch(a){ //支持int char
    case 1:
        break;
    case 2:
        break;
    defatult:
        break;
 }

 1.支持所有的类型
 */
fun main() {
    val a = 10
    when(a){
        0 -> println("0")
        10 -> println("10")
        20 -> println("20")
        else ->{
            println("others")
        }
    }

    val name = "rose"
    when(name){
        "jack" -> println("jack")
        "rose" -> println("rose")
        "merry" -> println("merry")
        else -> println("I don't know")
    }

    //区间
    when(a){
        in 0..10 -> {}
        in 11..20 -> {}
        else ->{}
    }

    when(a){
        !in 0..10 ->{}
        !in 11..20 ->{}
        else ->{}
    }

    val temp:Any? = null
    when(temp){
        is String ->{}
        is Int ->{}
        else ->{}
    }
}







