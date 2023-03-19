package com.pxd.kotlinbasics.day4_class.management_system

class Subject{
    var id:Int = 0
    var name:String = ""
    var teacherId:Int = 0
    var grade:Int = 0
    var students = arrayListOf<Student>()
}