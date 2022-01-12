package LeetCode

object majorityElementTwo {

  def trackmaker(nums: Array[Int]): Array[Int] = {
    var tracker = scala.collection.mutable.Map[Int, Int]()
    for (i <- 0 until nums.length-1 ){
      if(tracker contains nums(i)) tracker.updated(nums(i) , nums(i) + 1)
      else tracker.updated(nums(i),1)
    }
     tracker //.filter(x => x._2 >= nums.length/3).keys.toArray
  }

}
