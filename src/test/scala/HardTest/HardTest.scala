package HardTest

import Lesson_exercises.HardCase._
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class HardTestSuite extends FunSuite {

  trait SolutionChecker {
    val xs = NonEmpty(1, Empty, Empty)
    val ys = NonEmpty(2, Empty, Empty)
    val es = Empty
    val x  = 2
  }

  test("findChar level 1") {
    new SolutionChecker {
      assert(((xs union ys) contains x) == ((xs contains x) || (ys contains x)))
      assert(((es union ys) contains x) == ((es contains x) || (ys contains x)))
      assert(((xs union es) contains x) == ((xs contains x) || (es contains x)))
      assert(((es union es) contains x) == ((es contains x) || (es contains x)))
    }
  }
}