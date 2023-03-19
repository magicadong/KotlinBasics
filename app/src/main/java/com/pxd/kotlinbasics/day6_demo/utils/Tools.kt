package com.pxd.kotlinbasics.day6_demo.utils

import kotlin.system.exitProcess

object Tools {
    //展示列表
    fun showList(items:Array<String>){
        "*************************".showln()
        for ((index,item) in items.withIndex()){
            println("${index+1}. $item")
        }
        "*************************".showln()
    }

    //退出
    fun safeExit(){
        "感谢使用 再见!!!".showln()
        exitProcess(0)
    }

    //接收用户选择的菜单编号
    fun getChoice(size:Int):Int{
        while (true) {
            "请选择操作:".show()
            val choice = readLine()!!.toInt()
            if (choice in 1..size){
                return choice
            }
            "输入不合法 ".show()
        }
    }

    //从终端输入一个字符串
    fun inputString(msg:String):String{
        print("$msg:")
        return readLine()!!
    }
    //从终端输入一个整数
    fun inputInt(msg:String):Int{
        while (true) {
            print("$msg:")
            try {
                return readLine()!!.toInt()
            } catch (e: Exception) {
                print("输入有误 ")
            }
        }
    }
}