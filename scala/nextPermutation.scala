package LeetCode

object nextPermutation {
  def nextPermutation(nums: Array[Int]): Array[Int] = {

    if(nums.length==0) return nums
    var peak = -1
    val length = nums.length

    def reverse(input: Array[Int]):Array[Int] = {
      for (i <- 0 until input.length / 2) {
        var temp = input(i)
        input(i) = input(input.length - i - 1)
        input(input.length - i - 1) = temp
      }
      input
    }

    for (i<-1 until nums.length){
      if(nums(i)>nums(i-1)){
        peak = i
      }
    }

    if(peak == -1){
      reverse(nums)
      //return nums.sorted
    }

    var index = peak

    for(i<-peak until nums.length){
      if(nums(i)>nums(peak-1) && nums(index)>nums(i)){
        index = i
      }
    }

    val temp = nums(peak-1)
    nums(peak-1) = nums(index)
    nums(index) = temp

    nums.slice(0,peak) ++ nums.slice(peak,nums.length).sorted
  }
}
