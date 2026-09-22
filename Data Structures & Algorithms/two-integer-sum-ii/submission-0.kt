class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var frontPointer = 0
        var endPointer = numbers.size - 1

        while(frontPointer < endPointer){
            val sum = numbers[frontPointer] + numbers[endPointer]
            if(sum == target){
                return intArrayOf(frontPointer+1,endPointer+1)

            } else if(sum > target){
                endPointer--
            } else {
                frontPointer ++

            }
        }
        return intArrayOf(0,0)

    }
}
