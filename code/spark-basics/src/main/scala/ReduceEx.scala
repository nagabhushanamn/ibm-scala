

object ReduceEx {

  def main(args: Array[String]): Unit = {

    val ints = List(1, 2, 3, 4)

    val sum = ints.reduceRight((acc, item) => {
      println(s"acc=$acc")
      println(s"item=$item")
      acc+item + 10
    })
    println(sum)

  }

}