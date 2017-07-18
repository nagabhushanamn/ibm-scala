
//
//object Person1 {
//  var name = "Nag"
//  def sayName() {
//    println("im " + name)
//  }
//}
//
//object Person2 {
//  var name = "santhosh"
//  def sayName() {
//    println("im " + name)
//  }
//}

//-------------------------------------------------

class Person(var name: String, var age: Int) {
  //println("Person constructor-start");
  //  var name = ""
  //  var age = 0
  def sayName = println("im " + name)
  //println("Person constructor-end");
}

object TestApp {
  def main(args: Array[String]): Unit = {

    //    var p1 = new Person
    //    p1.name = "Nag"
    //
    //    var p2 = new Person
    //    p2.name = "Ria"
    //
    //    p1.sayName
    //    p2.sayName

    var p1 = new Person("Nag", 33)
    var p2 = new Person("Ria", 2)
    p1.sayName
    p2.sayName

  }
}
























