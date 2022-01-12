package LeetCode
import scala.collection.immutable.ListMap
object kClosest {

  def kClosest(points: Array[Array[Int]], k: Int) = {
    var tracker = scala.collection.mutable.Map[Array[Int], Double]()
    var length = 0.0

    for (i<-0 until points.length ){
      length = scala.math.sqrt(points(i)(0) * points(i)(0) + points(i)(1) * points(i)(1))
      tracker.put(points(i),length)
    }
    val res = ListMap(tracker.toSeq.sortWith(_._2 < _._2):_*)
    res.keys.toArray.take(k)
    //res
  }

}
