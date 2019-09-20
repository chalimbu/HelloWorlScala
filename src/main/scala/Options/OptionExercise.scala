package Options

object OptionExercise extends App{
  val number: Option[Int] = Some(3)
  val noNumber: Option[Int] = None
  val result1 = number.fold(1)(_ * 3)
  val result2 = noNumber.fold(1)(_ * 3)

  println(result1)
  println(result2)
}
