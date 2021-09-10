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
public class Solution {         //Tree Height
    public int solve(TreeNode A) {
        return sol(A);
    }
    public int sol(TreeNode root){
        if(root==null)
        return 0;
        
        return Math.max(sol(root.left),sol(root.right))+1;
    }
}
