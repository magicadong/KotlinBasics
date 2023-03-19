package com.pxd.kotlinbasics.day2_function

fun main() {
    val f1Ref:()->Unit = ::f1
    val f2Ref:(Int, String)-> Boolean = ::f2

    //f1Ref()
    //f2Ref(2,"jack")

    val funArray = arrayOf(::f1,::f3)
    funArray[0]()
    funArray[1]()
}

fun f1(){
    println("f1")
}
fun f2(a:Int,b:String):Boolean{
    println("f2")
    return true
}
fun f3(){
    println("f3")
}

