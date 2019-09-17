package Maps

object MapExercise extends App{
  val l=List(1,2,3,4)
  val newList=l.map(x=>x+2)
  for(x<-newList){
    println(x+"")
  }
  val pairs=l.map(x=>pairNumbers(x))
  for(i<-pairs) {
   i match {
      case Some(i) => println(i)
      case None => println("No pair")
    }
  }

  def pairNumbers(value:Int):Option[Boolean]= {
    if((value%2)==0) Some(true)
    else None
  }

}
