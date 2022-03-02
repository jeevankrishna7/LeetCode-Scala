package LeetCode

import scala.collection.mutable.Stack

object ValidParentheses20 {
  def isValid(s: String): Boolean = {

    val map: Map[Char,Char] = Map('(' -> ')', '{' -> '}', '[' -> ']')
    val strings = new Stack[Char]()
    for(i <- s){
      if (map.contains(i)) {
        strings.push(i)
        //return true
      }
      else if (strings.size > 0 && map.get(strings.top) == Some(i)){
        strings.pop()
        //return true
      }else{
        return false
      }
    }
    if(strings.size==0) return true else false
  }
}
