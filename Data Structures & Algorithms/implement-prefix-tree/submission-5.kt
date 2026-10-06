class PrefixTree {
    val treeMap:TreeNode = TreeNode() 

    fun insert(word: String) {
        var currentMap = treeMap
        
        for(letter in word){
            currentMap.followingLetters.putIfAbsent(letter,TreeNode())
            currentMap = currentMap.followingLetters[letter]!!
        }
        currentMap.isEnd = true
    }
 

    fun search(word: String): Boolean {
        var currentMap = treeMap
        for(letter in word){
            if(currentMap.followingLetters.contains(letter)){
                currentMap = currentMap.followingLetters[letter]!!
            }else{
                return false
            }
        }
        return currentMap.isEnd
        
 
    }

    fun startsWith(prefix: String): Boolean {
        var currentMap = treeMap.followingLetters

        for(letter in prefix){
            if(currentMap.contains(letter)){
                currentMap = currentMap[letter]!!.followingLetters
            }else{
                return false
            }
        }
        return true

    }
}
class TreeNode(
    val followingLetters: HashMap<Char,TreeNode> = hashMapOf(),
    var isEnd: Boolean = false
){


}
