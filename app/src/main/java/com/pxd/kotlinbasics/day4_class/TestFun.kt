package com.pxd.kotlinbasics.day4_class

fun main() {
    //直接调用
    //success("")

    //间接调用
    //在定义变量时使用函数的引用来初始化
    //val result:(String)->Int = ::success
    //val code = result("成功")
    //println("get the code: $code")

    //在定义变量时直接初始化
    //{ 这个函数的参数 ->  //当只有一个参数时 可以省略 默认是it
    //   具体实现
    //   如果有返回值 不要写return 最后一行就是返回值
    // }
    //val result:(String)->Int = { msg ->
    //    println(msg)
    //    200
    //}

    //load(::success, ::failure) //耦合
    load({
        println("success: $it")
        0
    },{
        println("failure: $it")
        0
    })
}
fun load(right:(String)->Int, wrong:(String)->Int){
    //....
    val code = 200
    if (code == 200){
        right("成功的数据")
    }else{
        wrong("地址不正确")
    }
}

//fun success(msg:String):Int{
//    println(msg)
//    return 200
//}
//fun failure(msg:String):Int{
//    println(msg)
//    return 200
//}

