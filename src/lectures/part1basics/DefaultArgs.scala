package lectures.part1basics

object DefaultArgs extends App{

  def trFactorial(n: Int, acc: Int = 1): Int =
    if(n <=1) acc
    else trFactorial(n-1, n * acc)

  val fact1 = trFactorial(10)

  def savePicture(format: String = "jpeg", width: Int  = 1920, height: Int = 1080): Unit = println("saving picture")
  savePicture( width = 800)

  /*
  1. pas in every leading argument
  2. name the arguments
   */

  savePicture(height = 100, width = 80, format = "bmap")
}
