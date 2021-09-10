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
public class Solution {                 //Nodes Max
    public int solve(TreeNode root) {
        if(root==null)
        return Integer.MIN_VALUE;

        return Math.max(Math.max(solve(root.left),solve(root.right)),root.val);
    }
}
