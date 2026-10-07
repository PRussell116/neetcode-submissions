class Solution {
    fun networkDelayTime(times: Array<IntArray>, n: Int, k: Int): Int {
        val edges = HashMap<Int,MutableList<Pair<Int,Int>>>()
        for((u,v,w) in times){
            edges.computeIfAbsent(u){ mutableListOf()}.add(Pair(v,w))
        }
        val pq = PriorityQueue<Pair<Int,Int>>(compareBy {it.first})
        pq.offer(Pair(0,k))
        val visited = HashSet<Int>()
        var t = 0

        while(pq.isNotEmpty()){
            val (time,node) = pq.poll()
            if(node in visited) continue

            visited.add(node)
            t = time

            edges[node]?.forEach{ (nextNode,weight) ->
                if(nextNode !in visited){
                    pq.offer(Pair(time+weight,nextNode))
                }

            }
        }
        return if(visited.size == n) t else -1

    }
}
