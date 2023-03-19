package com.pxd.kotlinbasics.day6_demo.models

import com.pxd.kotlinbasics.day6_demo.manager.SmsCenter
import com.pxd.kotlinbasics.day6_demo.utils.Tools
import com.pxd.kotlinbasics.day6_demo.utils.exit
import com.pxd.kotlinbasics.day6_demo.utils.showln

class Student(
    id: Int,
    name: String,
    password: String,
    type: Int
) : User(id, name, password, type) {
    var grade:Int = 0
    //管理员操作列表
    private val items = arrayOf("查询课程","选课","退出")
    private val funsArray = arrayOf(::showSelectedSubjects,::chooseSubject,::exit)
    private val subjectIds = arrayListOf<Int>()

    //加载学生需要做的事情
    override fun load() {
        Tools.showList(items)
        //接收用户选择
        val choice = Tools.getChoice(items.size)
        //完成对应的功能
        funsArray[choice-1]()
    }

    //显示当前选课的信息
    private fun showSelectedSubjects(){
        for (sid in subjectIds){
            val subject = SmsCenter.subjectManager.getSubject(sid)
            subject?.showInfo()
        }
    }

    //选课
    private fun chooseSubject(){
        //打印所有课程信息
        SmsCenter.subjectManager.showAllSubjectInfo()
        //选择课程
        val sid = Tools.inputInt("请输入课程id")
        if (SmsCenter.subjectManager.checkSubjectId(sid)){
            //学生选课  把学生的id加到对应课程中
            SmsCenter.subjectManager.chooseSubject(id,sid)
            //将课程id添加到学生所选课程的id数组中
            subjectIds.add(sid)
        }
    }

    //展示信息
    fun showInfo(){
        "$id. 姓名:$name 密码:$password".showln()
    }
}