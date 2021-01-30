// Ques. 61
/**
Given the head of a linked list, rotate the list to the right by k places.

 

Example 1:

Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]


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
    public ListNode rotateRight(ListNode head, int k) {
       // edge cases
        if(head == null || head.next == null || k == 0)
            return head;
        
    // cumputing the length of the linked list
        
        ListNode currentNode = head;
        int lengthCount =1;
        while(currentNode.next != null){
            lengthCount ++;
             currentNode =  currentNode.next;
        }
        // go till that node
        currentNode.next = head;
        k = k % lengthCount;
        k = lengthCount - k;
        while(k-->0)
             currentNode = currentNode.next;
        
        
    // making the node head  & break the connection
        head = currentNode.next;
        currentNode.next = null;
        
        
        return head;
            
        
    }
}
