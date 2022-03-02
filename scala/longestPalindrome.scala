package LeetCode

object longestPalindrome {
  def longestPalindrome(s: String): String = {
    if(s.length<=1 || s==s.reverse) return s
    var result =""
    var index = 0

    for(i<-1 until s.length){
      index = i
      while(index <= s.length){
        if(s.substring(i-1,index)==s.substring(i-1,index).reverse){

          result = if(result.length <= s.substring(i-1,index).length) s.substring(i-1,index) else result
        }
        index +=1
      }
    }
    result
  }
}
