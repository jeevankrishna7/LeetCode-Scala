package LeetCode
import scala.collection.mutable.ArrayBuffer
object intersection {

  def intersection(nums1: Array[Int], nums2: Array[Int]): Array[Int] = {
    val nums1d= nums1.distinct
    val nums2d= nums2.distinct
    var result = ArrayBuffer[Int]()
    var tracker = scala.collection.mutable.Map[Int, Int]()

    for(i <-0 until nums1d.length){
      tracker.put(nums1d(i),1)
    }

    for(i <-0 until nums2d.length){
      if (tracker contains(nums2d(i))){
        result.append(nums2d(i))
      }
    }
    result.toArray

  }

}
