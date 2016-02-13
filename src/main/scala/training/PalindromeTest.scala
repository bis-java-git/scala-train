package training

/**
  * Created by hemant joshi on 23/01/2016.
  */
object PalindromeTest {
  def main(args: Array[String]) {
    var palindrome = "Dot saw I was Tod";

    println( "Palindrome? %b".format(checkPalinDrome(palindrome)) );
  }

  def checkPalinDrome(palinDromeString: String): Boolean = {
    return palinDromeString.toLowerCase()==palinDromeString.toLowerCase.reverse
  }
}
