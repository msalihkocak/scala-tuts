package lectures.oop

object Objects extends App {

  object Person{
    val N_EYES = 2
    def canFly: Boolean = false

    def apply(mother:Person, father:Person): Person = new Person("Bobbie")
  }
  // SCALA object is a SINGLETON instance

  class Person(name:String) {
    //Instance level functionality
  }
  // Class and Object structures with the same name are COMPANIONS

  // SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY ("static")
  println(Person.N_EYES)
  println(Person.canFly)

  val mary = new Person("Mary")
  val john = new Person("John")
  println(mary == john)

  val person1 = Person
  val person2 = Person
  println(person1 == person2)

  val bobbie = Person(mary, john)
  // this method is a factory method
  // Companions can see their private methods
}
