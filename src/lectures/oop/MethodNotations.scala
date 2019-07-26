package lectures.oop

import scala.language.postfixOps

object MethodNotations extends App {
  class Person(val name:String, favoriteMovie: String, val age:Int = 25){
    def likes(movie:String): Boolean = movie == favoriteMovie
    def +(person: Person): String = s"$name is hanging out with ${person.name}"
    def +(string: String): Person = new Person(s"$name ($string)", favoriteMovie)
    def unary_+ = new Person(name, favoriteMovie, age + 1)
    def unary_! : String = s"$name, what the heck?!"
    def learns(string: String) = s"$name learns $string"
    def learnsScala = this learns "Scala"
    def isAlive: Boolean = true
    def apply(): String = s"Hi my name is $name and I like $favoriteMovie"
    def apply(int: Int) = s"$name watched $favoriteMovie $int times"
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

  println((mary + "the Rockstar")())

  val threeYearsOlderMary = +(+(+mary))
  println("Three years passed and mary is " + threeYearsOlderMary.age + " years old")

  println(mary.learns("Kafka"))
  println(mary learns "Kafka")
  println(mary learnsScala)

  println(mary(2))
}
