package LeetCode

object plusOne66 {
  def plusOne(digits: Array[Int]): Array[Int] = {
    val length = digits.length
    var dig = digits
    for(i<-length-1 to 0 by -1){

      if(dig(i)==9){
        dig(i) =0
      }
      else {
        dig(i) +=1
        return dig
      }
    }
    dig = new Array[Int](length+1)
    dig(0)=1
    dig
  }

}
