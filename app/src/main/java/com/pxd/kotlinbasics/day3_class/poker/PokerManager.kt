package com.pxd.kotlinbasics.day3_class.poker

import kotlin.random.Random

class PokerManager {
    var pokers: ArrayList<Poker> = arrayListOf()

    /**
     * 初始化一副牌
     */
    fun initPoker(){
        dotArray.forEach { number ->
            colorArray.forEach { color ->
                val poker = Poker()
                poker.number = number
                poker.color = color
                pokers.add(poker)
            }
        }
    }

    fun getOnePoker():Poker{
        val index = Random.nextInt(0,pokers.size)
        val poker = pokers[index]
        pokers.remove(poker)
        return poker
    }

    fun compare(p1:Poker, p2:Poker):Int{
        val p1numberIndex = dotArray.indexOf(p1.number)
        val p2numberIndex = dotArray.indexOf(p2.number)
        //点数相同 比花色
        if ( p1numberIndex == p2numberIndex){
            return if (colorArray.indexOf(p1.color) < colorArray.indexOf(p2.color)){
                -1
            }else{
                1
            }
        }else{
            //点数不相同
            return if (p1numberIndex > p2numberIndex){
                1
            }else{
                -1
            }
        }
    }
}