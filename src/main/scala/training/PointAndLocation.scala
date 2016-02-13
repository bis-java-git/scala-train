package training

/**
  * Created by hemant joshi on 23/01/2016.
  */
object PointAndLocation {
  def main(args: Array[String]) {
    val loc = new Location(10, 20, 15);
    val loc2 = new Location(12, 20, 15);
    val loc3 = new Location(10, 20, 15);

    println(loc.isEqual(loc2))
    println(loc.isEqual(loc3))


    println(loc.isNotEqual(loc2))
    println(loc.isNotEqual(loc3))

    // Move to a new location
    loc.move(10, 10, 5);

  }
}

trait Equal {
  def isEqual(x: Any): Boolean
  def isNotEqual(x: Any): Boolean = !isEqual(x)
}


class Point(val xc: Int, val yc: Int) {
var x: Int = xc
var y: Int = yc
def move(dx: Int, dy: Int) {
x = x + dx
y = y + dy
println ("Point x location : " + x);
println ("Point y location : " + y);
}

  def isEqual(obj: Any) =
    obj.isInstanceOf[Point] &&
      obj.asInstanceOf[Point].x == x &&
      obj.asInstanceOf[Point].y ==y


  def isNotEqual(obj: Any) = !isEqual(obj)
}


class Location(override val xc: Int, override val yc: Int,
               val zc :Int) extends Point(xc, yc){
  var z: Int = zc

  def move(dx: Int, dy: Int, dz: Int) {
    x = x + dx
    y = y + dy
    z = z + dz
    println ("Point x location : " + x);
    println ("Point y location : " + y);
    println ("Point z location : " + z);
  }
}