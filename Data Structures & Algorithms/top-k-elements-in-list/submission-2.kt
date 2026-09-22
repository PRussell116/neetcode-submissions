class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val numToFreq = HashMap<Int,Int>()
        for(num in nums){
            numToFreq[num] = (numToFreq[num]?:0) + 1
        }

        val queue = PriorityQueue<Pair<Int,Int>>(compareBy {it.second})

        for((num,freq) in numToFreq){
            queue.add(Pair(num,freq))
            if(queue.size > k) queue.poll()
        }

        val res = IntArray(k)
        var index = 0
        while(queue.size > 0){
            val item = queue.poll()
            res[index] = item.first
            index++



        }

        return res

    }
}
