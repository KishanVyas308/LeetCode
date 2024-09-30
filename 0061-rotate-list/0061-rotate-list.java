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
        if(head == null || head.next == null) return head;
        int count = 1;
        ListNode dummy = head;
        while(dummy.next != null) {
            dummy = dummy.next;
            count++;
        }
        k = k % count;
        if(k == 0) return head;

        ListNode cur = head;
        ListNode nex = head;

        for(int i=1; i<(count-k); i++) {
            cur = cur.next;
        }



        nex = cur.next;
      
        cur.next = null;
        dummy.next = head;
        return nex;
    }
}