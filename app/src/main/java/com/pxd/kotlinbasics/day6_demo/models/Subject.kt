package com.pxd.kotlinbasics.day6_demo.models

class Subject {
    var id: Int = 0
    var name: String = ""
    var teacherId: Int = 0
    var grade: Int = 0
    var students = arrayListOf<Int>()
}