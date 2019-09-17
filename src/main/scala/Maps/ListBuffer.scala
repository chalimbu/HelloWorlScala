package Maps
import scala.collection.mutable.ListBuffer


object ListBuffer extends App{
val buf=new ListBuffer[Int]
  buf+=1
  buf+=2
  3 +=: buf
  val list=buf.toList
  list.foreach(s=>println(s))
}
