package reactivemongoM
import org.mongodb.scala._

object Connection extends App{

  val uri: String = "mongodb://localhost:27017"
  //System.setProperty("org.mongodb.async.type", "netty")
  val client: MongoClient = MongoClient(uri)
  val db: MongoDatabase = client.getDatabase("test")

  val collection: MongoCollection[Document] = db.getCollection("test");
  // insert a document
  val document: Document = Document("_id" -> 1, "x" -> 1)
  val insertObservable: Observable[Completed] = collection.insertOne(document)


}
