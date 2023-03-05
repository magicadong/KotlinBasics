package com.pxd.kotlinbasics.day6_demo.manager

import com.pxd.kotlinbasics.day6_demo.models.User

class UserManager {
    //保存所有用户信息
    private val users = arrayListOf<User>()

    //查询用户信息
    fun verifyUser(name:String, password:String):User?{
        TODO()
    }

    //添加用户
    fun addUser(name: String,password: String,type:Int){

    }
}