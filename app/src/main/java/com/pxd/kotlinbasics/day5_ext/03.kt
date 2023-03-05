package com.pxd.kotlinbasics.day5_ext

open class User(var name:String){
    open fun work(){
        println("$name is working")
    }
}
class Teacher(name: String) :User(name){
    override fun work() {
        println("开始上课")
    }
}
class Student(name: String) :User(name){
    override fun work() {
        println("开始学习")
    }
}

fun goToSchool(user: User){
    user.work()
}

fun goToSchool2(student: Student){
    student.work()
}

fun main() {
    val zs = Student("张三")
    val cc = Teacher("苍苍")
    val uu = User("老王")
    goToSchool(cc)
}









