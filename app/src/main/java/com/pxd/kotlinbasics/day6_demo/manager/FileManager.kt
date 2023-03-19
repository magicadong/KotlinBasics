package com.pxd.kotlinbasics.day6_demo.manager

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.pxd.kotlinbasics.day6_demo.models.Subject
import com.pxd.kotlinbasics.day6_demo.models.User
import com.pxd.kotlinbasics.day6_demo.utils.Subject_Detail_Path
import com.pxd.kotlinbasics.day6_demo.utils.User_Detail_Path
import java.io.File

class FileManager {
    private val gson:Gson by lazy {
        Gson()
    }

    //保存所有用户信息 List<User>
    fun saveUserInfo(users:List<User>){
        //创建文件对象
        val file = File(User_Detail_Path)
        //将数组转化为json格式字符串
        val jsonString = gson.toJson(users)
        //写入文件中
        file.writeText(jsonString)
    }

    //读取用户信息
    fun loadUserInfo(): ArrayList<User> {
        return try {
            //创建文件对象
            val file = File(User_Detail_Path)
            //读取json字符转
            val jsonString = file.readText()
            //将json字符串转化为对象
            val objectToken = object : TypeToken<ArrayList<User>>() {}
            gson.fromJson(jsonString, objectToken.type)
        }catch (e:Exception){
            arrayListOf()
        }
    }


    //保存课程信息
    fun saveSubjectInfo(subjects:List<Subject>){
        //创建文件对象
        val file = File(Subject_Detail_Path)
        //将数组转化为json格式字符串
        val jsonString = gson.toJson(subjects)
        //写入文件中
        file.writeText(jsonString)
    }

    //读取课程信息
    fun loadSubjectInfo(): ArrayList<Subject> {
        return try {
            //创建文件对象
            val file = File(Subject_Detail_Path)
            //读取json字符转
            val jsonString = file.readText()
            //将json字符串转化为对象
            val objectToken = object : TypeToken<ArrayList<Subject>>() {}
            gson.fromJson(jsonString, objectToken.type)
        }catch (e:Exception){
            arrayListOf()
        }
    }
}