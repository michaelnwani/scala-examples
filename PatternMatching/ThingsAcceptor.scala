abstract class Thing
case class Apple() extends Thing
// case class Orange()
// case class Book()

object ThingsAcceptor {
  def acceptStuff(thing: Thing) {
    thing match {
      // case Apple() => println("Thanks for the Apple")
      // case Orange() => println("Thanks for the Orange")
      // case Book() => println("Thansk for the Book")
      case _ => println(s"Excuse me, why did you send me $thing")
    }
  }
}

// ThingsAcceptor.acceptStuff(Apple())
// ThingsAcceptor.acceptStuff(Book())
ThingsAcceptor.acceptStuff(Apple)

