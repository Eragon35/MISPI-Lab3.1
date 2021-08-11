package prog

import prog.util.{Hello, ReadFromConsole}

import scala.io.StdIn

object Main {
  def main(args: Array[String]): Unit = {
    println(Hello.greet())
    while (true) {
      print("\nPlease write x, y, r to check if it's inside the figure: ")
      val input: Either[Point, String] = ReadFromConsole.read(StdIn.readLine())
      input match {
        case Left(point: Point) =>
          println(point.check())
        case Right(line: String) => println(line)
      }
    }
  }

}
