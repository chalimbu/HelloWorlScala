package monix.task
import monix.execution.Scheduler
import Scheduler.Implicits.global
import monix.eval.Task

object TaskExample extends App{
  val task= Task {1+1}
  //later, only executes when is called
  def func=task.runAsync {
    case Left(value) => 0
    case Right(value) => value
  }

}
