package cats.introduction

object SequentialMonadic extends App{
  type EitherThro[A] = Either[String,A]
  def getUser(user: Int): EitherThro[User] ={
    for{
      a <- Sequential.connection
      b <- Sequential.user(user,a)
    } yield b

  }

  getUser(100) match {
    case Left(value) => println(value)
    case Right(value) => println(value)
  }
}
