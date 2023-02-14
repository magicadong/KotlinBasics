package com.pxd.kotlinbasics.day4_class.management_system

class Teacher(name:String, password:String): User(name, password){

    //展示所有课程信息
    fun showSubjects(){}
    //展示一门课程的信息
    fun showSubject(id:Int){}
}