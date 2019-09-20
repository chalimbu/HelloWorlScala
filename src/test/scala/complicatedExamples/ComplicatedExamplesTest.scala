package complicatedExamples

import org.scalatest.FunSuite

class ComplicatedExamplesTest extends FunSuite{
  test("Un Option se debe poder filtrar con filter") {
    val value = Option(4,3,4,5)

    assert(value.filter(x => x._1 > x._2) == Some((4,3,4,5)))

  }
}
