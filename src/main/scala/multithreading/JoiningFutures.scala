package multithreading
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure,Success}
import scala.util.Random

object JoiningFutures extends App{
  println("starting futures")
  def cloudFuture(n: Int):Future[Int]=Future{
    Thread.sleep(15)
    n*3
  }
  val result1=cloudFuture(10)
  val result2=cloudFuture(20)
  val result3=cloudFuture(30)

  println("before for-comprehesion")
  val result=for{
    r1<-result1
    r2<-result2
    r3<-result3
  } yield(r1+r2+r3)

  result.onComplete{
    case Success(resul)=>println(s"result: ${resul}")
    case Failure(e) => 3
  }
  Thread.sleep(100)
}
