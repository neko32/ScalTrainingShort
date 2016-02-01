package org.tanuneko.scala_1_8

/**
  * Created by neko32 on 2016/01/31.
  */

trait Connection {
  def connect
  protected def showUserInfo(userId:String, passwd:String) = {
    println(s"userId:${userId},passwd:${passwd}")
  }
}

trait Monitor {
    def monitor():Unit
}

class DBAccessor(userId:String,passwd:String) extends Connection with Monitor {
  override def connect() = {
    println(s"connecting DB with (${userId},${passwd}")
  }
  override def monitor() = {
    println("monitoring..")
  }
  def showUserInfo = super.showUserInfo(userId, passwd)
}

object ScalaTr8 {
  def main(args:Array[String]) = {
    val dbAccess = new DBAccessor("myUser", "myUser1234X")
    dbAccess.showUserInfo
    dbAccess.connect
    dbAccess.monitor
  }
}
