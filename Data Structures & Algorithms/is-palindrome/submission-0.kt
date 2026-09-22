class Solution {
    fun isPalindrome(s: String): Boolean {
        var endIndex = s.length
        for((index,letter) in s.withIndex()){
            if(!letter.isLetterOrDigit()) continue
            endIndex--


            while(!s.get(endIndex).isLetterOrDigit() && endIndex > 0){
                endIndex--
            }

            println("${letter.lowercase()} ${s.getOrNull(endIndex)} end index $endIndex")

            if(index == endIndex) return true

            if(letter.lowercase() != s.getOrNull(endIndex)?.lowercase()){
                return false


            } 

        }
        return true

    }
}
