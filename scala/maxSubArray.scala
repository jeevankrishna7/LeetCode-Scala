package LeetCode

object maxSubArray {

  def maxSubArray(nums: Array[Int]): Int = {

    var maxValue = (-1.0/0).toInt
    var sum = 0
    for (i <-0 until nums.length){
      for(j<-i until nums.length){
        sum += nums(j)
        maxValue = maxValue.max(sum)
      }
    }
    maxValue
   }

}
