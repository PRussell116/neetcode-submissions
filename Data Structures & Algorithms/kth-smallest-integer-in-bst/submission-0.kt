/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    private var currentSmallest = 0
    private var res = 0
    fun kthSmallest(root: TreeNode?, k: Int): Int {
        currentSmallest = k
        var smallest = k

        dfs(root)
        
        return res

    }
    fun dfs(node : TreeNode?){
        if(node == null) return
        dfs(node.left)
        if(currentSmallest == 0) return
        
        currentSmallest --
        if(currentSmallest == 0){
            res = node.`val`
            return
        }
        dfs(node.right)
    }
}
