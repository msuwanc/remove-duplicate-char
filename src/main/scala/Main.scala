object Main extends App {
  val input: String = "aaabccaadeee"
  
  val nonDuplicateChar: NonDuplicateChar = new NonDuplicateChar
  
  val result: String = nonDuplicateChar.removeAll(input)
  
  val result2: String = nonDuplicateChar.removeOnlyNext(input)
  
  println(Console.GREEN + result + Console.RESET)
  
  println(Console.YELLOW + result2 + Console.RESET)
}