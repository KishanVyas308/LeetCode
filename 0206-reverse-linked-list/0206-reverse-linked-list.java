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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode pre = null;
        ListNode cur = head;
        ListNode dum = head.next;

        while(cur != null) {
            
            cur.next = pre;
            pre = cur;
            cur = dum;
            if(dum != null)
            dum = dum.next;

        }
        return pre;
    }
}