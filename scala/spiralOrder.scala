package LeetCode
import scala.collection.mutable.ArrayBuffer
object spiralOrder {



  def spiralOrder(matrix: Array[Array[Int]]): List[Int] = {

    if(matrix.length==0) return matrix(0).toList
    var result = ArrayBuffer[Int]()

    var rowBegin = 0
    var rowEnd = matrix.length -1
    var colBegin = 0
    var colEnd = matrix(0).length -1
    val length =  matrix.length * matrix(0).length

    while (rowBegin <= rowEnd && colBegin <= colEnd){

      for (i<-colBegin to colEnd if result.length < length){
        result += matrix(rowBegin)(i)
      }
      rowBegin +=1

      for(i <-rowBegin to rowEnd if result.length < length){
        result += matrix(i)(colEnd)
      }
      colEnd -= 1

      for(i<-colEnd to colBegin by -1 if result.length < length){
        result += matrix(rowEnd)(i)
      }
      rowEnd -=1

      for(i<-rowEnd to rowBegin by -1 if result.length < length){
        result += matrix(i)(colBegin)
      }
      colBegin +=1
    }

    result.toList
  }
}
