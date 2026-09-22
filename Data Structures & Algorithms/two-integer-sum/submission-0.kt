class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val numToIndex = hashMapOf<Int,Int>()
        for((index,num) in nums.withIndex()){
            val neededNum = target - num
             if(numToIndex[neededNum] == null){

                numToIndex[num] = index
             }else {
                val neededNumIndex = numToIndex[neededNum]
                 if(neededNumIndex != null) return intArrayOf(neededNumIndex,index)
            
            } 

          

        }
        return intArrayOf(0,0)

    }
}
