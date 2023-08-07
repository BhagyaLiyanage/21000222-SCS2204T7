package LabSheet_07
import scala.io.StdIn

object Q2 {
  def main(args: Array[String]): Unit = {
    println("Enter numbers for inputList : ")
    val input = StdIn.readLine()
    val inputList = input.split(",").map(_.trim.toInt).toList

    val squaredList = calculateSquare(inputList)
    println("Squared List : " + squaredList.mkString(","))
  }

  def calculateSquare(numbers: List[Int]): List[Int] = {
    numbers.map(num => num * num)
  }
}