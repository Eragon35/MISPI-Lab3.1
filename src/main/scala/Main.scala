import prog.{Greeting, Point, ReadFromConsole}

import scala.io.StdIn

object Main {
  def main(args: Array[String]): Unit = {
    println(Greeting.hello())
    while (true) {
      print("\nPlease write x, y, r to check if it's inside the figure: ")
      val input: Either[Point, String] = ReadFromConsole.read(StdIn.readLine()) // trying to get data from imput line
      input match {
        case Left(point: Point) => // case we can create valid prog.Point we check if it's insise zone or not
          println(point.check())
        case Right(line: String) => Console.err.println(line) // else we write user's error & let to input new data
      }
    }
  }

}
