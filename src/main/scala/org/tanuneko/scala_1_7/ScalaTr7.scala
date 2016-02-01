package org.tanuneko.scala_1_7

/**
  * Created by neko32 on 2016/01/31.
  */
object ScalaTr7 {

  def main(args:Array[String]):Unit = {
    val trades = List(Trade("TRD123", 1, 1), Trade("TRD123", 1, 2))
    trades foreach (t => t match {
      case trd: Trade if trd.eventId == 1 && trd.eventVersion == 1 => println("It is the head version")
      case _ => println("no, it's not the head version")
    })
  }
}

case class Trade(tradeId:String, eventId:Int, eventVersion:Int)
