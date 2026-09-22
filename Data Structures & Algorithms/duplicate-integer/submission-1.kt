class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val seenNumbers = hashSetOf<Int>()
        
        for(num in nums){
            if(seenNumbers.contains(num)) return true
            seenNumbers.add(num)

        }
        return false

    }
}
