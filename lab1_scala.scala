object FindMinAndMax {
  def main(args: Array[String]): Unit = {
    val list_numbers = List(5, 2, 9, 1, 8, 3, 7, 4, 10, 6)
    
    var min = list_numbers.head
    var max = list_numbers.head
    
    for (num <- list_numbers) {
      if (num < min) {
        min = num
      }
      if (num > max) {
        max = num
      }
    }
    
    println(s"Minimum: $min")
    println(s"Maximum: $max")
  }
}
