package training

/**
  * Created by hemant joshi on 24/01/2016.
  */
object MyList {
  // List of Strings
  val fruit = "apples" :: ("oranges" :: ("pears" :: Nil))

  val fruit2 = List("mangoes", "banana", "grapes", "oranges",Nil)

  // List of Integers
  val nums = 1 :: (2 :: (3 :: (4 :: Nil)))

  // Empty List.
  val empty = Nil

  // Two dimensional list
  val dim = (1 :: (0 :: (0 :: Nil))) ::
    (0 :: (1 :: (0 :: Nil))) ::
    (0 :: (0 :: (1 :: Nil))) :: Nil

  def main (args: Array[String]): Unit = {
//    println(fruit)
//    println(fruit2)
//    println(nums)
//    println(empty)
//    println(dim)
//
//    println(fruit2.head)
//    println(fruit2.tail)

//    var fruit3 = fruit ::: fruit2;
//    println(fruit3)
//
//    var fruit4 = fruit.:::(fruit2);
//    println(fruit4)

    // Creates 5 elements using the given function.
    val squares = List.tabulate(6)(n => n * n)
//    println( "squares : " + squares  )

    val mul = List.tabulate( 4,5 )( _ * _ )
//    println( "mul : " + mul  )

    val set : Set[Int] = Set(1,1,3)
//    println(set);

    val numbers =Map("one" -> 1, "two" -> 2)
//    println(numbers)
//    println(numbers.keys)
//    println(numbers.get("two"))
//    println(numbers.get("two2"))

    val list: List[(Int, String)] = List(1, 2, 3).zip(List("a", "b", "c"))

//    println(list.foreach { f =>
//      val (c:Int, n:String) = f
//      println(c)
//      println(n)
//    })


    println(list.foreach {
      case (c:Int, n:String) =>  println(n+" "+c)
    })

//Original but with index
    val ls = List("Mary", "had", "a", "little", "lamb")
    ls.zipWithIndex.foreach{ case (e, i) => println(i+" "+e) }
  }
}
