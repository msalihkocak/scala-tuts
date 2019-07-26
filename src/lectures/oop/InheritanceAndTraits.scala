package lectures.oop

object InheritanceAndTraits extends App {

  sealed class Animal{
    val creatureType = "wild"
    def eat = println("nomnom")
  }

  class Cat extends Animal{
    def crunch = {
      super.eat
      println("crunch crunch")
    }
  }

  val cat = new Cat
  cat.crunch

  // constructors
  class Person(name:String, age:Int) {
    def this(name: String) = this(name, 0)
  }

  class Adult(name: String, age: Int, idCard:String) extends Person(name) // also this works Person(name, age)

  //overriding
  class Dog(override val creatureType: String) extends Animal{
    //override val creatureType: String = "domestic"
    override def eat: Unit = println("crunch crunchy")
  }
  val dog = new Dog("K9")
  dog.eat
  println(dog.creatureType)

  //type substitution (polymorphism)
  val unkownAnimal: Animal = new Dog("Golden")
  unkownAnimal.eat

  // preventing overrides
  // 1- use keyword final on method or field
  // 2- use final on the class itself
  // 3- seal the class = extend classes in this file, prevent extension in other files (shown in Animal class)
}
