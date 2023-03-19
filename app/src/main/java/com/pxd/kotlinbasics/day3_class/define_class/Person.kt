package com.pxd.kotlinbasics.day3_class.define_class

/**
 类的定义
 关键字：class
 Person： 类名 首字母大写

 对象的创建/类的实例化
 val v = Person()

 1.用编辑器编写一个类 文件
 2.当程序运行起来，并且需要访问这个类的时候,才会将这个类加载到内存中
 3.使用Person() 实例化一个对象
 4.在堆中申请一片内存空间，用于存储这个对象
 5.不需要的时候，释放内存空间

 声明属性时必须初始化，如果不确定初始值，使用可选类型
 当生命一个属性为var时系统完成了3件事情
    1.提供了对应set方法
    2.提供了get方法
    3.提供了一个变量用于存数据（backing—field）

 当生命一个属性为val时系统完成了3件事情
     1.提供了get方法
     2.提供了一个变量用于存数据（backing—field）
 */
class Person {
    var name:String = ""
    var age:Int = 1

}









