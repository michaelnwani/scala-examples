class Dog(val name: String) extends Animal with Friend {
  // optionally override method here.
  override def listen() = println(s"$name's listening quietly")
}
