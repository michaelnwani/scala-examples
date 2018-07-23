class Sample {
  def unary_+() = println("called unary +")
  def unary_-() = println("Called unary -")
  def unary_!() = println("called unary !")
  def unary_~() = println("called unary ~")
}

val sample = new Sample
+sample
-sample
!sample
~sample
