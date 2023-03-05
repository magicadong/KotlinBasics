package com.pxd.kotlinbasics.day6_demo.manager

import com.pxd.kotlinbasics.day6_demo.models.Administator
import com.pxd.kotlinbasics.day6_demo.models.Student
import com.pxd.kotlinbasics.day6_demo.models.Teacher
import com.pxd.kotlinbasics.day6_demo.models.User
import com.pxd.kotlinbasics.day6_demo.utils.IdGenerator
import com.pxd.kotlinbasics.day6_demo.utils.Type_Administrator
import com.pxd.kotlinbasics.day6_demo.utils.Type_Student
import com.pxd.kotlinbasics.day6_demo.utils.Type_Teacher

class UserManager {
    //保存所有用户信息
    private val users = arrayListOf<User>()

    //查询用户信息
    fun verifyUser(name:String, password:String):User?{
        for (user in users){
            if (user.name == name && user.password == password){
                return user
            }
        }
        return null
    }

    //添加用户
    fun addUser(name: String,password: String,type:Int){

    }

    //添加一个默认的管理员
    fun addDefaultAdmin(){
        val id = IdGenerator.getAdminId()
        val admin = Administator(
            id,
            "admin",
            "123",
            Type_Administrator
        )
        users.add(admin)

        users.add(Teacher(
            IdGenerator.getTeacherId(),
            "t1",
            "123",
            Type_Teacher
        ))

        users.add(Student(
            IdGenerator.getStudentId(),
            "s1",
            "123",
            Type_Student
        ))
    }
}