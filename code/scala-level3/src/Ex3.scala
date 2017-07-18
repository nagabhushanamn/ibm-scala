

class Pizza(var pSize: Int, var pType: String) {

  def this(pSize: Int) {
    this(pSize, "VEG")
  }
  def this(pType: String) {
    this(1, pType)
  }
  def this() {
    this(1);
  }

}

object Ex3 {

  def main(args: Array[String]): Unit = {

    val pizaa2 = new Pizza(1);
    val pizaa3 = new Pizza("NON-VEG");
    val pizaa4 = new Pizza(1, "VEG");
    val pizaa5 = new Pizza();

  }

}