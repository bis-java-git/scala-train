package training

/**
  * Created by hemant joshi on 23/11/2015.
  */
object Timer {
  def oncePerSecond(callback: () => Unit) {
    var myInt : Int = 10;
    while (myInt > 0) {
      callback();
      Thread sleep 1000
      myInt-=1
    }
  }
  def timeFlies() {
    println("time flies like an arrow...")
  }

  def main(args: Array[String]) {
    oncePerSecond(timeFlies)
  }
}
