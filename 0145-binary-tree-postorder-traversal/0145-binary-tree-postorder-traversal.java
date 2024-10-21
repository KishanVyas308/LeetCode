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
    public List<Integer> postorderTraversal(TreeNode root) {
        return post(root, new ArrayList<Integer>());
    }

    List<Integer> post(TreeNode root, List<Integer> li){
        if(root == null) return li;
        post(root.left, li);
        post(root.right, li);
        li.add(root.val);
        return li;
    }
}