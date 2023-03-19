package com.pxd.kotlinbasics.day5_ext

import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

/**
 * 扩展Extension ：在原有的基础上添加新的属性或者函数
 * 1. 直接在类里面添加方法或者属性（有源代码）
 * 2. 如果是封装好的类/系统默认提供的类 （没法更改）
 */

class Person{
    var name = "Jack"

    fun test(){
        println("test")
    }
}


/**
 * 扩展属性不能存值 没有提供field属性
 * set/get
 */
var Person.age:Int
    set(value) {
        //有了这个值 你需要干什么
        println(value)
    }
    get() {
        //怎么给我这个值
        return 20
    }

//给person类添加了一个新的方法 eat
fun Person.eat(){
    this
    println("eating.... $name")
    test()
}

fun Any.show(){
    println(this)
}

fun main() {
    val zs = Person()
    zs.eat()
    zs.show()


    val result = "jack".let {
        "hello"
    }

    zs.apply {

    }
}

public inline fun <T> T.apply(block: T.() -> Unit): T {

    block()

    return this
}

/**
 * T.let()   给T类型添加的扩展函数 let
 * block: (T) -> R  接收一个参数 ，参数类型是函数
 */
public inline fun <T, R> T.let(block: (T) -> R): R {

    val result = block(this)

    return result
}