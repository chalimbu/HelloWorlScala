package Maps

case class Person(name: String,isMale: Boolean,children: Person*) {

}
object Person extends App{

  val lara=Person ("Lara",false)
  println(lara.toString)
  val bob= Person("Bob",true)
  val julie=Person("Julie",false,lara,bob)
  val persons=List(lara,bob,julie)

}
