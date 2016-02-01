package org.tanuneko.scala_1_5

/**
  * Created by neko32 on 2016/01/31.
  */
object ScalaTr5 {

  def main(args:Array[String]) = {
    val trade1 = Trade("SDB123", 1, 1)
    println(trade1.eventId)
  }

}

case class Trade(tradeId:String, eventId:Int, eventVersion:Int)
