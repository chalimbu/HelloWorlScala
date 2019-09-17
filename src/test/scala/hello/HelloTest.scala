package hello
import org.scalatest.FunSuite
import hello.Hello


class HelloTest extends FunSuite {
  //clas name.methodName
  test("Hello.sayHello"){
    assert("Hello Scala"==Hello.sayHello("Scala"))
  }
}




