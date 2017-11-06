import scala.collection.mutable

class NonDuplicateChar {
  def removeAll(s: String): String = {
    val linkedHashSet: mutable.LinkedHashSet[Char] = new mutable.LinkedHashSet[Char]

    val length: Int = s.length

    for(i <- 0 until length){
      linkedHashSet.add(s.charAt(i))
    }

    val listChar: List[Char] = linkedHashSet.toList

    listChar.mkString
  }

  def removeOnlyNext(s: String): String = {
    var listChar: List[Char] = Nil

    val length: Int = s.length

    for(i <- 0 until length){
      if(i == length-1){
        listChar = s.charAt(i) :: listChar
      } else {
        if(s.charAt(i) != s.charAt(i+1)){
          listChar = s.charAt(i) :: listChar
        } else {

        }
      }
    }

    listChar.reverse.mkString
  }
}