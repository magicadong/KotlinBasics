package com.pxd.kotlinbasics.day6_demo.utils

/**
 * 生成对应id
 */
object IdGenerator {
    var adminIdNumber = 0
    var teacherIdNumber = 0
    var studentIdNumber = 0
    var subjectIdNumber = 0

    fun getAdminId():Int{
        return ++adminIdNumber
    }
    fun getTeacherId():Int{
        return ++teacherIdNumber
    }
    fun getStudentId():Int{
        return ++studentIdNumber
    }
    fun getSubjectId():Int{
        return ++subjectIdNumber
    }
}