package com.pxd.kotlinbasics.day2_function.atm_function

const val PASSWORD = 123
const val WRONG_TIME = 3
const val ERROR_RESULT = -88888
var totalMoney = 1000
val menusArray = arrayOf("查询余额","存款","取款","退出")
val operationArray = arrayOf(::queryMoney,::saveMoney,::takeMoney,::quit)