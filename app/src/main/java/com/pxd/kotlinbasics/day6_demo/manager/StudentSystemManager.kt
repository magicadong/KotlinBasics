package com.pxd.kotlinbasics.day6_demo.manager

import com.pxd.kotlinbasics.day6_demo.models.User
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
        return try {
            print("请输入用户名:")
            val name = readLine()!!
            print("请输入密码:")
            val pwd = readLine()!!
            //判断用户是否存在 或者 用户的类型
            SmsCenter.userManager.verifyUser(name, pwd)
        }catch (e:Exception){
            println("输入有误！")
            null
        }
    }
}