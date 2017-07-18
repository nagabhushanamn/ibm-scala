

class Product(var id: Int, var name: String = "Unknown", var pType: String = "ELEC")

class Socket(val timeout: Int = 1000)

object Ex5 {

  def main(args: Array[String]): Unit = {

    var p = new Product(123, "Laptop", "OTHER");
    var p2 = new Product(4343, pType = "OTHER");

    val socket = new Socket(5000);

  }

}