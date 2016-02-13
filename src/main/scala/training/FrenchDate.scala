package training
import java.util.{Date, Locale}
import java.text.DateFormat._
/**
  * Created by hemant joshi on 23/11/2015.
  */
object FrenchDate {
  def main(args: Array[String]) {
    printNowDate(new Date)
  }

  def printNowDate(now: Date): Unit = {
    val df = getDateInstance(LONG, Locale.UK)
    debug(df format now) //df format now
  }

  def debug(debug: String): Unit = {
    println(debug)
  }

}
