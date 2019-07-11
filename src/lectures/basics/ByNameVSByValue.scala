
package lectures.basics

object ByNameVSByValue extends App {

  def calledByValue(x:Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }

  // EVALUATE EVERY TIME YOU USE
  def calledByName(x: => Long): Unit = {
    println("by name: " + x)
    println("by name: " + x)
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

  printFirst(infinite(), 34) // This gives stack overflow error
  printFirst(34, infinite()) // This does not throw an error because it will be evaluated when it is used
  // since infinite function is not used anywhere it is not evaluated as an expression
}
