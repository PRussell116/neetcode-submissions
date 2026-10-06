class PrefixTree {
    val treeMap:TreeNode = TreeNode('a') 

    fun insert(word: String) {
        var currentMap = treeMap
        
        for((index,letter) in word.withIndex()){
            currentMap.followingLetters.putIfAbsent(letter,TreeNode(letter))
            currentMap = currentMap.followingLetters[letter]!!
        }
        currentMap.isEnd = true
    }
 

    fun search(word: String): Boolean {
        println("searching $word")
        var currentMap = treeMap

        for(letter in word){
            println("letter $letter")
            if(currentMap.followingLetters.contains(letter)){
                //println("current map is ${currentMap.keys}")
                currentMap = currentMap.followingLetters[letter]!!
            }else{
                println("does not contain $letter")
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
    val nodeValue: Char,
    val followingLetters: HashMap<Char,TreeNode> = hashMapOf(),
    var isEnd: Boolean = false
){


}
