package com.pxd.kotlinbasics.day4_class

/**
 * 主构造 Constructor  当构建对象时，需要外部传递对应的初始数据
 * 次构造
 *      class Car(brand:String, val color:String)
 *      brand:为临时变量，用来接收外部传递的数据，类内部的方法无法访问这个变量
 *           1.将这个变量的值用属性来接收  val tt = brand
 *           2.在init方法中可以使用 init{}
 *      color:属性 随时随地都可以访问
 * 属性：存数据
 * 方法/函数：
 */

class Car(brand:String, val color:String){
    val price:Int? = null
    lateinit var engine:String //延迟初始化
    val speed by lazy {  //延迟加载
        //
        300
    }

    init {
        println("init 方法被调用了 $brand")
    }

    fun start(){
        engine = "v8"
        print("brand: color:$color engine: $engine  speed:$speed")
    }
}

fun main() {
    val bz = Car("奔驰", "黑色")
    val bm = Car("奔驰", "黑色")
    //bz.start()
}


