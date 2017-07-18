import java.util.Date

/**
 * @author training
 */

trait Visitor {
  // abstract methods
  def id: String
  def createdAt: Date
  // concrete methods and fields
  def age: Long = {
    new Date().getTime - createdAt.getTime
  }
}

class Anonymous(val id: String, val createdAt: Date) extends Visitor {

}

object Ex {

  def main(args: Array[String]): Unit = {

  }

}