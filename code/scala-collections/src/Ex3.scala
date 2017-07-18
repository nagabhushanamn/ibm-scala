import scala.collection.mutable.ArrayBuffer

object Ex3 {
  def main(args: Array[String]): Unit = {

    var emps = ArrayBuffer("Nag");
    var ibmEmps = emps;

    ibmEmps += ("Santhosh")
    println(emps == ibmEmps)
    println(emps)
    println(ibmEmps)

  }
}