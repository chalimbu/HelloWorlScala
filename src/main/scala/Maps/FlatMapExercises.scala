package Maps

object FlatMapExercises extends App{
  def g(v: Int): List[Int] = List(v-1,v,v+1)

  val l=List(1,2,3,4,5)
  val lWithMapt=l.map(x=>g(x))
  lWithMapt.foreach(x=>print(x))
  println()

  val lWithFlatMap=l.flatMap(x=>g(x))
  lWithFlatMap.foreach(x=>print(x))
  println()
  //flatmap becomes as elements al the parts to list
  //to make a flatList event if function returns a list with multiple
  //elements

  //flat map for avoid the None with options
  val lWithFlapMaptOptions=l.flatMap(x=>MapExercise.pairNumbers2(x))
  lWithFlapMaptOptions.foreach(x=>print(x))
  println()
}
