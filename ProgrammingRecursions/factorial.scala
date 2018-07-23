// NOT tail recursive, compiler will error:
// @scala.annotation.tailrec
// def factorial(number: Int) : BigInt = {
//   if (number == 0)
//     1
//   else
//     number * factorial(number - 1)
// }

// println(factorial(10000))

@scala.annotation.tailrec
def factorial(fact: BigInt, number: Int) : BigInt = {
  if (number == 0)
    fact
  else
    factorial(fact * number, number - 1)
}

println(factorial(1, 10000))
