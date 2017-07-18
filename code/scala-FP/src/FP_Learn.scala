

object GreetLib {
  def greet(f: () => Unit) = f()
}

object FP_Learn {

  def main(args: Array[String]): Unit = {

    // ---------------------------------------------------------

    val x = List.range(1, 10)

    // ---------------------------------------------------------
    // Anonymous functions
    // ---------------------------------------------------------

    val evens1 = x.filter { x => x % 2 == 0 }
    val evens2 = x.filter((i: Int) => i % 2 == 0)
    val evens3 = x.filter(_ % 2 == 0)

    //---------------------------------------------------------

    //    x.foreach { x => println(x) }
    //    x.foreach((i: Int) => println(i))
    //    x.foreach((i) => println(i))
    //    x.foreach(i => println(i))
    //    x.foreach(println(_))
    //    x.foreach(println)

    //---------------------------------------------------------

    //    GreetLib.greet { () => println("Hello..") }
    //    GreetLib.greet { () => println("Ola..") }
    //    GreetLib.greet(() => println("Hey..."));

    //---------------------------------------------------------

    // ---------------------------------------------------------
    // How to use functions as variables (values) 
    // ---------------------------------------------------------

    val double = (i: Int) => { i * 2 }: Int

    //-------------------------------------------------------
    val isEven = (i: Int) => { i % 2 == 0 }: Boolean
    val f1: (Int) => Boolean = i => { i % 2 == 0 }
    val f2: Int => Boolean = i => { i % 2 == 0 }
    val f3: Int => Boolean = i => i % 2 == 0
    val f4: Int => Boolean = _ % 2 == 0

    //-------------------------------------------------------

    // implicit approach
    val f5 = (x: Int, y: Int) => { x + y }
    val f6 = (x: Int, y: Int) => x + y

    // explicit approach
    val f7: (Int, Int) => Int = (x, y) => { x + y }
    val f8: (Int, Int) => Int = (x, y) => x + y

    //-------------------------------------------------------

    val addThenDouble: (Int, Int) => Int = (x, y) => {
      val a = x + y
      2 * a
    }

    //-------------------------------------------------------------
    //    Using a method like an anonymous function
    //-------------------------------------------------------------

    def modMethod1(i: Int) = i % 2 == 0
    def modMethod2(i: Int) = { i % 2 == 0 }
    def modMethod3(i: Int): Boolean = i % 2 == 0
    def modMethod4(i: Int): Boolean = { i % 2 == 0 }

    val list = List.range(1, 10)
    val newList = list.filter(modMethod1)

    //---------------------------------------------------------------

    val modFunction = (i: Int) => i % 2 == 0
    list.filter(modFunction)

    //---------------------------------------------------------------

    //----------------------------------------------------------------
    //    Assigning an existing function/method to a function variable
    //-----------------------------------------------------------------

    val c1 = scala.math.cos _
    val c2 = scala.math.cos(_)

    //--------------------------------------------------------------

    val p = scala.math.pow(_, _)

    //--------------------------------------------------------------

    def myMethod(x: Int, y: Int) {
      println(s"$x,$y")
    }

    val partial = myMethod(_, _)

    //---------------------------------------------------------------
    //    How to define a Scala method that accepts a function parameter
    //--------------------------------------------------------------

    def executeFunction(callback: () => Unit) {
      callback()
    }

    val sayHello = () => { println("Hello") }

    executeFunction(sayHello)

    //--------------------------------------------------------------
    // How to define Scala methods that take complex functions as parameters
    //--------------------------------------------------------------

    def exec(callback: Int => Unit) {
      // invoke the function we were given, giving it an Int parameter
      callback(1)
    }

    val plusOne = (i: Int) => { println(i + 1) }

    exec(plusOne)

    //--------------------------------------------------------------

    def executeFunction1(f: (Int, Int) => Boolean) {
      f(12, 12);
    }

    val areEqual = (a: Int, b: Int) => a == b;
    //executeFunction1(areEqual)

    //--------------------------------------------------------------

    // Passing in a function with other parameters

    val sayHello1 = () => println("Hello")
    def executeXTimes(callback: () => Unit, numTimes: Int) {
      for (i <- 1 to numTimes) callback()
    }

    //executeXTimes(sayHello1, 5);

    //--------------------------------------------------------------

    def executeAndPrint(f: (Int, Int) => Int, x: Int, y: Int) {
      val result = f(x, y)
      println(result)
    }

    val sum = (x: Int, y: Int) => x + y
    val multiply = (x: Int, y: Int) => x * y

    //    executeAndPrint(sum, 2, 9) // prints 11
    //    executeAndPrint(multiply, 3, 9) // prints 27

    //--------------------------------------------------------------
    // closures
    //--------------------------------------------------------------

    def doWork(f: () => Unit) {
      f();
      println("and working...")
    }

    def teach() {
      var notes = "scala-Notes";
      val learnFunc = () => {
        println("learning with" + notes)
      }
      doWork(learnFunc)
      notes = " spark-Notes";
      doWork { learnFunc }
    }

    //teach();

    //--------------------------------------------------------------
    //    How to use partially applied functions in Scala
    //--------------------------------------------------------------

    val add = (a: Int, b: Int, c: Int) => a + b + c
    val partialAdd = add(1, 2, _: Int)
    println(partialAdd(3))

    // 

    def wrap(prefix: String, html: String, suffix: String) = {
      prefix + html + suffix
    }

    val wrapWithDiv = wrap("<div>", _: String, "</div>")

    //--------------------------------------------------------------
    //    How to create a method that returns a function in Scala
    //--------------------------------------------------------------

    def saySomething(prefix: String) = (s: String) => {
      prefix + " " + s
    }

    val sayHello2 = saySomething("Hello")

    //--------------------------------------------------------------

    def greeting(language: String) = (name: String) => {
      language match {
        case "english" => "Hello, " + name
        case "spanish" => "Buenos dias, " + name
      }
    }

    val hello = greeting("english")
    hello("Nag")

    //-------------------------------------------------------------
    //    How to create and use partial functions in Scala
    //-------------------------------------------------------------

    //val divide = (x: Int) => 42 / x

    //     divide(0)

    val divide = new PartialFunction[Int, Int] {
      def apply(x: Int) = 42 / x
      def isDefinedAt(x: Int) = x != 0
    }

    //    divide.isDefinedAt(1)

    if (divide.isDefinedAt(1)) divide(1)

    //--------------------------------------------------------------

    val divide2: PartialFunction[Int, Int] = {
      case d: Int if d != 0 => 42 / d
    }

  }
}