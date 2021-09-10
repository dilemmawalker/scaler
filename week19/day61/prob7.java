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
       return sol(root,0);
    }
    public int sol(TreeNode root,int ans){
        if(root==null)
        return 0;

        int a=sol(root.right);
        int b=sol(root.left);
        ans=Math.max(ans,a+b+2);
        return a+b+1;
    }
}
