package monoids

object EitherExercise2 extends App{
  //the proyection means that either can either be right of left and we do no know
  val theRight: Either[Error,String]=
    Right("hello")
  val theLeft: Either[Error,String]=
    Left(new Error("I am a error!"))

  println(theRight.right.get)
  /*theRight match {
    case Left(value) => println(value)
    case Right(value) => println("and got "+value)
  }*/
  println(theLeft.left.get)

  //https://git.seven4n.com/juancadavid/scala_training_ejercicios/blob/feature/option/src/test/scala/co/com/scalatraining/monads/OptionSuite.scala
  //https://www.infoq.com/br/presentations/an-introduction-to-monadic-structures-and-functional-programming/ 18:06
  //https://www.freecodecamp.org/news/a-survival-guide-to-the-either-monad-in-scala-7293a680006/
}
