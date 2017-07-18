
class Java {

}
class Scala {

}

class Trainer[T](var sub: T) {

}

object Ex2 {

  def main(args: Array[String]): Unit = {

    val scalaTrainer = new Trainer[Scala](new Scala);
    scalaTrainer.sub = new Scala

    val list = List[Int](1, 2)

  }

}