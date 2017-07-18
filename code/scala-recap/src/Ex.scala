
object a {
  def +(arg: Int) = {
    println("b method on obj")
    object ob {
      def -(arg: Int) = {
        println("d method on  ob")
      }
    }
    ob
  }
}

object Ex {

  def main(args: Array[String]): Unit = {

    val c = 12;
    val e = 14;

    //    a.+(c).-(e)
    a + c - e

  }

}




