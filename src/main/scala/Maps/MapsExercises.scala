package Maps

object MapsExercises extends App{
  val states=Map(1->"Colombia",2->"Chile",3->"Puerto rico")
  println(states(1))
  for((k,v)<-states)
    println(s"$k and value $v")


}
