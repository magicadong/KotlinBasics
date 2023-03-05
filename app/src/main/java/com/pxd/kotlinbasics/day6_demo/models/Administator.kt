package com.pxd.kotlinbasics.day6_demo.models

class Administator(
    id: Int,
    name: String,
    password: String,
    type: Int
) : User(id, name, password, type) {


}