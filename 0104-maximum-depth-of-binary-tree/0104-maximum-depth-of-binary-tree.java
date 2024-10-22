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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return findMh(root, 0, 0);

    }  
    int findMh(TreeNode root, int curh, int mh) {
        if(root == null) return curh;
        int val1 = findMh(root.left, curh+1, mh);
       
        if(val1 > mh) mh = val1;
        val1 = findMh(root.right, curh+1, mh);
  
        if(val1 > mh) mh = val1;
        return mh;
    }   
}