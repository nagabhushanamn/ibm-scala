
trait LT

case class Human(name: String) extends LT
case class Animal(name: String) extends LT
case object Robot extends LT

object Ex10 {

  def main(args: Array[String]): Unit = {

    def determineType(x: LT) = x match {

      case Human(name) => println(s" any Human with name")
      case _: Animal => println(s" any Animal ")
      case Robot => println("robot")
      case _ => ""

    }

  }

}