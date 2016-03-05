package com.ys._20160115
//scala 是一个 静态的语言 ，但是它具有类型推导的功能
object forDemo {
  def main(args: Array[String]): Unit = {
    // 记住for的这种使用的方法
    for (i <- 1 to 2; j <- 1 to 2 if i != j) {
      println(i + j)
    }

    //要记住  在Scala中函数是有值得，什么叫函数有值呢
    val add = (str: String) => str //这样add就有了值    等号的右边是一个匿名的函数  我们只关心的函数做了什么，但是函数叫什么，我们并不关心
    println(add("hello"))
    def adds(str: String, str1: String) {
      println(str + str1)
    }
    adds("hello", "world")
    def adds1(str: String, str1: String) = { // 所以  如果函数的要有返回值得话，就必须有=，当然返回的类型我们并不需要定义，系统可以自动推导，但是 在写递归的函数的时候返回值的类型就必须，明确的写出来
      str + str1
    }
    val str1 = adds1("hello", "function")
    println(str1 + "**")
    
    
     //  函数有多个参数的时候   怎么定义
  def haha(xx: Int*) = { //这样就定义出来的   一个 可以传入多个参数的函数
    var result = 0;
    for (x <- xx) {
      result+=x
    }
    result
  }
  val xm=haha(1,2,3,4,5,6)
  println(xm)
  }

 
}