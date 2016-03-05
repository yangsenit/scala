package com.ys._20160115

object ScalaInAction {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(92); 
  println("Welcome to the Scala worksheet");$skip(37); 
  val s=new Array[Int](10);System.out.println("""s  : Array[Int] = """ + $show(s ));$skip(31);  //这是定长的数组
  val s1=new Array[String](10);System.out.println("""s1  : Array[String] = """ + $show(s1 ));$skip(32); 
  val s2=Array("hello","world")
  import scala.collection.mutable.ArrayBuffer;System.out.println("""s2  : Array[String] = """ + $show(s2 ));$skip(73); 
  val b=ArrayBuffer[Int]();System.out.println("""b  : scala.collection.mutable.ArrayBuffer[Int] = """ + $show(b ));$skip(7); val res$0 = 
  b+=1;System.out.println("""res0: com.ys._20160115.ScalaInAction.b.type = """ + $show(res$0));$skip(13); val res$1 = 
  b+=(1,2,3);System.out.println("""res1: com.ys._20160115.ScalaInAction.b.type = """ + $show(res$1));$skip(22); val res$2 = 
  b ++=Array(4,5,6,7);System.out.println("""res2: com.ys._20160115.ScalaInAction.b.type = """ + $show(res$2));$skip(7); val res$3 = 
  
  b;System.out.println("""res3: scala.collection.mutable.ArrayBuffer[Int] = """ + $show(res$3));$skip(75); 
  
  //trim(),trimStart(),tirmEnd()   表示的删除   字符串头尾的某些字符，
 	b.insert(2, 3);$skip(7); val res$4 = 
 	
 	b;System.out.println("""res4: scala.collection.mutable.ArrayBuffer[Int] = """ + $show(res$4));$skip(18); 
 	val c=b.toArray;System.out.println("""c  : Array[Int] = """ + $show(c ));$skip(4); val res$5 = 
 	c;System.out.println("""res5: Array[Int] = """ + $show(res$5));$skip(16); 
 	b.remove(1,2);$skip(4); val res$6 = 
 	b;System.out.println("""res6: scala.collection.mutable.ArrayBuffer[Int] = """ + $show(res$6));$skip(23); 
  val d=Array(1,2,3,4);System.out.println("""d  : Array[Int] = """ + $show(d ));$skip(28); val res$7 = 
  d.filter(_%2==0).map(_*2);System.out.println("""res7: Array[Int] = """ + $show(res$7));$skip(8); val res$8 = 
  d.max;System.out.println("""res8: Int = """ + $show(res$8));$skip(8); val res$9 = 
  d.sum;System.out.println("""res9: Int = """ + $show(res$9));$skip(23); val res$10 = 
  
  d.mkString("and");System.out.println("""res10: String = """ + $show(res$10));$skip(26); val res$11 = 
  d.mkString("<",",",">");System.out.println("""res11: String = """ + $show(res$11));$skip(53); 
  
  //还可以定义矩阵
  val matrix=Array.ofDim[Double](3,4);System.out.println("""matrix  : Array[Array[Double]] = """ + $show(matrix ));$skip(20); 
  
  matrix(2)(2)=8;$skip(38); 
  
  val mm=new Array[Array[Int]](10);System.out.println("""mm  : Array[Array[Int]] = """ + $show(mm ));$skip(53); 
  for(i <- 0 until 10){
 		mm(i)=new Array[Int](i+1)
  };$skip(9); val res$12 = 
  mm;System.out.println("""res12: Array[Array[Int]] = """ + $show(res$12))}
}
