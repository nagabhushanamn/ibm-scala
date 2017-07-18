package emp

case class Address(city: String, state: String)

class Person(var name: String, var address: Address) {
  def sayName() = println("im " + name)
}

class Employee(name: String, var salary: Double, address: Address) extends Person(name, address) {
  def saySalary() = println("im get " + salary)
  def getBonus() = this.salary * 0.02
}

class Boss(name: String, salary: Double, address: Address) extends Employee(name, salary, address) {
  override def getBonus() = this.salary * 0.2 + super.getBonus()
}

object Ex71 {
  def main(args: Array[String]): Unit = {

    val emp = new Employee("Nag", 1000.00, Address("chn", "TN"));

    //    emp.sayName();
    //    emp.saySalary();

    //    println(emp.getBonus())

    val boss = new Boss("Boss", 1000.00, Address("blr", "KA"));
    println(boss.getBonus())

  }
}