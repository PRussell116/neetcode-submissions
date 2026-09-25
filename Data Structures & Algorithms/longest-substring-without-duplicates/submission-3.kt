class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val seenCharToIndex = hashSetOf<Char>()
        var leftPointer = 0
        var rightPointer = 0
        var largestSubString = 0
        while(rightPointer < s.length){
            // add to hash if not seen
            val letter = s[rightPointer]
            if(!seenCharToIndex.contains(letter)){
                seenCharToIndex.add(letter)
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
