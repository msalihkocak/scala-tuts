
package lectures.basics

object Recursion extends App {

  def factorial(n:Int): Int =
   if(n <= 1) 1
   else{
     println("Computing factorial of n " + n + " but i need to calculate the factorial of " + (n-1) + " first")
     val result = n * factorial(n-1)
     println("Computed factorial of " + n + " which is " + result)
     result
   }
  //println(factorial(10000))

  // TAIL RECURSIVE = Use recursive call as the last expression
  // When you need loops use tail recursion
  def factorialAsYouGo(n:Int): BigInt = {
    def innerFactorial(h: Int, accumulator: BigInt): BigInt =
      if (h <= 1) accumulator
      else innerFactorial(h - 1, h * accumulator)
    innerFactorial(n, 1)
  }
  //println(factorialAsYouGo(10000))

  def concatenate(string:String, times:Int): String = {
    def helper(stringInner:String, timesInner:Int, accumulator:String): String =
      if (timesInner <= 0) accumulator.dropRight(1)
      else helper(stringInner, timesInner - 1, accumulator + stringInner)
    helper(string, times, "")
  }
  println(concatenate("henlo ", 7))

  def fibonacci(n:Int): BigInt = {
    def helper(h: Int, accumulator: Array[Int]): BigInt =
      if(n <= 2) 1
      else if(h >= n) accumulator(h - 1)
      else {
        accumulator(h) = accumulator(h - 1) + accumulator(h - 2)
        helper(h + 1, accumulator)
      }
    helper(2, Array.fill(n)(1))
  }
  println(fibonacci(10))

  // Solution without array
  def fibbonacci(n:Int): BigInt = {
    def fibInner(i: Int, last: Int, oneLastBefore:Int): BigInt =
      if(i >= n) last
      else fibInner(i+1, last + oneLastBefore, last)

    if(n<=2) 1
    else fibInner(2, 1, 1)
  }
  println(fibbonacci(10))
}
