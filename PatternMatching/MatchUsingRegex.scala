// def process(input: String) {
//   val GoogStock = """^GOOG:(\d*\.\d+)""".r
//   input match {
//     case GoogStock(price) => println(s"Price of GOOG is $$$price")
//     case _ => println(s"not processing $input")
//   }
// }

def process(input: String) {
  val MatchStock = """^(.+):(\d*\.\d+)""".r
  input match {
    case MatchStock("GOOG", price) => println(s"We got GOOG at $$$price")
    case MatchStock("IBM", price) => println(s"IBM's trading at $$$price")
    case MatchStock(symbol, price) => println(s"Price of $symbol is $$$price")
    case _ => println(s"not processing $input")
  }
}

process("GOOG:310.84")
process("IBM:84.01")
process("GE:15.96")
