import scala.collection.mutable.ArrayBuffer
def findDiagonalOrder(mat: Array[Array[Int]]): Array[Int] = {

  var go = 0
  val tracker = scala.collection.mutable.Map[Int,ArrayBuffer[Int]]()
var result = ArrayBuffer[Int]()
  for(i<-0 until mat.length){
    for(j<-0 until mat.length){
      if(tracker contains(i+j)){
        tracker.update(i + j, tracker(i + j) += mat(i)(j))
      }else {

        tracker.put(i + j,  ArrayBuffer(mat(i)(j)))
      }

    }
  }
 if(mat.length == 1 && mat(0).length == 1){
    go = 0
 } else if(mat.length == 1 && mat(0).length >= 1){
   go = mat(0).length -1
 }
 else if (mat.length == 2){
    go = 2
 } else{
    go = (mat.length-1)*2
 }
  for(i<-0 to go) {
    if (i % 2 == 0) {
      result ++= tracker(i).sorted(Ordering.Int.reverse)
    }
    else {
      result ++= tracker(i).sorted
    }
  }
  result.toArray
}



//test(Map(2 -> ArrayBuffer(4), 1 -> ArrayBuffer(2, 3), 0 -> ArrayBuffer(1)))

findDiagonalOrder(Array(Array(1,2),Array(3,4)))

// 1 - 0, 2 - 2, 3 - 4, 4 - 6, 5 - 8