package com.pxd.kotlinbasics.day6_demo.models

import com.pxd.kotlinbasics.day6_demo.manager.SmsCenter
import com.pxd.kotlinbasics.day6_demo.utils.*

class Administator(
    id: Int,
    name: String,
    password: String,
    type: Int
) : User(id, name, password, type) {
    //管理员操作列表
    private val items = arrayOf("添加老师","添加学生","添加课程","退出")
    private val funsArray = arrayOf(::addTeacher,::addStudent,::addSubject,::exit)

    //加载管理员需要做的事情
    override fun load() {
        //展示操作列表
        Tools.showList(items)

        //接收用户选择
        val choice = Tools.getChoice(items.size)

        //完成对应的功能
        funsArray[choice-1]()
    }

    //添加一个老师
    private fun addTeacher(){
        val name = Tools.inputString("请输入用户名")
        val pwd = Tools.inputString("请输入密码")
        SmsCenter.userManager.addUser(name, pwd, Type_Teacher)
    }

    private fun addStudent(){
        val name = Tools.inputString("请输入用户名")
        val pwd = Tools.inputString("请输入密码")
        //val grade = Tools.inputInt("请输入年级")
        SmsCenter.userManager.addUser(name, pwd, Type_Student)
    }
    private fun addSubject(){
        //课程名称
        val name = Tools.inputString("请输入课程名称")

        //老师编号
        SmsCenter.userManager.showAllTeachersInfo()
        var teacherId = 0
        while (true) {
            teacherId = Tools.inputInt("请输入授课老师编号")
            if (teacherId < 1 || teacherId > SmsCenter.userManager.teachers.size){
                "输入不正确 "
            }else{
                break
            }
        }

        //适用哪个年级
        val grade = Tools.inputInt("请输入课程年级")

        val sid = SmsCenter.subjectManager.addSubject(name, teacherId, grade)

        //将课程添加给老师
        SmsCenter.userManager.addSubjectToTeacher(sid,teacherId)
    }
}