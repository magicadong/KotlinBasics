package com.pxd.kotlinbasics.day5_ext

/**
 封装  继承  多态
 java kotlin：单继承
 默认所有的类都是final 需要使用open修饰才能被继承
 子类如果需要重写(重新实现)父类的方法
    需要使用override修饰子类重写的方法
    父类的方法必须使用open修饰 才能被子类重写

 如何封装
    public 公有地(默认)  都可以使用
    private 私有的  当前这个类可用 子类外部类都无法访问
    protected 受保护的 子类可以继承 外部无法访问
 */
open class Father{
    var age = 10
    protected var money = 0
    private var knowledge = "博士"

    open fun work(){
        println("father work $money $knowledge")
    }
}

class Child:Father(){
    override fun work(){
        println("child work $money ")
    }
}

fun main() {
    val my = Father()
    val zs = Child()
}