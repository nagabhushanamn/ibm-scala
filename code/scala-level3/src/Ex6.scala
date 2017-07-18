

class FileUtil {
  lazy val menu = {
    println("menu evaluated...")
    //.............
    "idly,vada,biryani"
  }
}

object Ex6 {

  def main(args: Array[String]): Unit = {

    val util = new FileUtil

    println(util.menu)
    println(util.menu)
    println(util.menu)

  }

}