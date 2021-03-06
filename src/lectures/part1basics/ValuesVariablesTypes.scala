package lectures.part1basics

object ValuesVariablesTypes extends App {

  val x: Int = 42
  println(x)

  //VALS are IMMUTABLE

  // COMPILER can infer types

  val aString: String = "hello";
  val anotherString = "goodbye"

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aLong = 3455364345878897L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  //variables
  var aVariable: Int = 4

  aVariable = 5   //side effects

}
