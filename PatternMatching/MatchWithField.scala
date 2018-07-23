class Sample {
  val MAX = 100

  def process(input: Int) {
    input match {
      case MAX => println(s"You matched max $MAX")
    }
  }
}

val sample = new Sample
try {
  sample.process(0)
} catch {
  case ex: Throwable => println(ex)
}
sample.process(100)
