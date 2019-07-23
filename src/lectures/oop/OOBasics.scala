package lectures.oop

object OOBasics extends App {
//  val person = new Person("Salih", 27)
//  println(person.age)
//  println(person.name)
//  println(person.x)
//
//  person.greet("Mehmet")
//  person.greet()
//
//  val personWithoutAge = new Person("Ahmet")
//  println(personWithoutAge.age)

  val writer = new Writer("William", "Shakespeare", 1564)
  println(writer.fullName)

  val novel = new Novel("Macbeth", 1606, writer)
  println(writer.fullName + " has written " + novel.name + " first time at the age of " + novel.authorAge())

  val novelSecondEdition = novel.copy(1610)
  println("Then second edition has came out when he is " + novelSecondEdition.authorAge())

  val charles = new Writer("Charles", "Dickens", 1812)
  println(novel.name + " is written by " + charles.fullName + ": " + novel.isWrittenBy(charles))

  val counter = new Counter(5)
  println("Current: " + counter.value + ", Incremented: " + counter.increment.value + ", Decremented by 2: " + counter.decrement(2).value)

  counter.increment(3).decrement.decrement.print
  counter.increment.decrement.increment.decrement.print
  counter.increment(5).decrement(5).increment.print
}

// constructor
class Person(var name: String, val age:Int){
  // body defines the implementation of the class
  var x = 2
  x = 5
  println(x + 8)
  // at the every instantiation of this classes object
  // lines above will be executed

  // method
  // overloading
  def greet(name:String): Unit = println(s"${this.name} says: Hi, $name")
  def greet(): Unit = println(s"Hi i am $name")

  // multiple constructors
  def this(name:String) = this(name, 0)
}

// class parameters are not fields, if you put val or var it becomes a field

/*
TO DO:
  Novel and a Writer Class
  Writer should have first name, surname, year date of birth
  - method fullname concatenates first and last name

  Novel: name, yearOfRelease, author:Writer
  - authorAge gives the age of author at the year of release
  - isWrittenBy(author)
  - copy( new year of release) = new instance of Novel with the new year of release

  Counter class
  - receives an int value
  - method current count
  - method to increment/decrement => new Counter
  - overload /inc/dec to receive an amount and result will be a new Counter
*/

class Writer(firstName:String, surname: String, val birthYear:Int){
  def fullName = s"$firstName $surname"
}

class Novel(val name:String, val yearOfRelease: Int, val author:Writer){
  def authorAge() = yearOfRelease - author.birthYear
  def isWrittenBy(anotherWriter:Writer) = author == anotherWriter
  def copy(newReleaseYear:Int) = new Novel(name, newReleaseYear, author)
}

class Counter(val value: Int){
  def increment = new Counter(value + 1)
  def decrement = new Counter(value - 1)

  def increment(amount: Int): Counter = {
    if (amount <= 0) this
    else increment.increment(amount-1)
  }
  def decrement(amount: Int): Counter = {
    if (amount <= 0) this
    else decrement.decrement(amount-1)
  }
  def print = println(value)
}