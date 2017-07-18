

object Ex1 {

  def main(args: Array[String]): Unit = {

    //    val arr = Array("Apple", "Banana", "Orange");

    //------------------------------------------------

    //    for (e <- arr) println(e)

    //------------------------------------------------

    //    for (e <- arr) {
    //      val s = e.toUpperCase
    //      println(s)
    //    }

    //------------------------------------------------

    //    var newArr = for (e <- arr) yield e.toUpperCase()
    //    for (e <- newArr) println(e)
    //

    //------------------------------------------------

    //    var newArr = for (e <- arr) yield {
    //      val s = e.toUpperCase()
    //      s
    //    }
    //    for (e <- newArr) println(e)

    //------------------------------------------------

    //    for (i <- 0 until arr.length) {
    //      println(s"$i is ${arr(i)}")
    //    }

    //------------------------------------------------

    //    for((e,index)<-arr.zipWithIndex){
    //      println(s"$index is $e")
    //    }

    //-------------------------------------------------

    // for-loop generators and guards
    //
    //    val newRange=for (i <- 1 to 10 if i < 5) yield i
    //    for (e <- newRange) println(e)
    //    

    //    ----------------------------------------------------

    val arr = Array("Apple", "Banana", "Orange");
    arr.foreach(e => { val s = e.toUpperCase; println(s) });
    
    

  }

}