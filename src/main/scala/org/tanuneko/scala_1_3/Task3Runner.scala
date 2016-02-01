package org.tanuneko.scala_1_3

/**
  * Created by neko32 on 2016/01/31.
  */
object Task3Runner {

  def main(args:Array[String]):Unit = {
    val user = new User(22, "Fred Jackson")
    println(user)
  }

}

class User(id:Int, name:String) {
  override def toString = s"{id:${id}, name:${name}}"
}
