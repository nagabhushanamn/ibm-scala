

object Ex7 {

  def main(args: Array[String]): Unit = {

    //    val i = 5
    //
    //    i match {
    //      case 1 | 3 | 5 | 7 | 9 => println("odd")
    //      case 2 | 4 | 6 | 8 | 10 => println("even")
    //    }
    //
    //    val g = "hello"
    //    g match {
    //      case "hello" | "ola" => println("greeting")
    //    }

    //-----------------------------------------------

    trait Command
    case object Start extends Command
    case object Go extends Command
    case object Stop extends Command
    case object Whoa extends Command

    def executeCommand(cmd: Command) = cmd match {
      case Start | Go => println("begin")
      case Stop | Whoa => println("end")
    }

    executeCommand(Start)
    executeCommand(Go)
    
    //----------------------------------------------------

  }

}