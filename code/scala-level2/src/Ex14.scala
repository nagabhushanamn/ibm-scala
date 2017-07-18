

object Ex14 {

  def main(args: Array[String]): Unit = {

    //    var i = 0;
    //    while (i < 5) {
    //      println(i)
    //      i += 1;
    //    }

    def *(testCondition: => Boolean)(codeBlock: => Unit) {
      while (testCondition) {
        codeBlock
      }
    }

    var i = 0;
    *(i < 5) {
      println(i)
      i += 1;
    }

  }

}