package com.pxd.kotlinbasics.day6_demo.models

import com.pxd.kotlinbasics.day6_demo.utils.Tools

/**
 * 1.要过演示
 * 2.分析思路
 * 3.使用的技术
 * 4.边说编写
 */
class Teacher(
    id: Int,
    name: String,
    password: String,
    type: Int
) : User(id, name, password, type) {
    private val items = arrayOf("查询所有授课信息","查询课程学生","退出")

    //加载老师需要做的事情
    override fun load() {
        Tools.showList(items)
        //接收用户选择
        val choice = Tools.getChoice(items.size)
        //完成对应的功能
        when(choice) {
            1 -> {}
            2 -> {}
            3 -> {
                Tools.safeExit()
            }
        }
    }
}