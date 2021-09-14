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
public class Solution {                         //Balanced Binary Tree
    public int isBalanced(TreeNode root) {
        sol(root);
        return ans;
    }
    public int ans=1;
    public int sol(TreeNode root){
        if(root==null)
        return -1;

        int a=sol(root.left);
        int b=sol(root.right);
        int val=Math.abs(a-b);
        if(val>=2)
        ans=0;
        return Math.max(a,b)+1;
    }
}
