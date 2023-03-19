package com.pxd.kotlinbasics.day6_demo.manager

import com.pxd.kotlinbasics.day6_demo.models.User
import com.pxd.kotlinbasics.day6_demo.utils.Tools
import com.pxd.kotlinbasics.day6_demo.utils.Type_Administrator
import com.pxd.kotlinbasics.day6_demo.utils.Type_Student
import com.pxd.kotlinbasics.day6_demo.utils.Type_Teacher
import java.util.Scanner

class StudentSystemManager{
    //启动系统
    fun start(){
        //添加默认的管理员
        SmsCenter.userManager.addDefaultAdmin()

        //登录
        while(true) {
            val user = login()
            if (user == null) {
                println("登录失败！")
                continue
            }

            println("登录成功")

            user.load()


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