import scala.io.Source._
import scala.util.control.TailCalls._

// later evaluation/lazy evaluation is being done here to avoid stackoverflow problem

def explore(count: Int, words: List[String]) : TailRec[Int] =
  if (words.size == 0)
    done(count) // use 'done()' to terminate the recursion
  else
    tailcall(countPalindrome(count, words)) // use 'tailcall()' to continue the recursion

def countPalindrome(count: Int, words: List[String]): TailRec[Int] = {
  val firstWord = words.head

  if (firstWord.reverse == firstWord)
    tailcall(explore(count + 1, words.tail))
  else
    tailcall(explore(count, words.tail))
}

def callExplore(text: String) =
  println(explore(0, text.split(" ").toList).result) // 'result()' decides whether or not to terminate or continue execution of the program

callExplore("dad mom and racecar")

try {
  val text =
    fromURL("https://en.wikipedia.org/wiki/Gettysburg_Address").mkString
  callExplore(text)
} catch {
  case ex: Throwable => println(ex)
}
