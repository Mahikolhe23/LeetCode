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
        List<Integer> list= new ArrayList<>();
        return add(list,root);
    }
    public List<Integer> add(List<Integer> list,TreeNode node){
        if(node==null)
            return list;
        add(list,node.left);
        add(list,node.right);
        list.add(node.val);
        return list;
    }
}