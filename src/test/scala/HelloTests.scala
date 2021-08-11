import junit.framework.TestCase.assertEquals
import junit.framework.TestCase
import prog.util.Hello

class HelloTests extends TestCase{
  private val template: String = "Antipin Arsentii's Computer engineer basics Lab № 3" +
    "\n........................................." +
    "\n....................R...................." +
    "\n....................|¯¯¯---__............" +
    "\n....................|         `◝........." +
    "\n....................|            ◝......." +
    "\n....................|             `l....." +
    "\n....................|               \\...." +
    "\n....................|                l..." +
    "\n..R.................|      R / 2     ].R." +
    "\n...|¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯0      ◸¯¯¯¯¯¯¯¯¯...." +
    "\n...|                     ◸..............." +
    "\n...|                   ◸................." +
    "\n...|_________________◸..................." +
    "\n...................R / 2................." +
    "\n........................................." +
    "\n........................................."

  def testGreetingTest(): Unit = assertEquals(Hello.greet(), template)

}
