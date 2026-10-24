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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> trav = new ArrayList<>();
        recur(root, trav);
        return trav;
    }
    public void recur(TreeNode root, List<Integer> trav) {
        if(root==null) {
            return;
        }
        recur(root.left, trav);
        trav.add(root.val);
        recur(root.right, trav);
    }
}