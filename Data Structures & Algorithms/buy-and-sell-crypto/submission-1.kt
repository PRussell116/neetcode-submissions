class Solution {
    fun maxProfit(prices: IntArray): Int {
        var leftPointer = 0
        var rightPointer = 0
        var maxProfit = 0
        while(leftPointer < prices.size -1 && rightPointer < prices.size - 1){
            rightPointer++
            if(prices[rightPointer] < prices[leftPointer]){
                leftPointer = rightPointer
            } else {
                val profit = prices[rightPointer] - prices[leftPointer]
                maxProfit = Integer.max(maxProfit,profit)

            }

        }
        return maxProfit

    }
}
