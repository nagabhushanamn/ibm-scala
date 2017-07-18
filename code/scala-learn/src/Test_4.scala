
case class NewPerson(name: String, age: Int) {}

object Test_4 {

  def main(args: Array[String]): Unit = {

    var p1 = new NewPerson("Nag", 33);
    var p2 = new NewPerson("Nag", 33);

    println(p1 == p2)

    var p11 = p1.copy();

  }

}