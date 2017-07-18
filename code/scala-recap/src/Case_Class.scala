

class C {
  object O {
    def m() = println("O")
  }
  object OO {

  }
  O.m()
}

case class Person(var name: String, var age: Int) {
}
//
//object Person {
//  // factory methods
//  def apply(name: String): Person = {
//    val p = new Person(name, 0);
//    p
//  }
//}

object Ex1 {
  def main(args: Array[String]): Unit = {

    //val p1 = new Person("Santhosh", 29);
    //    val p2 = new Person("Santhosh",18);
    //    println(p1 == p2)
    //var p11 = p1.copy();
    //println(p1.name)

    //val p1 = Person("Nag");
    //    p1 = Person("Santhosh");
    //p1.name = "Santhosh";

    val p1 = new Person("Nag", 0); // constrictor
    val p2 = Person("Santhosh", 1); // Companion.apply()

    
    
  }
}