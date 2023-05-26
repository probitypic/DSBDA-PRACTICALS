object LargestNumber {
  def main(args: Array[String]): Unit = {
    val num1: Int = 10
    val num2: Int = 20

    val largest: Int = if (num1 > num2) {
      num1
    } else {
      num2
    }

    println("The largest number is: " + largest)
  }
}
