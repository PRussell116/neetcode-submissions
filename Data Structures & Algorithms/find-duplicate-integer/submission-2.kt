class Solution {
    fun findDuplicate(nums: IntArray): Int {
        var slowPointer = 0
        var fastPointer = 0
        while(true){
            slowPointer = nums[slowPointer]
            fastPointer = nums[nums[fastPointer]]
            if(slowPointer == fastPointer) break

        }
        var slowPointer2 = 0
        while(true){
            slowPointer = nums[slowPointer]
            slowPointer2 = nums[slowPointer2]
            if(slowPointer == slowPointer2) return slowPointer
        }

    }
}
