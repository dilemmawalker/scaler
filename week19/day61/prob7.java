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
public class Solution {                 //diameter
    public int solve(TreeNode root) {
        sol(root);
        return ans;
    }
    public int ans=-1;
    public int sol(TreeNode root){
        if(root==null)
        return -1;

        int a=sol(root.right);
        int b=sol(root.left);
        ans=Math.max(ans,a+b+2);
        return Math.max(a,b)+1;
    }
}
