

case class Person(var name: String, var age: Int)

object Ex9 {

  def main(args: Array[String]): Unit = {

    def echoWhatYouGaveMe(x: Any): String = x match {

      // constants patterns
      case 0 => "Zero"
      case true => "true"
      case "hello" => "hello"
      case Nil => "an empty List"

      // sequence patterns
      case List(0, _, _) => " a e eleemnt list with 0 , next 2 elements r any"
      case List(1, _*) => " a e eleemnt list with 1, ......"
      case Vector(1, _*) => " a e eleemnt list with 1, ......"

      // tuples

      case (a, b) => s" got $a and $b"
      case (a, b, c) => s" got $a and $b , $c"

      // constructor patterns
      //      case Person(name, 30) => s" matched  person with name = $name"
      //      case Person(name, 17) => s" matched  kid with name = $name"

      // type patterns
      case p: Person => " any person"

      case _ => " Unkown"

    }

    println(echoWhatYouGaveMe(new Person("Santhosh", 30)))
    println(echoWhatYouGaveMe(new Person("Kid", 17)))

  }

}