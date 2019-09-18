package monoids

object EitherExercise extends App{
  //left error, right success
//  val json: Either[Int,String]= if(8-4>2) 34 else "hola"
  val ok: Either[Error,String]=
      Right("that is right")

  val error: Either[Error,String] =
    Left(new Error("That's an error!"))

  def uncertaintComputation(x: Float): Either[Error,String]=
    if(x>0.5) Right("all good")
    else Left(new Error("something went wrong"))

  println(ok)
  println(error)
  println(uncertaintComputation(0.4f))
  println(uncertaintComputation(0.7f))
}
