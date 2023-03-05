package com.pxd.kotlinbasics.day6_demo.models

open class User(
    var id: Int,
    var name: String,
    var password: String,
    var type:Int
){
    //加载每个角色需要完成的任务
    open fun load(){}
}