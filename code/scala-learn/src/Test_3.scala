

class Employee(var name: String) {
  def doListen() = println(name + " listening from ")
}

// companion object  ==> to hold shared var & methods of companion class's objects
object Employee {
  var tnrName: String = "Nag"
  def doTeach() = println(tnrName + "teaching...")
}

object Test_3 {
  def main(args: Array[String]): Unit = {

    Employee.doTeach()

    var e1 = new Employee("E1")
    var e2 = new Employee("E2")

    e1.doListen();
    e2.doListen();

  }
}