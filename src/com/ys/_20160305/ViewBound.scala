package com.ys._20160305
case class Stu[S,T<%Comparable[T]](name:S,age:T)
object ViewBound {
  def main(args: Array[String]): Unit = {
    val stu=Stu("xm","17")
    println(stu)
  }
}
/*

上界和下界建立在Scala类继承层次结构基础之上，而本小节要讲的视图界定则可以跨越类继承层次结构，其实背后的实现原理是隐式转换。先看下面的代码：

//使用的是类型变量界定S <: Comparable[S]

case class Student[T,S <: Comparable[S]](var name:T,var height:S)

object ViewBound extends App{

  //可以编译通过，因为String类型在Comparable继承层次体系

  val s=Student("john","170")

  //下面这条语句不合法，这是因为Int类型没有实现Comparable接口

  val s2=Student("john",170)

}



代码val s=Student("john","170")因为height成员变量是String类型，而String类型实现了Comparable接口，因此该条语句可以编译通过，而val s2=Student("john",170)语句不合法，是因为Int类型不属于Comparable类继承层次结果，但我们知道RichInt类型实现了Comparable接口，Int类型可以经过隐式转换成RichInt类型，使用视图界定就可以使val s2= Student("john",170)代码合法，具体代码如下：


//利用<%符号对泛型S进行限定，它的意思是S可以是Comparable类继承层次结构

//中实现了Comparable接口的类也可以是能够经过隐式转换得到的类,该类实现了Comparable接口

case class Student[T,S <% Comparable[S]](var name:T,var height:S)

 

object ViewBound extends App{

   val s=Student("john","170")

  //下面这条语句在视图界定中是合法的因为Int类型此时会隐式转换为RichInt类，

  //而RichInt类实现了Comparable接口，属于Comparable继承层次结构

  val s2=Student("john",170)

}

*/