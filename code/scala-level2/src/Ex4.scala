

object Ex4 {
  def main(args: Array[String]): Unit = {

    val fruits = Array("Apple", "Banana", "Orange");

    //    for (e <- fruits) println(e)

    //    val newFruits = for (e <- fruits) yield e.toUpperCase
    //    val newFruits = fruits.map(e => e.toUpperCase())
    //    val newFruits = fruits.map(_.toUpperCase)
    val newFruits = fruits.map(_ toUpperCase)

  }
}