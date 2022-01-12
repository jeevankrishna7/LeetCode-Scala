package LeetCode

object missingNumber {
  def missingNumber(nums: Array[Int]): Int = {
    scala.util.Sorting.quickSort(nums)
    var missingNum = -1
    if(nums(nums.length - 1)==nums.length-1){
      missingNum = nums.length
    }else if(nums(0)!=0) {
      missingNum=0
    } else{
      for (i <- 0 until nums.length){
        if(nums(i) != i){
          missingNum = i
        }
      }
    }
    missingNum
  }



  /*
  * missingNumber(Array(9,6,4,2,3,5,7,0,1))
  * Input: nums = [9,6,4,2,3,5,7,0,1]
  * Output: 8
  * Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
  * */

}
