

object Ex2 {
  def main(args: Array[String]): Unit = {

    // monads

    // for (i <- 1 to 2; j <- 1 to 2) println(s"i=$i,j=$j")

    //    for {
    //      i <- 1 to 3;
    //      j <- 1 to 5;
    //      k <- 1 to 10
    //    } println(s"i=$i,j=$j,k=$k")

    val arr = Array.ofDim[Int](2, 2);
    arr(0)(0) = 0;
    arr(0)(1) = 1;
    arr(1)(0) = 2;
    arr(1)(1) = 3;

    for {
      i <- 0 to 1;
      j <- 0 to 1
    } println(s"${arr(i)(j)}")

  }
}