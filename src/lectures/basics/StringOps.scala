
package lectures.basics

import java.util.Locale

object StringOps extends App {
  val str = "Hello darkness, my old friend. I've come to talk with you again."
  println(str.charAt(2))
  println(str.substring(6, 14))
  println(str.split(" ").mkString("---"))
  println(str.split(", ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase)
  println(str.toUpperCase)
  println(str.length)

  // Scala Utilites
  val aNumberString = "2"
  val aNumber = aNumberString.toInt
  println((aNumber + 5))

  println('a' +: aNumberString :+ 'z')
  println("a" + aNumberString + "z")
  println(str.reverse)
  println(str.take(5))

  val name = "Salih"
  val age = 30
  var greeting = s"Hello, my name is $name and I am $age years old"
  println(greeting)
  greeting += s". So i will be ${age + 1} next year."
  println(greeting)

  val speed = 1.5f
  val myth = f"$name%s can eat $speed%3.3f burgers per minute"
  println(myth)

  val x = 1.1f
  // val strNew = f"$x%3d" This gives compiler error because it expects a decimal number while we are giving a float.

  println("This is a \n newline")
  println(raw"This is a \n newline") // Useful for static json object variables
}
