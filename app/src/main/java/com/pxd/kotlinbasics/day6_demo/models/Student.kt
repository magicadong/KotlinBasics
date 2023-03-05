package com.pxd.kotlinbasics.day6_demo.models

class Student(
    id: Int,
    name: String,
    password: String,
    type: Int
) : User(id, name, password, type) {
    var grade:Int = 0

}