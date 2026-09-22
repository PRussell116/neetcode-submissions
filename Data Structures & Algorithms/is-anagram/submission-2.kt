class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s == t) return true
        if(s.length != t.length) return false

        val sHashMap = hashMapOf<Char,Int>()

        for(letter in s){
            val letterCount = sHashMap[letter]
            if(letterCount == null){
                sHashMap[letter] = 1
            } else{
                sHashMap[letter] = letterCount + 1
            }
        }

        for(letter in t){
            val letterCount = sHashMap[letter]
            if(letterCount == null) return false

            val newCount = letterCount -1
            if(newCount == 0){
                sHashMap.remove(letter)
            } else{
                sHashMap[letter] = newCount
            }
            
        }
        return true



    }
}
