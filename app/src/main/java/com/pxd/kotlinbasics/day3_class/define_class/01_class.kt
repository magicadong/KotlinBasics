package com.pxd.kotlinbasics.day3_class

import com.pxd.kotlinbasics.day3_class.define_class.Person


/**
 * kotlin 一切皆对象
 * 类： 对一类事物高度抽象 不实际存在 == 属性和方法的封装
 * 对象：某个类的实例化  实际存在
 *
 * 吃早餐
 * 面向过程：起床 拿起面包 吃  喝牛奶
 * 面向对象：
        吃早餐
        对象： 张三   全卖面包  AD牛奶 旺旺
        类： Person  Bread    Milk
        属性：Person：name age address
             Bread： brand type
             Milk：  Brand type

        行为：Person： eat drink
 */
fun main() {

    val zs = Person()
    zs.name = "zhangsan" //常量区
    zs.age = 20

    val ls = Person()
    ls.name = StringBuilder("zhangsan").toString() //栈中
    ls.age = 20

    /**
     * 字符串常量在内存的常量区分配内存空间
     */
    if (zs.name === ls.name){
        println("the same")
    }else{
        println("not the same")
    }

    val s1 = String(charArrayOf('j','a','c','k'))
    val s2 = String(charArrayOf('j','a','c','k'))

    /**
     * == 比较对象的值是否相同
     * === 比较对象是否相同
     */
//    if (s1 === s2){
//        println("the same")
//    }else{
//        println("not the same")
//    }


//    if (zs == ls){
//        println("the same")
//    }else{
//        println("not the same")
//    }







}










