/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null)
            return new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> li = new ArrayList<>();
        queue.add(root);
        boolean LtoR = true;
        while (!queue.isEmpty()) {
            int len = queue.size();
            List<Integer> subli = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                TreeNode temp = queue.poll();
                 if (LtoR) {
                    subli.add(temp.val);
                } else {
                    subli.add(0, temp.val);
                }
                if (temp.left != null)
                    queue.add(temp.left);
                if (temp.right != null)
                    queue.add(temp.right);
            }
            LtoR = !LtoR;
            li.add(subli);
        }
        return li;
    }
}