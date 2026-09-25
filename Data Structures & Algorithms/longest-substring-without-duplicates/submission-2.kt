class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val seenCharToIndex = hashMapOf<Char,Int>()
        var leftPointer = 0
        var rightPointer = 0
        var largestSubString = 0
        while(rightPointer < s.length){
            // add to hash if not seen
            val letter = s[rightPointer]
            if(seenCharToIndex[letter] == null){
                seenCharToIndex[letter] = rightPointer
                rightPointer++
            } else {
                largestSubString = Integer.max(largestSubString,(rightPointer ) - leftPointer)
                val rightLetter = s[rightPointer]
               
                while(s[leftPointer] != rightLetter){
                    seenCharToIndex.remove(s[leftPointer])
                    leftPointer++
                }
                 if(s[leftPointer] == rightLetter){
                    seenCharToIndex.remove(s[leftPointer])
                    leftPointer++
                }
                
            }
        }
        return Integer.max( largestSubString,rightPointer - leftPointer)

    }
}
