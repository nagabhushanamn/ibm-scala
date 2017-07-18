
// object as function with 'apply' method

class Adder(var amount: Int) {
  //def add(in: Int) = in + amount;
  def apply(in: Int) = in + amount;
}

object Util{
  def apply(){
    println("util.apply()")
  }
}

object Hotel{
  def apply(){
    println("No Food")
  }
  def apply(pay:Int){
    println("Biryani")
  }
  def apply(pay:Int,tip:Int){
    println("Biryani + Coke")
  }
}


object Test_2 {

  def main(args: Array[String]): Unit = {

    var adder1 = new Adder(100);
    //println(adder1.add(10))

    println(adder1(20));

    Util.apply()
    Util();
    
    
    Hotel();
    Hotel(120);
    Hotel(120,50);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  }

}