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
    public boolean isPalindrome(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = reverseLinkList(slow.next);
        slow = slow.next;
        while(slow!=null) {
            if(head.val != slow.val) {
                return false;
            }
            slow=slow.next;
            head = head.next;
        }

        return true;
      
      
    }
    ListNode reverseLinkList(ListNode cur) {
        ListNode pre = null, nex = null;
        while(cur != null) {
            nex = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nex;
        }

        return pre;
    }
}