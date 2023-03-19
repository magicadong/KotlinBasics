package com.pxd.kotlinbasics.day6_demo.utils

import android.provider.Telephony.Sms
import com.pxd.kotlinbasics.day6_demo.manager.SmsCenter

fun exit(){
    //保存数据
    SmsCenter.fileManager.saveUserInfo(SmsCenter.userManager.users)
    SmsCenter.fileManager.saveSubjectInfo(SmsCenter.subjectManager.subjects)

    Tools.safeExit()
}

fun loadData(){
    //从文件中加载用户信息
    val users = SmsCenter.fileManager.loadUserInfo()
    //从文件中加载课程信息
    val subjects = SmsCenter.fileManager.loadSubjectInfo()

    //保存用户信息
    SmsCenter.userManager.users = users
    //保存课程信息
    SmsCenter.subjectManager.subjects = subjects

    //如果没有用户 提供一个默认管理员
    if (users.size == 0){
        SmsCenter.userManager.addDefaultAdmin()
    }
}