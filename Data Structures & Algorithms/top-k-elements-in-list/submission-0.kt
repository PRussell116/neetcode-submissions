class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val numToFreq = HashMap<Int,Int>()
        for(num in nums){
            numToFreq[num] = (numToFreq[num]?:0) + 1
        }
        val ordered = numToFreq.keys.toList().sortedByDescending{ numToFreq[it]}

        return ordered.take(k).toIntArray()

    }
}
