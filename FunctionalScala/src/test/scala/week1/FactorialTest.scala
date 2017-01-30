package week1

import org.scalatest.FunSuite
/**
  * Created by rohit on 1/29/2017.
  */
class FactorialTest extends FunSuite {
  test("Factorial of 0 is 1") {
    assert(Factorial.factorial(0) == 1)
  }

  test("Factorial of 1 is 1") {
    assert(Factorial.factorial(1) == 1)
  }

  test("Factorial of 5 is 120") {
    println(Factorial.factorial(5))
    assert(Factorial.factorial(5) == 120)
  }
}
