import akka.actor._

object CreateActors extends App {
  val system = ActorSystem("sample")

  val depp = system.actorOf(Props[HollywoodActor])
  depp ! "Wonka"

  system.terminate()
}
