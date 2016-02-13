package main.scala.training

import java.util.Date

import training.FrenchDate

/**
  * Created by hemant joshi on 23/11/2015.
  */
object HelloWorld {

  def main(args: Array[String]) {
   var d1:BigDecimal=20.5
    val d2 : BigDecimal = 2

    println(d1*d2);
    println("Hello World!")
    FrenchDate.printNowDate(new Date);
  }
}
