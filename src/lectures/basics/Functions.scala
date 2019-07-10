
package lectures.basics

object Functions extends App{

  def aFunction(a:String, b: Int)=
    a + " " + b
  println(aFunction("Hey", 2))

  def aParameterlessFunction() : Int = 44
  println(aParameterlessFunction)

  // Get rid of imperative programming way of defining loops
  // Use recursive functions for looping mechanism
  def aRecursiveFunction(aString:String, n: Int) : String = {
    if(n == 1) aString.dropRight(1)
    else aString + aRecursiveFunction(aString, n-1)
  }
  println(aRecursiveFunction("Testing.. ", 5))

  def aFunctionWithSideEffects(aString: String): Unit = println("Printing inside side effect " + aString)
  aFunctionWithSideEffects("for side effect")

  def factorial(n:Int): Int = {
    def multiply(a:Int, b:Int): Int = a * b
    if (n < 1) 1 else multiply(n, factorial(n-1))
  }

  def factorialWithoutInnerFunction(n:Int): Int = {
    if (n < 1) 1 else n * factorialWithoutInnerFunction(n-1)
  }

  println(factorial(6))
  println(factorialWithoutInnerFunction(6))

  def greetingPhrase(name: String, age: Int): String = "Hi, my name is " + name + " and I am " + age + " years old"
  println(greetingPhrase("Salih", 30))

  def fibonacci(n:Int) : Int = if (n <= 2) 1 else fibonacci(n - 1) + fibonacci(n - 2)
  println(fibonacci(12))

  def isPrime(mayBePrime:Int): Boolean = {
    val primesUpToHundred = Array(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97)
    val root = Math.sqrt(mayBePrime).toInt
    def isDivisibleToPrimesStartingFrom(index: Int): Boolean = {
      if (index >= primesUpToHundred.size || primesUpToHundred(index) > root) false
      else if(mayBePrime % primesUpToHundred(index) == 0) true
      else isDivisibleToPrimesStartingFrom(index + 1)
    }
    !isDivisibleToPrimesStartingFrom(0)
  }
  println(isPrime(9973))

  def isPrimeInefficient(n:Int): Boolean = {
    def isPrimeUntil(t:Int): Boolean = {
      if(t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)
    }
    isPrimeUntil(n / 2)
  }
  isPrimeInefficient(9973)
}
