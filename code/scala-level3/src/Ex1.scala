

class Person(var firstName: String, var lastName: String) {

  var age = 0;
  private val HOME = System.getProperty("user.home");

  def printHome = println(HOME);
  def printFullName = println(s"$firstName - $lastName")

  printHome
  printFullName

}

object Ex1 {
  def main(args: Array[String]): Unit = {

    val p = new Person("Nag", "N");
    p.firstName = "Santhosh";
    p.lastName = "IBM";
    p.age = 30;

  }
}