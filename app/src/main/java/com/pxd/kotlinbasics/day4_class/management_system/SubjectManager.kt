package com.pxd.kotlinbasics.day4_class.management_system

class SubjectManager {
    val subjects = arrayListOf<Subject>()

    fun showSubjects(){}
    fun addSubject(name:String, grade:Int){}
    fun chooseSubject(stuId:Int, subId:Int){}
}