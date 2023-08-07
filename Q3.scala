package LabSheet_07
import scala.io.StdIn

object Q3 {
   def main(args: Array[String]): Unit = {
      println("Enter numbers for inputList : ")
      val input = StdIn.readLine()
      val inputList = input.split(",").map(_.trim.toInt).toList

      val primeList = filterPrime(inputList)
      println("Prime Numbers : " + primeList.mkString(", "))
   }

   def filterPrime(numbers: List[Int]): List[Int] = {
      def isPrime(n: Int): Boolean = {
        if (n <= 1)
          false
        else if (n == 2)
          true
        else
          !(2 to (n - 1)).exists(x => n % x == 0)
      }
      numbers.filter(isPrime)
   }
}
