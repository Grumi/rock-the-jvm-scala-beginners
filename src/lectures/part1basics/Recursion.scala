package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int): Int =
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " I first need factorial of " + (n - 1))
      val result = n * factorial(n - 1)
      println("Computed factorial of " + n)

      result
    }


  println(factorial(10))
  //println(factorial(5000))

  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factorialHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factorialHelper(x - 1, x * accumulator) //TAIL RECURSION = use recursive call as the LAST expression

    factorialHelper(n, 1)

  }

  /*
  anotherFactorial(10) = factorialHelper(10, 1)
    = factorialHelper(9, 10 * 1 )
    = factorialHelper(8, 9 * 10 * 1)
    = factorialHelper(7, 8 * 9 * 10 *1)
    = ..
    = factHelper(2, 3 * 4 * .....* 10 * 1 )
    = factorialHelper(1, 1 * 2 * 2* ....* 10 * 1)
    = 1 * 2 *3 * 3 * ....10
 */

  // println(anotherFactorial(50000))

  /*
  1. Concatenate a string n times
  2. isPrime function  tail recursive
  3. Fibonacci function, tail recursive
   */
  @tailrec
  def concatenateTailRec(aString: String, n: Int, accumulator: String): String =
    if (n <= 0) accumulator
    else concatenateTailRec(aString, n - 1, aString + accumulator)

  println(concatenateTailRec("hello", 3, ""))


  def isPrime(n: Int): Boolean = {
    def isPrimeTailRec(t: Int, accumulator: Boolean): Boolean =
      if (!accumulator) false
      else if ( t <= 1) true
      else isPrimeTailRec(t - 1, n % t != 0 && accumulator)

    isPrimeTailRec(n / 2,true)
  }

  println(isPrime(2003))
  println(isPrime(2000))

  def fibonacci(n: Int) : Int = {
    def fiboTailRec(i: Int, last: Int, nextLast: Int): Int =
      if( i >= n) last
      else fiboTailRec(i + 1, last + nextLast, last)
    if( n <=2 ) 1
    else fiboTailRec(2, 1, 1)
  }

  println(fibonacci(8))


}
