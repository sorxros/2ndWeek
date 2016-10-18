package HardTest

import Lesson_exercises.HardCase._
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class HardTestSuite extends FunSuite {

  trait SolutionChecker {
    val l = NonEmpty(1, Empty, Empty)
    val r = NonEmpty(2, Empty, Empty)
    val xs = NonEmpty(3, l, r)
    val ly = NonEmpty(4, Empty, Empty)
    val ry = NonEmpty(5, Empty, Empty)
    val ys = NonEmpty(6, ly, ry)
    val es = Empty
    val x  = 1
    val y  = 2
    val z  = 3
  }

  test("findChar level 1") {
    new SolutionChecker {
      assert(((xs union ys) contains x) == ((xs contains x) || (ys contains x)))
      assert(((es union ys) contains x) == ((es contains x) || (ys contains x)))
      assert(((xs union es) contains x) == ((xs contains x) || (es contains x)))
      assert(((es union es) contains x) == ((es contains x) || (es contains x)))
      //assert()
    }
  }
}