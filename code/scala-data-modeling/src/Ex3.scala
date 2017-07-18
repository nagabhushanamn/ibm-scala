import scala.annotation.tailrec

object Ex3 {

  def main(args: Array[String]): Unit = {

    //    val list = 1 :: 2 :: Nil;
    //    println(list)

    trait IntList;
    case class Node(value: Int, next: IntList) extends IntList
    case class End() extends IntList;

    var list = Node(1, Node(2, Node(3, End()))) // recursive data

    @tailrec
    def sum(list: IntList, total: Int): Int = list match {
      case Node(value, next) => sum(next, value + total)
      case End() => total;
    }

    println(sum(list, 100))

  }

}