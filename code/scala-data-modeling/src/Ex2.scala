
//  //  Polymorphic methods

//trait Subject {
//  def name: String
//}
//case class Java(name: String) extends Subject
//case class Scala(name: String) extends Subject

//// 
//class Trainer(name: String) {

//  def doTeach(sub: Subject) = {
//    println("teaching " + sub.name)
//  }
//}

//-------------------------------------------------------

// Pattern Matching

case class Java(name: String) extends Subject
case class Scala(name: String) extends Subject

trait Subject {
  def name: String
  def getSubject(sub: String) = sub match {
    case "java" => Java("java-Spring")
    case "scala" => Java("Scala")
  }
}

class Trainer(name: String) {

  def doTeach(sub: Subject) = {
    val s = sub.getSubject("java");
    println(s.name)
  }
}

object Ex2 {

  def main(args: Array[String]): Unit = {
    val tnr1 = new Trainer("Nag");
    tnr1.doTeach(Java("java-Spring"))
  }

}