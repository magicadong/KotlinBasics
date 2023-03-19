package com.pxd.kotlinbasics.day6_demo.models

import com.pxd.kotlinbasics.day6_demo.manager.SmsCenter
import com.pxd.kotlinbasics.day6_demo.utils.showln

class Subject {
    var id: Int = 0
    var name: String = ""
    var teacherId: Int = 0
    var grade: Int = 0
    var students = arrayListOf<Int>()

    fun showInfo(){
        //找到授课老师的信息
        val teacher = SmsCenter.userManager.getTeacher(teacherId)
        "$id. 课程名称:$name 授课老师:${teacher?.name} 年级:$grade".showln()
    }
    fun showDetailInfo(){
        //找到授课老师的信息
        val teacher = SmsCenter.userManager.getTeacher(teacherId)
        "$id. 课程名称:$name 授课老师:${teacher?.name} 年级:$grade".showln()
        if (students.size > 0){
            "学生信息:".showln()
            for (stuId in students){
                val stu = SmsCenter.userManager.getStudent(stuId)
                stu?.showInfo()
            }
        }
    }
}