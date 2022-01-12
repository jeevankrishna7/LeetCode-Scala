package LeetCode



object scala {
  def threeSum(nums: Array[Int]): Unit = {
    scala.util.Sorting.quickSort(nums)

    for (i <- 0 until nums.length - 2) {
      if (i == 0 || (i > 0 && nums(i) != nums(i - 1))) {
        val low = i + 1
        val high = nums.length - 1
        val sum = 0 - nums(i)

        while (low < high) {
          if (nums(low) + nums(high) == sum) {
            println(List(nums(low), nums(high), nums(i)))
          }
        }
      }
    }

  }
}
