package fp_book

/**
  * Created by hemant joshi on 24/01/2016.
  */
object MyModule {

  def abs(n: Int) = if (n > 0) n
  else -n

  private def formatAbs(n: Int) = {
    val msg = "The absolute value %d is %d"
    msg.format(n, abs(n))
  }


  private def formatFactorial(n: Int) = {
    val msg = "The factorial value %d is %d"
    msg.format(n, factorial(n))
  }

  private def formatResult(name: String, n: Int, f: Int=> Int) = {
    val msg = "The %s of  %d is %d"
    msg.format(name,n, f(n))
  }

  private def factorial (n: Int): Int = {
    def go (n: Int, acc: Int) : Int ={
    if (n <= 0) acc
    else go (n-1, acc*n)
    }
    go (n,1)
  }


  private def fib(n: Int): Int = {
    @annotation.tailrec
    def loop(n: Int, prev: Int, cur: Int): Int = {
      val msg = "%d "
      println(msg.format(prev))
      if (n == 0) prev
      else loop(n - 1, cur, prev + cur)
    }
    loop(n, 0, 1)
  }



  def main(args:Array[String]): Unit = {
    println(formatResult("abs",-10, abs))
    println(formatResult("factorial",5, factorial))
  }

}


object PolymorphicFunctions {

  // Here's a polymorphic version of `findFirst`, parameterized on
  // a function for testing whether an `A` is the element we want to find.
  // Instead of hard-coding `String`, we take a type `A` as a parameter.
  // And instead of hard-coding an equality check for a given key,
  // we take a function with which to test each element of the array.
  def findFirst[A](as: Array[A], p: A => Boolean): Int = {
    @annotation.tailrec
    def loop(n: Int): Int = {
      if (n < as.length)
      println(as(n))
      if (n >= as.length) -1
      // If the function `p` matches the current element,
      // we've found a match and we return its index in the array.
      else if (p(as(n))) n
      else loop(n + 1)
    }

    loop(0)
  }

  // Exercise 2: Implement a polymorphic function to check whether
  // an `Array[A]` is sorted
  def isSorted[A](as: Array[A], gt: (A,A) => Boolean): Boolean = {
    @annotation.tailrec
    def go(n: Int): Boolean =
      if (n >= as.length-1) true
      else if (gt(as(n), as(n+1))) false
      else go(n+1)

    go(0)
  }


  def partial1[A,B,C](a: A, f: (A,B) => C): B => C =
    (b: B) => f(a, b)

  // Note that `=>` associates to the right, so we could
  // write the return type as `A => B => C`
  def curry[A,B,C](f: (A, B) => C): A => (B => C) = a => b => f(a, b)

  def main(args:Array[String]): Unit = {
    val strArray =Array("12","14","90","12","90")
    println(findFirst(strArray,(b:String) => b=="10"))

    val strSortedArray =Array("12","14","90")
    println(isSorted(strArray, (a:String, b:String) => a > b))

    println(isSorted(strSortedArray, (a:String, b:String) => a > b))
  }

}


object MonomorphicBinarySearch {

  // First, a findFirst, specialized to `String`.
  // Ideally, we could generalize this to work for any `Array` type.
  def findFirst(ss: Array[String], key: String): Int = {
    @annotation.tailrec
    def loop(n: Int): Int =
    // If `n` is past the end of the array, return `-1`
    // indicating the key doesn't exist in the array.
      if (n >= ss.length) -1
      // `ss(n)` extracts the n'th element of the array `ss`.
      // If the element at `n` is equal to the key, return `n`
      // indicating that the element appears in the array at that index.
      else if (ss(n) == key) n
      else loop(n + 1) // Otherwise increment `n` and keep looking.
    // Start the loop at the first element of the array.
    loop(0)
  }

  def main(args:Array[String]): Unit = {
    println(findFirst(Array("12","14","90","12","90"),"90"))
  }
}