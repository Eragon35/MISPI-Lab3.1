package prog.util

import scala.io.Source

/**
 * Just return lines with checking zone picture & author's name
 */

object Hello {
  private val asciiURL = "../../resources/ascii.txt"
  private val name = "Antipin Arsentii"
  def greet(): String = {
    var greeting: String = s"$name's Computer engineer basics Lab № 3\n"
    val source = Source.fromURL(getClass.getResource(asciiURL))
    greeting += source.getLines().mkString("\n")
    source.close()
    greeting
  }
}
