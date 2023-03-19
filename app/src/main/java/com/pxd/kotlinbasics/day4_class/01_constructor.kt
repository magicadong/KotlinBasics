package com.pxd.kotlinbasics.day4_class

/**
 * 重写get方法
    val age:Int
    get() = 20   //明确知道返回值是什么

    val age:Int
    get() {
        println("开始查询数据")
        println("查询到数据了")
        return 20
    }

 * 重写set方法
    var url:String = ""
    set(value) {
        field = value
        //xiazai shuju
    }
    get() {
        // 执行需要处理的任务
        return field
    }

 lateinit只能修饰var 不能修饰val

 懒加载
 1. 节省内存空间
 2. 只执行一次 -> 创建单例对象
 3. 只有val类型变量可以使用 懒加载

 构造函数
    当对象被创建时需要调用的函数  Person()
    当创建对象时不需要任何参数，那么(默认/主)构造函数可以省略
 什么情况下需要写构造函数 不能省略
    1. 创建对象时需要提供默认的属性
    2. 有关键字修饰构造函数

 次构造函数
    1. 可以有多个次构造函数
    2. 次构造函数必须调用主构造函数(有主构造函数）
    3. 声明在类的内部，使用construtor修饰一个函数

 构建对象的顺序
               子类 ->  父类1  ->  父类2  ...  -> Any
                                                创建原始对象
  完整对象  <-赋值(修饰)<-  赋值(修饰)<- 赋值(修饰)   <-
 Any: 所有类的父类

 Person() ->Person 构造函数 -> 父类构造函数  -> Any
 */

open class GrandFather(name:String)
open class Father(var house:String):GrandFather("毛泽东")
class Boy(var school:String):Father("别墅"){

}

fun main() {
    val xx = Boy("西大")

    val p = Person("jack",20)
    val p2 = Person("西大","zhangsan", 30)
}

class  Person constructor(var name:String, var age:Int){
    var address = ""

    constructor(address:String,name:String,age:Int) : this(name, age) {

    }

    fun show(){
        println("$name $age")
    }
}











