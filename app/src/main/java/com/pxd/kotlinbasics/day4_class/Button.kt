package com.pxd.kotlinbasics.day4_class

class Button(var title:String) {
    fun onClick(callback:()->Unit){
        println("按钮识别到单击事件")
        callback()
    }

    fun onLongClick(callback:()->Unit){
        println("按钮识别到长按事件")
        callback()
    }
}

fun main() {
    val loginButton = Button("登录")
    loginButton.onClick{
        println("开始登录")
    }

    loginButton.onLongClick {
        println("注册")
    }
}