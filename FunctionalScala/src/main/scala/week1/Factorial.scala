package week1

import scala.annotation.tailrec

/**
  * Created by rohit on 1/29/2017.
  */
object Factorial {
  def factorial(num: Int):Int = {
    @tailrec
    def loop(i: Int, acc: Int): Int = {
      if (i == 0) return acc
      else loop(i-1, acc*i)
    }
    loop(num, 1)
  }
}
