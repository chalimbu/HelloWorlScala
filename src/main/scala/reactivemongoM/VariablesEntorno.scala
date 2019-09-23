package reactivemongoM

object VariablesEntorno extends App{
  println(sys.env.get("HOME").getOrElse("/myHome"))
}
