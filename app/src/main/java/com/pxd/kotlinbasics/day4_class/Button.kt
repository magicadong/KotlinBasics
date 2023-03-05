package com.pxd.kotlinbasics.day4_class

class Button(var title:String) {
    var callback:(()->Unit)? = null

    fun onClick(aCallback:()->Unit){
        this.callback = aCallback
    }

    fun check(){
        //回调单击事件
        if (callback != null){
            callback!!()
        }

        callback?.let { back ->
            back()
        }
    }

    fun check2(){
        //回调单击事件

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

    val cancelButton = Button("登录")
    cancelButton.onClick{
        println("开始登录")
    }

    loginButton.onLongClick {
        println("注册")
    }
}
















