
package LeetCode
object ContainerWithMostWater {
  def maxArea(height: Array[Int]): Int = {
  var area = 0
  var length = 0
  var bredth = 0
  var visited = new Array[Boolean](height.length)
  for(i<-0 until height.length){
for(j<-i until height.length){
   length = height.indexOf(height(j)) - height.indexOf(height(i))
  bredth = height(i).max(height(j))
  area = area.max(length * bredth)
}
  }
    area
  }
}
