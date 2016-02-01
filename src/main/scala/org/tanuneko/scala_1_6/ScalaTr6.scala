package org.tanuneko.scala_1_6

/**
  * Created by neko32 on 2016/01/31.
  */
object ScalaTr6 {

  def main(args:Array[String]):Unit = {
    val trades = List(Trade("TRD123", 1, 1), Trade("TRD123", 1, 2))
    trades foreach println
  }

}

case class Trade(tradeId:String, eventId:Int, eventVersion:Int)
