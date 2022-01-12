object Solution {
  def numIslands(grid: Array[Array[Char]]): Int = {
    val m = grid.length
    val n = grid(0).length
    var count = 0
    for(i <-0 until grid.length){
      for(j <-0 until grid(0).length){
        if(grid(i)(j) == '1'){
          count +=1
          dfs(grid,i,j)
        }
      }
    }
    count
  }

  def dfs(input: Array[Array[Char]], i: Int,j: Int):Unit ={
    if(i<0 || j < 0 || i>= input.length || j >= input(i).length || input(i)(j)=='0') return

    input(i)(j) = '0'
    dfs(input,i+1,j)
    dfs(input,i-1,j)
    dfs(input,i,j+1)
    dfs(input,i,j-1)
  }
}
