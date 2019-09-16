package com.fth.ch2

import scala.io.StdIn

object Ex1 extends App {


//for(i  <- 1 to 3  ; j <- 1 to 3) print( i  +""+ j +" ")

  //for(i <- 1 to 3; from = 4-i; j <- from to 3)
    private val str: String = for(c <- "Hello"; i<-0 to 1) yield {c+i}.toChar
  println(str)

  def sum(args:Int*):Int ={
    var res=0
    for(arg <- args)
      res+= arg
    res

  }
  println(sum(1,2,4,5))


  val s = sum(1 to 5:_*)

  //This call syntax is needed in a recursive definition

  def recursiveSum(args:Int*):Int ={

    if(args.length == 0) 0
    else args.head+recursiveSum(args.tail:_*)

    //Here the head of a sequence is its initial element and tail is a sequence of
    //all other elements. Thats again a seq and we have to use :
  }


  lazy val words = scala.io.Source.fromFile("/").mkString
    //lazy data structures


//after reset head deneme line

}
