package LeetCode

object findMedianSortedArrays {
  def findMedianSortedArrays(nums1: Array[Int], nums2: Array[Int]): Double = {
    val mergedArray = nums1 ++ nums2
    (mergedArray).sorted
    val arrayLen: Double = mergedArray.length
    var median: Double = 0.0
    if ((arrayLen/2.0).isValidInt){
      val sum: Double = mergedArray(mergedArray.length/2) + mergedArray((mergedArray.length/2) - 1)
      median =  sum/2.0
    }
    else {
      val loc  = (arrayLen - 1.0)/2.0
      median = mergedArray(loc.toInt)
      println(loc)
    }
    median
  }

}
