package cats.introduction

/**
 * a side effect database
 */
trait EffectfulDatabase {
  def getUser(id: Int): User=
    if(id==42 || id==100) User(id) else null
}

object EffectfulDatabase{
  def connect(dbOnline: Boolean): EffectfulDatabase =
    if(dbOnline) new EffectfulDatabase {}
    else throw new RuntimeException("Database is offline")
}

object EffectfulDatabaseApp extends App{
  val connection=EffectfulDatabase.connect(true)
  val user= connection.getUser(10)
  print(user.id)
}