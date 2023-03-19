package com.pxd.kotlinbasics.day7_时序图

class Server {
    fun verifyInfo(name:String, pwd:String):Boolean{
        return Sql().checkUser(name,pwd)
    }
}