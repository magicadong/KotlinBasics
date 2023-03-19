package com.pxd.kotlinbasics.day2_function

/**
 Array 容量在创建时就已经固定了，不可以增加或者减少
 */
fun main() {
    //创建一个拥有预留空间的数组，并且给相应的初始化值
    val a1: Array<Int> = Array(5,{0})
    val a2: Array<Int> = Array(5){0}
    val a3: Array<Int> = Array(5){it}
    a1[0] = 1
    a2[1] = 2

    //创建数组时明确知道数组元素的值
    val a5: Array<String> = arrayOf("jack","rose")
    val a6: Array<Boolean> = arrayOf(true,false)
    val a7: Array<Array<Int>> = arrayOf(a1,a2)

    val s1 = a7[0]
    val s2 = s1[1]

    val st = a7[0][1]

    //a4[5] = 6 //ArrayIndexOutOfBoundsException


    //在一个区间取值
    //闭区间
    for (i in 0..10){
        //print("$i ")
    }

    //改变步调
    for (i in 0..10 step 2){
        //print("$i ")
    }

    //开区间
    for (i in 0 until 10){
        //print("$i ")
    }

    val a4 = arrayOf(1,2,3,4,5)

    //遍历
    //直接从数组里面取出每一个值 等待操作
    //不关心索引 只关心具体的值
    for (num in a4){
        //print("$num ")
    }
    a4.forEach {
        //print("$it")
    }
    a4.forEach { num ->
        //print("$num")
    }

    //关心索引位置
    for (i in a4.indices){  //0..a4.size-1
        val num = a4[i]
    }

    //同时获取索引和对应值
    for ((index,num) in a4.withIndex()){
        //print("$index-$num")
    }
    a5.forEachIndexed{index, item ->
        print("$index-$item ")
    }
}