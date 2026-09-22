class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        
        val res = HashMap<List<Int>,MutableList<String>>()
        for(str in strs){
            val count = MutableList(26) {0}
            for(letter in str){
                count[letter -'a']++
            }
            res.getOrPut(count){mutableListOf()}.add(str)

        }
        return res.values.toList()
     


    }
}
