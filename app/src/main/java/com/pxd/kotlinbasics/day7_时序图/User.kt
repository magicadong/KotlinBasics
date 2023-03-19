package com.pxd.kotlinbasics.day7_时序图

import kotlin.contracts.contract

class User(
    var name: String,
    var password: String
) {
    fun login(){
        val console = Console()
        console.getUserInfo{name,pwd,age ->
            val server = Server()
            val result = server.verifyInfo(name,pwd)
        }
    }
}