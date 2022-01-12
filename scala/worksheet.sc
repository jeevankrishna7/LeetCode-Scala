import scala.collection.mutable.ArrayBuffer
def findDiagonalOrder(mat: Array[Array[Int]]) = {
if(mat.length==0) Array[Int]()


  val tracker = scala.collection.mutable.Map[Int,ArrayBuffer[Int]]()
  var result = ArrayBuffer[Int]()
  for(i<-0 until mat.length){
    for(j<-0 until mat(0).length){
      if(tracker contains(i+j)){
        tracker.update(i + j, tracker(i + j) += mat(i)(j))
      }else {

        tracker.put(i + j,  ArrayBuffer(mat(i)(j)))
      }

    }
  }

  val go = mat.length + mat(0).length -2
  for(i<-0 to go) {
    if (i % 2 == 0) {
      result ++= tracker(i).sorted(Ordering.Int.reverse)
    }
    else {
      result ++= tracker(i).sorted
    }
  }
  //result.toArray
  tracker
}


val input = Array(Array(2,5),Array(8,4),Array(0,-1))

findDiagonalOrder(input)

  [[2,5]
,  [8,4]
,  [0,-1]]

2,58,04,-1

00,01,10,11,02,21

2 -> ArrayBuffer(4, 0), 1 -> ArrayBuffer(5, 8), 3 -> ArrayBuffer(-1), 0 -> ArrayBuffer(2)

25840-1