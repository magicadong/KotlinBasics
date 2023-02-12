package com.pxd.kotlinbasics.day2_function

fun main() {
//    val nums = arrayOf(1,2,3,4,5)
//    nums.myForEach{index,value ->
//
//    }
//    val names = arrayOf("jack","rose")

    loadData("w"){ data:String?,code:Int? ->
        if (data != null){
            println("获取数据成功: $data")
        }

        if (code != null){
            println("获取数据失败")
            if (code == -1){
                println("网址错误")
            }
        }
    }
}

//-1 -2 -3
fun loadData(url:String, task:(String?,Int?)->Unit){
    if (url.length <= 2){
        //模拟网址有问题
        task(null,-1)
        return
    }

    println("正在获取数据...")

    //获取数据成功
    task("隔壁老王的靓照", null)
}


fun Array<Int>.myForEach(task:(Int)->Unit){
    for (value in this){
        task(value)
    }
}
fun Array<Int>.myForEach(task:(Int,Int)->Unit){
    for ((index, value) in this.withIndex()){
        task(index,value)
    }
}