package org.tanuneko.scala_1_1

/**
  * Created by neko32 on 2016/01/31.
  */
object FirstScalaObj {

  def main(args:Array[String]):Unit = {
    val fixedMsg = "Hello World"
    println(fixedMsg)
    var varMsg = "EMPTY"
    varMsg = getHelloWorldMessage
    println(varMsg)
  }

  def getHelloWorldMessage() = "Hello World2"

}
