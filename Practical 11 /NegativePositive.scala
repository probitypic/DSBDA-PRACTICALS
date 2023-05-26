object NumberCheck {
  def main(args: Array[String]): Unit = {
    val number: Int = 10

    if (number > 0) {
      println("The number is positive.")
    } else if (number < 0) {
      println("The number is negative.")
    } else {
      println("The number is zero.")
    }
  }
}
