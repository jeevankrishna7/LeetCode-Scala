
  def jump(nums: Array[Int]): Int = {
    var addvalue = 1
    var index = 0
    var jumps = 0
    while(nums(index)+index<nums.length-1) {
      var sub_array = nums.slice(nums(index + 1), nums(index + nums(index) + 1))

      for (i <- 0 until sub_array.length) {

        sub_array(i) = sub_array(i) + addvalue - nums.length
        addvalue += 1
      }
      index = sub_array.indexOf(sub_array.max)
      addvalue = 1

      jumps+=1
    }
    jumps
  }


val a = Array(2,3,1)
  a.indexOf(a.max)
  jump(a)
//a.indexOf(6)*/

  var b = a.slice(0,7)
  b(0)=9
  b(1)



// [4,4,4,4,4]
// [8,7,6,5,4]

