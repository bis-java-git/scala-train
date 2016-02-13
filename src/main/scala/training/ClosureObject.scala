package training

/**
  * Created by hemant joshi on 23/01/2016.
  */
object ClosureObject {

  var factor = 3
  val multiplier = (i:Int) => i * factor

  def main(args: Array[String]) {
    println( "muliplier(1) value = " +  multiplier(1) )
    println( "muliplier(2) value = " +  multiplier(2) )
  }
}
