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
    int max=0;
    public int maxPathSum(TreeNode root) {
        max=root.val;
        getMax(root);
        return max;
    }
    private int getMax(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=Math.max(getMax(root.left),0);
        int right=Math.max(getMax(root.right),0);
        max=Math.max(max,left+right+root.val);
        return Math.max(left+root.val,right+root.val);
    }
}