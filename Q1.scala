package LabSheet_07
import scala.io.StdIn

object Q1 {
  def main(args: Array[String]): Unit = {
    println("Enter numbers for inputList: ")
    val input = StdIn.readLine()
    val inputList = input.split(",").map(_.trim.toInt).toList

    val filteredList = filterEvenNumbers(inputList)
    println("Filtered List of Even Numbers: " + filteredList.mkString(","))
  }

  def filterEvenNumbers(numbers: List[Int]): List[Int] = {
    numbers.filter(num => num % 2 == 0)
  }
}