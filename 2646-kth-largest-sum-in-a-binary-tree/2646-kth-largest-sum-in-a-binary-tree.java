/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {
        List<Long> sumList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        
        if(root == null) return -1;
        queue.offer(root);
        while(!queue.isEmpty()) {
            int levelLen = queue.size();
            long sum = 0;
            for(int i=0; i<levelLen; i++) {
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                sum += (long)queue.poll().val;
            }
            sumList.add(sum);
        }
        Collections.sort(sumList);
        return k>sumList.size() ? -1 : sumList.get(sumList.size()-k);
        
    }

   
}