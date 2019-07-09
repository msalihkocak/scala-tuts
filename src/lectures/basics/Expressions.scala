package lectures.basics

object Expressions extends App {

  // Usage of if expression
  val aCondition = false
  val conditionedValue = if(aCondition) 5 else 3
  println(conditionedValue)

  // Unit type intro
  // Unit type can be compared with void in other languages

  var aValue = 2
  val weirdValue = (aValue = 4)
  val printlnValue = println(weirdValue)
  println(printlnValue)

  var index = 0
  val aWhile = while (index < 3){
    println(index)
    index += 1
  }

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }
  println(aCodeBlock)

  val someValue = {
    2 < 3
  }
  println(someValue)

  val someOtherValue = {
    if(someValue) 240 else 905
    42
  }
  println(someOtherValue)
}
