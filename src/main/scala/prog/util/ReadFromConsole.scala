package prog.util

import prog.Point

import scala.io.StdIn

object ReadFromConsole {
  /**
   * @param str - is incoming string
   *            we splitting it by ' ' and trying to cast each element to float
   *            if catching error we sout that data is incorrect and call function again
   * @return Either:
   *         Left(Point) if can cast each element to float and all values are valid
   *         else we return Right(String) where we show the error
   */
  def read(str: String) : Either[Point, String] = {
    try {
      val array = str.trim.replaceAll(",", ".").split(" ").map(x => x.toFloat)
      array match {
        case Array(x, _, _) if (x < -2) || (x > 2) => Right("X should be between [-2..2]")
        case Array(_, y, _) if (y <= -3) || (y >= 5) => Right("Y should be between (-3..5)")
        case Array(_, _, r) if (r.toInt != r) ||  (r < 1) || (r > 5) => Right("R should be Integer between [1..5]")
        case Array(_, _) | Array(_) | Array() => Right("You should input at least 3 number")
        case Array(x, y, r) => Left(Point(x, y, r.toInt))
        case Array(_*) => read(array.take(3).mkString(" "))
        case _ =>
          Console.err.println("Error during data processing")
          Right("")
      }
    } catch {
      case _: Exception => Console.err.println("Can't get number from you line")
        read(StdIn.readLine())
    }
  }
}
