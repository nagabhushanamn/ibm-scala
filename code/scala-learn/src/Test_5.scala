

object Test_5 {

  def main(args: Array[String]): Unit = {

    // mutable

    //    var name = "Nag";
    //    name = "Ria"

    // immutable

    //    val name = "Nag";
    //    name = "Ria";

    // methods

    //    def saySomething = { println("im method") }

    //--------------------------------------------------------

    //    val v = {
    //      val a = 12 + 12;
    //      a
    //    }
    //    println(v)

    //-----------------------------------------------------------

    // when var/val or evaluating

    var v1 = {
      println("var v1 evaluated....")
      100;
    }

    val v2 = {
      println("val v2 evaluated....")
      100;
    }

    lazy val v3 = {
      println("lazy val v3 evaluated....")
      200
    }

    println(v3)
    println(v3)

    def v4 = {
      println("def v4 evaluated....")
      100;
    }

    v4
    v4

  }

}