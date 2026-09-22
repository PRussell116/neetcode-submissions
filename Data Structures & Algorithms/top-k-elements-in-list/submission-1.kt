class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val numToFreq = HashMap<Int,Int>()
        for(num in nums){
            numToFreq[num] = (numToFreq[num]?:0) + 1
        }

        val queue = PriorityQueue<Pair<Int,Int>>(compareBy {it.second})

        for(num in numToFreq.keys){
            queue.add(Pair(num,numToFreq[num]?:0))
            if(queue.size > k) queue.poll()
        }

        return queue.map {it.first}.toIntArray()

    }
}
