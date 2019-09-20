package cats.introduction

object Sequential {
  type EitherThro[A] = Either[String,A]
  def connection: EitherThro[Database] =
    //EitherStr.toEitherStr(Database.connect(true).toEither)
    EitherStr.toEitherStr(Database.connect(false).toEither)

  def user(id: Int, db: Database): EitherThro[User] =
    EitherStr.toEitherStr[User](db.getUser(id),"no found user")

}

object sequential extends App{
  Sequential.connection match {
    case Left(value) => println(s"Error ${value}")
    case Right(value) => Sequential.user(100, value) match {
      case Left(value) => println(s"Error ${value}")
      case Right(value) =>println(value.id)
    }
  }
}
