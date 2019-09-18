package monoids

object MonadExercise extends App{
  val maybeString: Option[String]=Some(null)
  val mayLen= maybeString.map(_.length).getOrElse(-1)
  println(mayLen)
}
