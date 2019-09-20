package sequenceOperations

object FilterExercise extends App{
  val nums=List(5,1,4,3,2)
  println(nums.filter(_>2))
  val listOfPersons=List(new PersonR("Jhon",34,true),
    new PersonR("Oscar",42,false),
    new PersonR("Miguel",21,false),
    new PersonR("felipe",42,true))

  //return the first name of a valid person sorted by age
  def validByAge(in: List[Person])={
    in.filter(_.valid).
    sortBy(_.first).
    map(_.first)
  }
  println(validByAge(listOfPersons))


}

trait Person{
  def first: String
  def age: Int
  def valid: Boolean
}

class PersonR(override val first:String,override val age: Int
              ,override val valid: Boolean) extends Person{

}