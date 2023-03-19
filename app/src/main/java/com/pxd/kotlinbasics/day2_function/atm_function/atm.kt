package com.pxd.kotlinbasics.day2_function.atm_function



fun main() {
    welcome()
    if(!inputPassword()){
       exit("密码错误次数过多 请联系管理员!!!")
    }else{
        showMessageln("密码解锁成功！")
    }

    while (true) {
        showMenu(menusArray)
        val choice = chooseMenu(menusArray)
        operationArray[choice-1]()
        shouldContinue()
    }
}





