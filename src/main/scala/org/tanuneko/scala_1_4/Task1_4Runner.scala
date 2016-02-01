package org.tanuneko.scala_1_4

/**
  * Created by neko32 on 2016/01/31.
  */
object Task1_4Runner {

  def main(args:Array[String]):Unit = {
    val user = User(22, "Fred Jackson")
    println(user)
  }

}

class User(id:Int, name:String) {
  override def toString = s"{id:${id}, name:${name}}"
}

object User {
  def apply(id:Int, name:String) = {
    new User(id, name)
  }
}
