package LeetCode

object SubarraySumEqualsK {
  def subarraySum(nums: Array[Int], k: Int): Int = {
    var countTracker = 0
    for(i <- 0 until nums.length-1){
      if (nums(i) + nums(i+1) == k ) {
        countTracker +=1 }
    }
    for(i <- 0 until nums.length){
      if (nums(i)  == k ) {
        countTracker +=1 }
    }
    countTracker
  }

}
