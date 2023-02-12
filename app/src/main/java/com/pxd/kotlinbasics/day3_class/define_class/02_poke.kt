package com.pxd.kotlinbasics.day3_class.define_class

/**
 扑克牌
 A 2 3 4 5 6 7 8 9 10 J Q K
 ♠ ♥ ♣ ♦

 每一张牌有四种花色
 A♠ A♥ A♣ A♦

 给两位玩家发一张牌
 比大小
 */

class Poker{
    var number: String = ""
    var color: String = ""
}

fun main() {
    val dotArray = arrayOf("2","3","4","5","6","7","8","9","10","J","Q","K","A")
    val colorArray = arrayOf("♠","♥","♣","♦")

    val pokerArray = arrayListOf<Poker>()

    dotArray.forEach { num ->
        colorArray.forEach { color ->
            val poke = Poker()
            poke.number = num
            poke.color = color
            pokerArray.add(poke)
        }
    }


    pokerArray.forEachIndexed { index, poker ->
        print("${poker.number}${poker.color} ")
        if ((index+1) % 4 == 0){
            println()
        }
    }
//    dotArray.forEach { number ->
//        colorArray.forEach { color ->
//            print("$number$color ")
//        }
//        println()
//    }
}
