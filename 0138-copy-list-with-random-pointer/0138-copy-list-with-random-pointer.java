/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node cur = head, next;

        // adding dummy nodes between List
        while(cur != null) {
            next = cur.next;
            Node copy = new Node(cur.val);
            cur.next = copy;
            copy.next = next;
            cur = next;
        }

        // adding random pointer
        cur = head;
        while(cur != null) {
            if(cur.random != null) {
                cur.next.random = cur.random.next;
            }
            cur = cur.next.next;
        }

        // reastore original List
        cur = head;
        Node copyHead = new Node(0);
        Node copy, copyCur = copyHead;

        while(cur != null) {
            next = cur.next.next;
            
            copy = cur.next;
            copyCur.next = copy;
            copyCur = copy;

            cur.next = next;

            cur = next;
        }

        return copyHead.next;
    }
}