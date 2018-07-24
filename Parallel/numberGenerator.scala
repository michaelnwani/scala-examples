def generate(starting: Int): Stream[Int] = {
  starting #:: generate(starting + 1)
}

println(generate(25))

// take() creates a finite stream from an infinite stream
println(generate(25).take(10).force) // force() forces the stream to generate values

println(generate(25).take(10).toList) // also forces the stream to generate values, then turns it into a strict collection

println(generate(25).takeWhile{ _ < 40 }.force)
