package cats.introduction

import scala.util.{Failure, Success, Try}

//emulating a database
trait Database{
  def getUser(id: Int): Option[User]=
    if(id==42 || id==100) Some(User(id)) else None

  def getPostOf (u: User): List[Post] =
    if(u.id ==42) List(Post("Foo"),Post("Bar")) else Nil
}

object Database {
  def connect(dbOnline: Boolean): Try[Database] =
    if(dbOnline) Success(new Database{})
    else Failure(new RuntimeException("Database is offline"))
}

object DatabaseApp extends App{

  //this is called Effect Types
  val conection=Database.connect(false)
  conection match {
    case Success(c) =>
      val user=c.getUser(100)
      user match {
        case Some(value) => println(value.id)
        case None => println("user no found")
      }
    case Failure(c) =>
      println(s"found error ${c.getMessage}")
  }
}
