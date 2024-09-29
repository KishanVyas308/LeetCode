/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode sNode = head;
        ListNode fNode = head;

        while(fNode != null && fNode.next != null) {
            sNode = sNode.next;
            fNode = fNode.next.next;
            if(sNode == fNode) break;
        }
        if(fNode == null || fNode.next == null) return null;

        while(head != sNode){
            sNode = sNode.next;
            head = head.next;
        }

        return head;
    }
}