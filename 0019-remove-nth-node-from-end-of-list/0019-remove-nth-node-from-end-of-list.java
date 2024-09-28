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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode dum = head;
        while(dum!=null) {
            size++;
            dum = dum.next;
        }
         if(size == n) {
            return head.next;
        }
        int indes = 0;
        dum = head;
        for(int i=0; i<size-n; i++) {
            if(i == size -n - 1) {
                
                dum.next = dum.next.next;
            }else {
            dum = dum.next;
            }
        }
        return head;
    }
}