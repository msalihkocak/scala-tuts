
package lectures.basics

object DefaultArgs extends App {
  def tailFactorial(n:Int, accumulator:BigInt = 1): BigInt = {
    if(n <= 1) accumulator
    else tailFactorial(n - 1, n * accumulator)
  }
  println(tailFactorial(6))

  def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080) = println("Saving...")

  savePicture()
  savePicture(800, "", 600) // This does not work
  savePicture(format = "bmp", height = 600, width = 800) // This works, you can use parameter names
                                                         // and order does not matter
}
