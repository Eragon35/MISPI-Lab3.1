import junit.framework.TestCase.assertEquals
import junit.framework.TestCase
import prog.{Point, ReadFromConsole}

class ReadTests extends TestCase{

  def testZeroArgument(): Unit = assertEquals(Right("Can't get number from you line"), ReadFromConsole.read(""))
  def testOneArgument(): Unit = assertEquals(Right("You should input at least 3 number"), ReadFromConsole.read("1"))
  def testTwoArguments(): Unit = assertEquals(Right("You should input at least 3 number"), ReadFromConsole.read("1 2"))

  def testLettersInData(): Unit = assertEquals(Right("Can't get number from you line"), ReadFromConsole.read("1 2sdfs"))

  def testLowerR(): Unit = assertEquals(Right("R should be Integer between [1..5]"), ReadFromConsole.read("1 2 0.75"))
  def testBiggerR(): Unit = assertEquals(Right("R should be Integer between [1..5]"), ReadFromConsole.read("1 2 5.1"))

  def testLowerY(): Unit = assertEquals(Right("Y should be between (-3..5)"), ReadFromConsole.read("1 -8 -5"))
  def testBiggerY(): Unit = assertEquals(Right("Y should be between (-3..5)"), ReadFromConsole.read("1 22.999 5.45"))

  def testLowerYBorder(): Unit = assertEquals(Right("Y should be between (-3..5)"), ReadFromConsole.read("1 5 -3"))
  def testBiggerYBorder(): Unit = assertEquals(Right("Y should be between (-3..5)"), ReadFromConsole.read("1 -3 5"))

  def testLowerX(): Unit = assertEquals(Right("X should be between [-2..2]"), ReadFromConsole.read("-11.1 -8 -5"))
  def testBiggerX(): Unit = assertEquals(Right("X should be between [-2..2]"), ReadFromConsole.read("2.1 22.999 5.45"))



  def testPointFirstQuarter(): Unit = assertEquals(Left(Point(1, 2, 4)), ReadFromConsole.read("1 2 4"))
  def testPointFirstQuarterBoderY(): Unit = assertEquals(Left(Point(1, 4.99999999, 3)), ReadFromConsole.read("1 4,99999999 3"))
  def testPointFirstQuarterBoderX(): Unit = assertEquals(Left(Point(2, 2, 3)), ReadFromConsole.read("2 2 3"))

  def testPointSecondQuarter(): Unit = assertEquals(Left(Point(1, -2, 4)), ReadFromConsole.read("1 -2 4"))
  def testPointSecondQuarterBoderY(): Unit = assertEquals(Left(Point(1, -2.99999999, 3)), ReadFromConsole.read("1 -2,99999999 3"))
  def testPointSecondQuarterBoderX(): Unit = assertEquals(Left(Point(2, -2, 3)), ReadFromConsole.read("2 -2 3"))

  def testPointThirdQuarter(): Unit = assertEquals(Left(Point(-1, -2.99999999, 3)), ReadFromConsole.read("-1 -2,99999999 3"))
  def testPointThirdQuarterBorderX(): Unit = assertEquals(Left(Point(-2, -2, 3)), ReadFromConsole.read("-2 -2 3"))
  def testPointThirdQuarterBorderY(): Unit = assertEquals(Left(Point(-1, -2.99999999, 3)), ReadFromConsole.read("-1 -2,99999999 3"))

  def testPointForthQuarter(): Unit = assertEquals(Left(Point(-1, 1, 3)), ReadFromConsole.read("-1 1 3"))
  def testPointForthQuarterBorderX(): Unit = assertEquals(Left(Point(-2, 2.99999999, 3)), ReadFromConsole.read("-2 2,99999999 3"))
  def testPointForthQuarterBorderY(): Unit = assertEquals(Left(Point(-1, 4.99999999, 3)), ReadFromConsole.read("-1 4,99999999 3"))

}
