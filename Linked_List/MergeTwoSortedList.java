/**
Ques.---> 21

Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes of the first two lists.

 

Example 1:

Input: l1 = [1,2,4], l2 = [1,3,4]
Output: [1,1,2,3,4,4]

Example 2:

Input: l1 = [], l2 = []
Output: []

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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode tempNode = new ListNode(-1);
        ListNode head = tempNode;       // saving the refrence of head i.e for not loosing the regference
        
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                tempNode.next = l1;
                l1 = l1.next;
                
                
            }else{
                tempNode.next = l2;
                l2 = l2.next;
                
            }
             tempNode = tempNode.next;
           
        }
       
         if(l1 != null){
                tempNode.next = l1;
            }else{
                tempNode.next = l2;
            }
            
        return head.next;
        
    }
}
