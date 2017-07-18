
case class Product(name: String, price: Double)

object Ex11 {

  def main(args: Array[String]): Unit = {

    //    val i = 10;
    //
    //    i match {
    //      case a if 0 to 9 contains a => println("0-9 range :" + a)
    //      case b if 10 to 10 contains b => println("0-9 range :" + b)
    //      case _ => println("Hmmm")
    //    }

    //----------------------------------------------------------------------

    def getProduct(p: Product) = p match {
      case Product(name, price) if price > 1000 => println("product > 1000")
      case Product(name, price) if name == "Laptop" && price < 1000 => println("laptop product")
      case _ => println(" No match ")
    }
    getProduct(new Product("Mobile", 100.00))

    //-----------------------------------------------------------------------

  }

}