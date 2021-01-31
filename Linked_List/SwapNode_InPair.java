// Ques.  24
/**
Given a linked list, swap every two adjacent nodes and return its head.
Input: head = [1,2,3,4]
Output: [2,1,4,3]


**/



/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
         ListNode tempNode = new ListNode(-1);
        tempNode.next = head;
        ListNode prev = tempNode;
        while(prev.next!=null && prev.next.next!=null){
            ListNode current = prev.next;
            ListNode forward = current.next;
            ListNode temp = forward.next;
            
            prev.next = forward;
            forward.next = current;
            current.next= temp;
            
            prev = current;
        } 
            return tempNode.next;
    }
        
}
