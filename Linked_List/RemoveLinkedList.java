// Remove all elements from a linked list of integers that have value val.

// Example:

// Input:  1->2->6->3->4->5->6, val = 6
// Output: 1->2->3->4->5



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
    public ListNode removeElements(ListNode head, int val) {
    
        ListNode tempHead = new ListNode(-1);
        tempHead.next = head;
         ListNode currentNode = head,prevNode = tempHead;
        while(currentNode != null){   // checking the currentNode is not the next last node
            if(currentNode. val == val){     
                prevNode. next = currentNode.next;
            }else
                prevNode = currentNode;   // update the prevNode 
            currentNode = currentNode.next; // update the currenNode to its next
        }
        return tempHead.next;
    }
}
