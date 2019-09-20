package cats.introduction

object EitherStr {
  //there was a posibilite with implicit conversions and some patterns that i did no understand
  //so i did this way at the moment
  def toEitherStr[A](ox: Option[A], whenNoFound: String = "No found"): Either[String, A] = {
    ox match {
      case Some(x) => Right(x)
      case None => Left(whenNoFound)
    }
  }

  def toEitherStr[A](ox: Either[Throwable,A]): Either[String, A] = {
    ox match {
      case Left(value) => Left(value.getMessage)
      case Right(value) =>Right(value)
    }
  }

}