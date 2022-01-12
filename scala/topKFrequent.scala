package LeetCode

object topKFrequent {
  def topKFrequent(words: Array[String], k: Int):List[String] = {
    val tracker = scala.collection.mutable.Map[String,Int]()

    for(i<-0 until words.length){
      if(tracker.contains(words(i))){
        //tracker.update(words(i),tracker(words(i))+1)
        tracker(words(i)) += 1
      }
      else{
        tracker.put(words(i),1)

      }
    }
    ListMap(tracker.toSeq.sortWith(_._2 > _._2):_*).keys.toList.take(k).sorted
  }

}
