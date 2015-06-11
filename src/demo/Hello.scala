package demo

import java.io.ByteArrayInputStream
import java.util.{Locale, Date}
import java.text.DateFormat._

/**
 * Created by Simon on 17.11.2014.
 */
object Hello {

  def main(args: Array[String]) {
    val now = new Date
    val df = getDateInstance(LONG, Locale.GERMAN)

    println(df.format(now))

    func1(() => println("anonymous"))

    val pc = new ParameterClass(3, 5)
    val test = new ByteArrayInputStream(new Array[Byte](10))
    println(pc.value)
  }

  def func1(func2: () => Unit) {
    func2()
  }

  def func2() {
    println("Test")
  }

}
