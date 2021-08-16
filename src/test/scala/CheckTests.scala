import junit.framework.TestCase
import junit.framework.TestCase.{assertFalse, assertTrue}
import prog.Point

class CheckTests extends TestCase {

  def testFirstQuarterIn(): Unit = assertTrue(Point(1, 2, 3).check())
  def testFirstQuarterBorder(): Unit = assertTrue(Point(2, 2, 4).check())
  def testFirstQuarterBorderWithX(): Unit = assertTrue(Point(4, 0, 4).check())
  def testFirstQuarterBorderWithY(): Unit = assertTrue(Point(0, 1.9, 4).check())
  def testFirstQuarterOut(): Unit = assertFalse(Point(1, 2, 1).check())

  def testSecondQuarterIn(): Unit = assertTrue(Point(1, -1, 5).check())
  def testSecondQuarterBorder(): Unit = assertTrue(Point(1, -1, 4).check())
  def testSecondQuarterBorderWithX(): Unit = assertTrue(Point(1, 0, 3).check())
  def testSecondQuarterBorderWithY(): Unit = assertTrue(Point(0, -1.999999, 4).check())
  def testSecondQuarterOut(): Unit = assertFalse(Point(1, -3, 1).check())

  def testThirdQuarterIn(): Unit = assertTrue(Point(-1, -1, 5).check())
  def testThirdQuarterBorder(): Unit = assertTrue(Point(0, -2, 4).check())
  def testThirdQuarterBorderWithX(): Unit = assertTrue(Point(-1.5, -1, 3).check())
  def testThirdQuarterBorderWithY(): Unit = assertTrue(Point(-3.9999999, -2.5, 5).check())
  def testThirdQuarterOut(): Unit = assertFalse(Point(-3, -1, 3).check())

  def testForthQuarterIn(): Unit = assertTrue(Point(0, 0, 1).check())
  def testForthQuarterOut(): Unit = assertFalse(Point(-3, 1, -3).check())
  def testForthQuarterBorderWithX(): Unit = assertTrue(Point(0, 2, 3).check())
  def testForthQuarterBorderWithY(): Unit = assertTrue(Point(-3.9999999, 0, 5).check())



}
