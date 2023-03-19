package com.pxd.kotlinbasics.day6_demo.manager

import com.pxd.kotlinbasics.day6_demo.models.Subject
import com.pxd.kotlinbasics.day6_demo.utils.IdGenerator

class SubjectManager {
    //管理所有课程
    var subjects = arrayListOf<Subject>()

    //添加课程
    fun addSubject(name:String,teacherId:Int,grade:Int):Int{
        val subject = Subject()
        subject.id = IdGenerator.getSubjectId()
        subject.name = name
        subject.teacherId = teacherId
        subject.grade = grade

        subjects.add(subject)

        return subject.id
    }

    //学生选择课程
    fun chooseSubject(userId:Int, subjectId:Int){
        for (subject in subjects){
            //找到课程
            if (subject.id == subjectId){
                //把学生id加到课程的students种
                subject.students.add(userId)
            }
        }
    }

    //显示所有的课程信息
    fun showAllSubjectInfo(){
        for (subject in subjects){
            //打印课程信息
            subject.showInfo()
        }
    }

    //检测课程id是否存在
    fun checkSubjectId(id: Int):Boolean{
        for (subject in subjects){
            if (subject.id == id){
                return true
            }
        }
        return false
    }

    //获取课程
    fun getSubject(id:Int):Subject?{
        for (subject in subjects){
            if (subject.id == id){
                return subject
            }
        }
        return null
    }
}