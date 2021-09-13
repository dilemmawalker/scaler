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
public class Solution {                             //diameter of tree
    public int solve(TreeNode root) {
        sol(root,0);
    }
    public int ans=0;
    public int sol(TreeNode root,int h){
        if(root==null)
        return -1;
        
        int a=sol(root.left,h);
        int b=sol(root.right,h);
        int ans=Math.max(ans,(a+b+2));
        return Math.max(a,b)+1;
    }
}
