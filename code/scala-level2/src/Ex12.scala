

/*
 *  Exception
 *  
 *  
 *    --> un-expected program flow disturb
 *    
 *    reasons for exceptions
 *    
 *    etc......
 *    
 *    
 *    
 * 
 * 
 * 
 */

object Ex12 {

  def main(args: Array[String]): Unit = {

    // try , catch , finally
    //
    //    val s = "123"
    //    var arr = Array(10, 20)
    //    try {
    //
    //      val i = s.toInt
    //      val a = arr(0)
    //      var ari = 1 / 0;
    //
    //    } catch {
    //      case e: NumberFormatException => print("number exception")
    //      case e: ArrayIndexOutOfBoundsException => print("array exception")
    //      case _: Throwable => println("some internal error");
    //    }
    //
    //    println("i am with next work..");

    //---------------------------------------------------------

    def toInt(s: String): Option[Int] = {
      try {
        Some(s.toInt)
      } catch {
        case e: Exception => None
      }
    }

    // client module

    val someOrNone = toInt("1234");
    println(someOrNone.getOrElse(0))

  }

}