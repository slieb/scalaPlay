/**
  * Created by slieb on 8/8/16.
  */
object scalaPlay {

  def main(args: Array[String]): Unit = {

    println("Hello, world!")

    // System / Environment Variable
    val env = System.getenv("SCALA_HOME")
    if (env == null)
      println("SCALA_HOME not found")
    else
      println("Found SCALA_HOME at ", env)

    // Regular Expressions, a string, and a double
    val input = "Enjoying this apple 3.14159 times today"
    val pattern = """.* apple ([\d.]+) times .*""".r
    val pattern(amountText) = input
    val amount = amountText.toDouble
    println(s"amountText is $amountText and one more than amount is ${amount + 1}")

    // Tuples
    val info = (5, "Korben", true)
    val name = info._2;
    println(s"Info is $info, name is $name")

    // Functions
    def multiplier(x: Int, y: Int): Int = {
      x * y
    }
    val result = multiplier(6, 7)
    println(s"Multipler of 6x7 is $result")

    // Procedures - a function with no return value
    def log(d: Double) = println(f"Got value $d%.2f")
    log(2.23535)

    // Recursive Function
    def power(x: Int, n: Int): Long = {
      if (n >= 1) x * power(x, n - 1)
      else 1
    }
    val thePower = power(2, 8)
    println(s"The power of 2 to the 8th is $thePower")
  }

}
