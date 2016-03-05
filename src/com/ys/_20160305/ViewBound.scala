package com.ys._20160305
case class Stu[S,T<%Comparable[T]](name:S,age:T)
object ViewBound {
  def main(args: Array[String]): Unit = {
    val stu=Stu("xm","17")
    println(stu)
  }
}