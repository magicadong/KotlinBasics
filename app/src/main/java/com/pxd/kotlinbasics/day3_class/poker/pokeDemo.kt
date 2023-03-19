package com.pxd.kotlinbasics.day3_class.poker

/**
 * 给两位玩家发一张牌
 * 比大小
 *
 * 1.找对象
 *   玩家 牌 牌的管理器
 * 2.找属性和方法
 *   玩家Player:
 *      name：String
 *      poker：Poker
 *   牌Poker：
 *      number：String
 *      color：String
 *   管理器PokerManager
 *      pokers：Array<Poker>
 *      -getOnePoker():Poker
 *      -compare(Poker,Poker):Int
 */
fun main() {
    val player1 = Player()
    player1.name = "Jack"

    val player2 = Player()
    player2.name = "Rose"

    val manager = PokerManager()
    manager.initPoker()

    player1.poker = manager.getOnePoker()
    player2.poker = manager.getOnePoker()

    val result = manager.compare(player1.poker!!,player2.poker!!)
    println("${player1.poker!!.number}${player1.poker!!.color}  ${player2.poker!!.number}${player2.poker!!.color}")
    when(result){
        0 -> println("player1 == player2")
        1 -> println("player1 > player2")
        else ->{println("player1 < player2")}
    }
}










