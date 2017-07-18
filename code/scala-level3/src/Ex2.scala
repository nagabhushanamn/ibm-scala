

class Employee(private var name: String) {
  def changeName(newName: String) {
    name = newName;
  }
  def sayName() {
    println("im " + name)
  }
}

object Ex2 {

  def main(args: Array[String]): Unit = {

    val e = new Employee("santhosh");

    //    e.name = "new-santhosh"; // set
    //    println(e.name) // get

    e.changeName("New Santh")
    e.sayName()

  }

}