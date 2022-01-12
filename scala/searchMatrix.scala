package LeetCode

object searchMatrix {
  def searchMatrix(matrix: Array[Array[Int]], target: Int): Boolean = {

    val rows = matrix.length
    val col = matrix(0).length

    if(matrix.length == 0) false

    var left = 0
    var right = rows * col -1

    while (left <= right) {
      val midpoint = left + (right - left)/2
      val midpoint_elm = matrix(midpoint/col)(midpoint%col)
      if(midpoint_elm == target) {
        return true
      }
      else if(target > midpoint_elm) {
        left = midpoint+1
      }
      else if(target < midpoint_elm){
        right = midpoint-1
      }

    }
    false
  }


  def searchMatrix2(matrix: Array[Array[Int]], target: Int): Boolean = {

    val rows = matrix.length
    val cols = matrix(0).length

    var row = 0
    var col = cols-1
    if(matrix.length == 0) false

    while (row < rows && col>=0) {

      val midpoint_elm = matrix(row)(col)
      if(midpoint_elm == target) {
        true
      }
      else if(target > midpoint_elm) {
        row += 1
      }
      else if(target < midpoint_elm){
        col -=1
      }

    }
    false
  }
}
