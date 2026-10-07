/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        
        var list1Node = list1
        var list2Node = list2
        val head = ListNode(-1)
        var node: ListNode? = head
        while(list1Node != null && list2Node != null){
            if(list1Node.`val` < list2Node.`val`){
                node?.next = list1Node
                list1Node = list1Node.next
            } else {
                node?.next = list2Node
                list2Node = list2Node.next
            }
            node = node?.next
        }
        node?.next = list1Node?:list2Node

        return head.next

    }
}
