package lectures.oop

import scala.language.postfixOps

object MethodNotations extends App {
  class Person(val name:String, favoriteMovie: String){
    def likes(movie:String): Boolean = movie == favoriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String = s"$name, what the heck?!"
    def isAlive: Boolean = true
    def apply(): String = s"Hi my name is $name and I like $favoriteMovie"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // equivalent with the line above
  // infix notation = operator notation (syntactic sugar)

  // operators in Scala
  val john = new Person("John", "Inglorious Basterds")
  println(mary + john)

  // All operators are methods in scala
  println(2 + 3)
  println(2.+(3))

  // prefix notation
  // unary operators are again methods with the unary_ prefix
  val x = -1
  val y = 1.unary_-
  // They are both equal

  // unary operators only works with - + ~ !
  println(!mary)
  // This again is a syntactic sugar

  //postfix notation
  println(mary.isAlive)
  println(mary isAlive)
  // This again is a syntactic sugar

  // apply
  println(mary.apply())
  println(mary()) // equivalent
}
