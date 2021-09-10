/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {         //Nodes Sum
    public int solve(TreeNode root) {
        if(root==null)
        return 0;

        return solve(root.left)+solve(root.right)+root.val;
    }
}
