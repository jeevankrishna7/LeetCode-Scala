object Solution {

 def exist(board: Array[Array[Char]], word: String): Boolean = {
val m = board.length
  val n = board(0).length
   var visited = Array[Array[Boolean]](m)(n)

  for(i<-0 until board.length){
    for(j <-0 until board(i).length){

      if(board(i)(j) == word.charAt(0) && searchWord(i,j,word,board,0)){
        return true
      }

    }
  }
  return false
}
def searchWord(i: Int, j: Int, word: String, board: Array[Array[Char]],index: Int): Boolean={
  if(index == word.length) true

  if(i<0 || j<0 || i>= board.length || j>=board(i).length || visited(i)(j) || board(i)(j)==word.charAt(index)) false
visited(i)(j) = true
  if(searchWord(i+1,j,word,board,index+1) ||
    searchWord(i,j,word,board,index+1) ||
    searchWord(i,j,word,board,index+1) ||
    searchWord(i,j,word,board,index+1)){
    return true
  }
  visited(i)(j) = false
  return false

}

}
