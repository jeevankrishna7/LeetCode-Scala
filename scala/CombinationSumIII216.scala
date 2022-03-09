package LeetCode

object CombinationSumIII216 {
  def combinationSum3(k: Int, n: Int) = {
    var result = new ListBuffer[List[Int]]

    def try_combinations(combinations: ListBuffer[Int], k: Int, n: Int, start: Int): List[List[Int]] ={
      var nn = n
      var kk =k
      if(k==combinations.size){
        if(nn==0) result += combinations.toList
      }
      for(i <- start until n){
        combinations += i
        try_combinations(combinations,k,nn,i+1)
        combinations.remove(combinations.size-1)
      }
      result.toList
    }
    var combinations = new ListBuffer[Int]
    try_combinations(combinations, k, n, 1)
  }
}
