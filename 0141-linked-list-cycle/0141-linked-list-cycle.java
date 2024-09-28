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
    public boolean hasCycle(ListNode head) {
        ListNode snode = head;
        ListNode fnode = head;

        while(fnode != null && fnode.next != null) {
            snode = snode.next;
            fnode = fnode.next.next;
            if(snode == fnode) {
                return true;
            }
        }
        return false;
    }
}