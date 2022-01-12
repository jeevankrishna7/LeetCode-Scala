package LeetCode
import scala.collection.mutable.Map
object singleNumber {

  def singleNumber(nums: Array[Int]:Int = {
    var states = scala.collection.mutable.Map[Int,Int]()

    for(i <-0 until nums.length){
      if(states contains(nums(i))){
        states(nums(i))+=1
      }
      else{
        states.put(nums(i), 1)
      }
    }
    val statest = states.filter(x => x._2==1)
    statest.head._1
  }

}
