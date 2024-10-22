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
    public boolean isBalanced(TreeNode root) {
        return check(root) == -1 ? false : true;
    }

    int check(TreeNode root) {
        if (root == null) return 0;
        int lval = check(root.left);
        int rval = check(root.right);
        if(lval == -1 || rval == -1) return -1;
        if(Math.abs(lval -rval) > 1) return -1;
        return Math.max(lval , rval)+1;
    }
}