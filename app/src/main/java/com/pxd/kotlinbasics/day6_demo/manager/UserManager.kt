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
    //所有老师信息
    val teachers:List<Teacher>
        get() {
            val tempArray = arrayListOf<Teacher>()
            for (user in users){
                if (user.type == Type_Teacher){
                    tempArray.add(user as Teacher)
                }
            }
            return tempArray
        }

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
        when(type){
            Type_Administrator -> users.add(Administator(IdGenerator.getAdminId(),name, password, type))
            Type_Teacher -> users.add(Teacher(IdGenerator.getTeacherId(),name, password, type))
            Type_Student -> users.add(Student(IdGenerator.getStudentId(),name, password, type))
        }
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
    }

    //显示所有老师信息
    fun showAllTeachersInfo(){
        for (teacher in teachers){
            teacher.showInfo()
        }
    }

    //查询老师
    fun getTeacher(id: Int):Teacher?{
        for (user in users){
            if (user.id == id && user.type == Type_Teacher){
                return user as Teacher
            }
        }
        return null
    }

    //查询学生
    fun getStudent(id: Int):Student?{
        for (user in users){
            if (user.id == id && user.type == Type_Student){
                return user as Student
            }
        }
        return null
    }

    //给老师添加课程
    fun addSubjectToTeacher(subjectId:Int, teacherId:Int){
        getTeacher(teacherId)?.addSubject(subjectId)
    }
}