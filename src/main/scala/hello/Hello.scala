package hello


object Hello{
  def sayHello(name: String): String = s"Hello ${name}"
  println(sayHello("ho"))//
}
