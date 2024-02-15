package com.demo.func

import scala.::

object ListPlay {

  def main(args:Array[String]):Unit={
    println("welcome to spark-scala")

    var data = List.empty[Int]
    //create
    data = data ::: List(1,2,3,4)
    println(data.length)

    //Read
    print(data(3))

    //update
    //data(3) = data(100)  Lists are immutable data structures.
    val newData = data.updated(3,100)

    //delete
    println(data.drop(1))
    // Remove an element from the list
    val dData = data.filter(_ != 3) // Removes element 3 from the list
  }

}
