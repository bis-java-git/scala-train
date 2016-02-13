package training

import java.io.{FileReader, FileNotFoundException, IOException}

/**
  * Created by hemant joshi on 23/01/2016.
  */
object ExceptionTest {
  def main(args: Array[String]) {

    try {
      val f = new FileReader("input.txt")
    } catch {
      case ex: FileNotFoundException =>{
        println("Missing file exception"+ex.printStackTrace())
      }
      case ex: IOException => {
        println("IO Exception"+ex)
      }
    }


  }
}
