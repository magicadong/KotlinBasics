package com.pxd.kotlinbasics.day6_demo.models

import com.pxd.kotlinbasics.day6_demo.utils.Tools

class Administator(
    id: Int,
    name: String,
    password: String,
    type: Int
) : User(id, name, password, type) {
    //管理员操作列表
    private val items = arrayOf("添加老师","添加学生","添加课程","退出")

    //加载管理员需要做的事情
    override fun load() {
        //展示操作列表
        Tools.showList(items)

        //接收用户选择
        val choice = Tools.getChoice(items.size)

        //完成对应的功能
        when(choice){
            1 -> {}
            2 -> {}
            3 -> {}
            4 -> { Tools.safeExit()}
        }
    }
}