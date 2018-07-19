val arr = Array(1,2,3,4,5)

// var total = (0 /: arr) { (sum, elem) => sum + elem }
var total = (0 /: arr) { _ + _ }

val negativeNumberExists1 = arr.exists { elem => elem < 0 }
val negativeNumberExists2 = arr.exists { _ < 0 }

// val largest = (Integer.MIN_VALUE /: arr) { Math.max(_, _) }
// val largest = (Integer.MIN_VALUE /: arr) { Math.max _ } // represents the entire parameter list
val largest = (Integer.MIN_VALUE /: arr) { Math.max } //
