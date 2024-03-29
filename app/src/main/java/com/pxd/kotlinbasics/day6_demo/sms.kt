package com.pxd.kotlinbasics.day6_demo

import com.pxd.kotlinbasics.day6_demo.manager.SmsCenter

/**
 * 学生管理系统
 * 1. 管理员 Manager
 *    - 添加老师 、添加学生 、添加课程、 分配课程
 * 2. 老师 Teacher
 *    - 显示所授课程 、显示某门课程信息
 * 3. 学生 Student
 *    -选择课程
 * 4. 课程 Subject
 *    - 课程编号、课程名称、授课教师编号、课程学生
 * 5. 管理用户 UserManager
 * 6. 管理课程 SubjectManager
 * 7. User
 *
 * 1.登录
 *   默认提供一个管理员账号 admin 123
 *   登录之后根据账号类型辨别用户类型
 * 2.管理员
 *   显示操作菜单：
 *      添加老师-编号 姓名 账号信息(自动生成 账号名：zhangsan1  密码：123）
 *      添加学生-编号 姓名 年级 账号信息(自动生成 账号名：zhangsan1  密码：123）
 *      添加课程-编号 课程名称 授课老师编号 可选年级
 * 3.学生
 *   选课
 *   查看所选课程
 * 4.老师（一门课程只能由一个老师上）
 *   查看授课信息
 *
 * 选择切换账号
 *
 *
 *
 *
 *
 *
 *
 * 用户：User
 *         -type:Int
 *
 * 管理员 Administrator
 * 老师 Teacher
 * 学生 Student
 *
 * 课程 Subject
 *
 * 管理用户： UserManager
 *              - users：ArrayList<User>
 * 管理课程： SubjectManager
 *              - subjects:ArrayList<Subject>
 */

fun main() {
    SmsCenter.smsManager.start()
}

/**
 * SmsCenter -> smsManager -> Start()
     *                         -> userManager -> addDefaultAdmin()
     *                         -> login()
     *                              -> userManager -> verifyUser()
     *                              -> user -> load()
 *
 * 1. 从0-1写项目
 *  找对象
 *  抽类
 *  梳理类与类之间的关系
 *  类图
 *  写功能的时序图
 *  写代码
 *  迭代
 *
 * 2. 阅读别人的代码
 *  首先找到入口点
 *  理清程序的执行顺序
 *  类图 -> 把控全局
 *  梳理复杂功能的时序图
 */







