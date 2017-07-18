
// data-model

// 
//object MRFWheel {
//  def rotate = println("MRF wheel rotating")
//}
//
//object Car {
//  def move(wheel: MRFWheel.type) = {
//    wheel.rotate
//    println("Car Moving")
//  }
//}

//----------------------------------------------

trait Wheel {
  def rotate
}

trait RoadTransport {
  def safety
}

//----------------------------------------------

class MRFWheel extends Wheel with RoadTransport {
  def rotate = println("MRFwheel rotating")
  def safety = println("its safe")
}
//----------------------------------------------

class CEATWheel extends Wheel {
  def rotate = println("CEATWheel  rotating")
}

//----------------------------------------------

class Car {
  def move(wheel: Wheel) = {
    wheel.rotate
    println("Car Moving")
  }
}

/*
 * 
 *  problems with car module
 *  
 *  --> tight-coupling
 *  --> too many dependencies are created & destructed
 *  --> Unit Testing not possible
 *  
 *  reason for these issues?
 *  
 *  dependent itself creating its own dependency
 *  
 *  soln :
 *  
 *  dont create dependency in dependent class  ( IOC )
 * 
 * 
 */

//----------------------------------------------

object Test_6 {

  def main(args: Array[String]): Unit = {
    val car1 = new Car

    val mrfWheel = new MRFWheel
    car1.move(mrfWheel)

    val ceatWheel = new CEATWheel;
    car1.move(ceatWheel)

  }

}






