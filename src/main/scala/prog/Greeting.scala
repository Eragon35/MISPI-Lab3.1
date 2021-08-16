package prog

import scala.io.Source

/**
 * Just return lines with checking zone picture & author's name
 */

object Greeting {
  private val asciiURL = "../resources/ascii.txt"
  private val name = "Antipin Arsentii"

  def hello(): String = {
    var greeting: String = s"$name's Computer engineer basics Lab № 3\n"
    val source = Source.fromURL(getClass.getResource(asciiURL))
    greeting += source.getLines().mkString("\n")
    source.close()
    greeting
  }
}
