

object Ex3 {

  def main(args: Array[String]): Unit = {

    for {
      i <- 1 to 10;
      if i > 3
      if i < 6
      if i % 2 == 0
    } println(i)

  }

}