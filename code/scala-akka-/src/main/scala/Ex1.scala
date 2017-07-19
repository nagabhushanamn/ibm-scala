import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props

// (1) constructor changed to take a parameter
class HelloActor(myName: String) extends Actor {
  def receive = {
    // (2) println statements changed to show the name
    case "hello" => println(s"hello from $myName")
    case _ => println(s"'huh?', said $myName")
  }
}

object TestApp extends App {

  // an actor needs an ActorSystem
  val system = ActorSystem("HelloSystem")

  // create and start the actor
  val helloActor = system.actorOf(Props(new HelloActor(myName = "Nag")), name = "helloactor")

  // send the actor two messages
  helloActor ! "hello"
  helloActor ! "buenos dias"

  // shut down the system

}
