package com.ys._20160115

object ScalaInAction {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val s=new Array[Int](10) //这是定长的数组              //> s  : Array[Int] = Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
  val s1=new Array[String](10)                    //> s1  : Array[String] = Array(null, null, null, null, null, null, null, null, 
                                                  //| null, null)
  val s2=Array("hello","world")                   //> s2  : Array[String] = Array(hello, world)
  import scala.collection.mutable.ArrayBuffer
  val b=ArrayBuffer[Int]()                        //> b  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer()
  b+=1                                            //> res0: com.ys._20160115.ScalaInAction.b.type = ArrayBuffer(1)
  b+=(1,2,3)                                      //> res1: com.ys._20160115.ScalaInAction.b.type = ArrayBuffer(1, 1, 2, 3)
  b ++=Array(4,5,6,7)                             //> res2: com.ys._20160115.ScalaInAction.b.type = ArrayBuffer(1, 1, 2, 3, 4, 5, 
                                                  //| 6, 7)
  
  b                                               //> res3: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 1, 2, 3, 4,
                                                  //|  5, 6, 7)
  
  //trim(),trimStart(),tirmEnd()   表示的删除   字符串头尾的某些字符，
 	b.insert(2, 3)
 	
 	b                                         //> res4: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 1, 3, 2, 3,
                                                  //|  4, 5, 6, 7)
 	val c=b.toArray                           //> c  : Array[Int] = Array(1, 1, 3, 2, 3, 4, 5, 6, 7)
 	c                                         //> res5: Array[Int] = Array(1, 1, 3, 2, 3, 4, 5, 6, 7)
 	b.remove(1,2)
 	b                                         //> res6: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 4, 5,
                                                  //|  6, 7)
  val d=Array(1,2,3,4)                            //> d  : Array[Int] = Array(1, 2, 3, 4)
  d.filter(_%2==0).map(_*2)                       //> res7: Array[Int] = Array(4, 8)
  d.max                                           //> res8: Int = 4
  d.sum                                           //> res9: Int = 10
  
  d.mkString("and")                               //> res10: String = 1and2and3and4
  d.mkString("<",",",">")                         //> res11: String = <1,2,3,4>
  
  //还可以定义矩阵
  val matrix=Array.ofDim[Double](3,4)             //> matrix  : Array[Array[Double]] = Array(Array(0.0, 0.0, 0.0, 0.0), Array(0.0,
                                                  //|  0.0, 0.0, 0.0), Array(0.0, 0.0, 0.0, 0.0))
  
  matrix(2)(2)=8
  
  val mm=new Array[Array[Int]](10)                //> mm  : Array[Array[Int]] = Array(null, null, null, null, null, null, null, nu
                                                  //| ll, null, null)
  for(i <- 0 until 10){
 		mm(i)=new Array[Int](i+1)
  }
  mm                                              //> res12: Array[Array[Int]] = Array(Array(0), Array(0, 0), Array(0, 0, 0), Arra
                                                  //| y(0, 0, 0, 0), Array(0, 0, 0, 0, 0), Array(0, 0, 0, 0, 0, 0), Array(0, 0, 0,
                                                  //|  0, 0, 0, 0), Array(0, 0, 0, 0, 0, 0, 0, 0), Array(0, 0, 0, 0, 0, 0, 0, 0, 0
                                                  //| ), Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
}