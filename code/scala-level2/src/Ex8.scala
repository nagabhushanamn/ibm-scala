

object Ex8 {
  
  def main(args: Array[String]): Unit = {
    
    val i=10;
    
    i match {
      case 0 => println("0")
      case 1 => println("1")
      case bla => println("u gave "+ bla)
    }
    
  }
  
}