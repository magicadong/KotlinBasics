package com.pxd.kotlinbasics.day6_demo.models

import com.pxd.kotlinbasics.day6_demo.utils.Tools

class Student(
    id: Int,
    name: String,
    password: String,
    type: Int
) : User(id, name, password, type) {
    var grade:Int = 0
    //管理员操作列表
    private val items = arrayOf("查询课程","选课","退出")

    //加载学生需要做的事情
    override fun load() {
        Tools.showList(items)
        //接收用户选择
        val choice = Tools.getChoice(items.size)
        //完成对应的功能
        when(choice){
            1 -> {}
            2 -> {}
            3 -> {Tools.safeExit()}
        }
    }
}