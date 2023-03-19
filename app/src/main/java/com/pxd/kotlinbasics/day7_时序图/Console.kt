package com.pxd.kotlinbasics.day7_时序图

class Console {
    /**
     * 同时返回两个数据
     * 1. 用类来封装数据 User 耦合性太强了 避免
     * 2. 使用高阶函数
     */
    fun getUserInfo(callback:(String,String,Int)->Unit){
        //接收输入
        val name = readLine()!!
        val pwd = readLine()!!

        //将数据回调出去
        callback(name,pwd,20)
    }
}