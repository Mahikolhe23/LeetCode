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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null)
			return list;
		TreeNode temp = root;
		Stack<TreeNode> stack = new Stack<>();
		while (temp != null || !stack.isEmpty()) {
			while (temp != null) {
				list.add(temp.val);
				stack.push(temp);
				temp = temp.left;
			}
			temp = stack.pop().right;
		}
		return list;
    }
}