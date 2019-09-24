/**
 #database creation
 use music
 #insertion of collections
  db.artists.insert({ artistname: "Madonna " })
  db.artists.insert({ artistname: "Bob Dylan" })
  db.artists.insert({ artistname: "The Beatles" })
  db.artists.insert({ artistname: "Eminem" })
  db.artists.insert({ artistname: "Taylor Swift" })
  db.artists.insert({ artistname: "Michael Jackson" })
  db.artists.insert({ artistname: "Elvis Presley" })

 db.artists.find()
 */
package reactivemongoM
import scala.concurrent.Future
import reactivemongo.api.MongoConnection
import reactivemongo.api.collections.bson.BSONCollection
import reactivemongo.api.commands.WriteResult
import reactivemongo.bson.BSONDocument
// Task is in monix.eval
import monix.eval.Task
import scala.concurrent.ExecutionContext.Implicits.global


object GetStarted extends App{
  //"mongodb://user:pass@host1:27017
  //s"mongodb://${logeo}${host}/${db}" logeo don apply

    val mongoUri = s"mongodb://${Configurations.host}/${Configurations.db}"
    val driver = new reactivemongo.api.MongoDriver
    val connectionTask=Task.deferFutureAction { implicit scheduler =>
      val parsedUri        = MongoConnection.parseURI(mongoUri)
      val connection       = parsedUri.map(driver.connection)
      val futureConnection = Future.fromTry(connection)
      futureConnection.flatMap(_.database(Configurations.db))
    }.onErrorHandleWith {
      case exception: Exception => {
        println("No fue posible conectarse a mongo", Some(exception), getClass)
        Task.raiseError(exception)
      }
    }
  val document1 = BSONDocument(
    "firstName" -> "Stephane",
    "lastName" -> "Godbillon",
    "age" -> 29)


  def simpleInsert(coll: Task[BSONCollection],document: BSONDocument): Future[WriteResult] = {

    //result.flatMap(x=>x)
    Task.deferFutureAction { implicit scheduler =>
      coll.flatMap(x => {
          x.insert.one(document)
      }
      )
    }.onErrorHandleWith {
      case exception: Exception => {
        println("No fue posible conectarse a mongo", Some(exception), getClass)
        Task.raiseError(exception)
      }
    }
  }
  simpleInsert(connectionTask.map(x=>x.collection[BSONCollection]("artists")).map(x=>x)
    ,document1)

}