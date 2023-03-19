package com.pxd.kotlinbasics.day4_class.management_system

class Student(name:String, password:String): User(name, password) {
    var grade:Int = 0

    fun chooseSubject(){}
}