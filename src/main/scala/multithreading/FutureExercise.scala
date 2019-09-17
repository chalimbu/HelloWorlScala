package multithreading
import java.util.Scanner

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object FutureExercise extends App{
  val sc =new Scanner(System.in)
  println("this is past")
  val f=Future{
    println("printin in the future")
  } //if the programs ends without the future
  //finishing the future will no run
  //println("the end")
  println("this past")
  sc.nextLine()
}
