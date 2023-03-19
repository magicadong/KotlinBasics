package com.pxd.kotlinbasics.day6_demo.manager

import com.pxd.kotlinbasics.day6_demo.models.User
import com.pxd.kotlinbasics.day6_demo.utils.*
import java.util.Scanner

class StudentSystemManager{
    //启动系统
    fun start(){
        //加载基础数据
        loadData()

        //登录
        while (true) {
            val user = login()
            if (user == null) {
                println("登录失败！")
            }else{
                while (true) {
                    user.load()
                }
            }
        }


    }

    //登录
    private fun login():User?{
        val name = Tools.inputString("登录 请输入用户名")
        val pwd = Tools.inputString("登录 请输入密码")
        //判断用户是否存在 或者 用户的类型
        return SmsCenter.userManager.verifyUser(name, pwd)
    }
}