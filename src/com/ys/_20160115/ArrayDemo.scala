package com.ys._20160115

import scala.io.Source

class ArrayDemo {

}
object ArrayDemo {
  def main(args: Array[String]): Unit = {
    //数组的使用
    val array = Array("hello", "good")

    for (xx <- array) { //不断地萃取每个元素，
      print(xx)
    }

    //这里对应的是 tuple，是从第一个元素开始的
    //tuple 是不能进行 for的操作,
    val tuple = ("100", "hello", 100) 
    print(tuple._1)
    print(tuple._2)
    print(tuple._3)

    //Map()的操作
    val m = Map("3" -> "3", "name" -> "haha")
    for ((k, v) <- m) {
      println(k + " " + v)
    }
    //文件的操作
//    val file = Source.fromFile("E:\\scala_workspace\\Scala\\file\\a.txt")
//    while (file.hasNext) {
//      println(file.next())
//    }
    val urlFile = Source.fromURL("http://123.sogou.com/")
    for(line <-urlFile.getLines()){
      println(line)
    }
  }
}