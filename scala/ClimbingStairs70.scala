package LeetCode

object ClimbingStairs70 {
// fibonacci series in reverse order is the solution
  def climbStairs(n: Int):Int = {
    var one,two = 1
    for(i<-1 to n-1){
      val tmp = one
      one =  one+two
      two = tmp
    }
    one
  }
}
