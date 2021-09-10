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
public class Solution {                         //Odd and Even Levels
    public int solve(TreeNode root) {
        
        sol(root,1);
        return odd-even;
    }
    public int odd=0,even=0;
    public void sol(TreeNode root,int l){
        if(root==null)
        return;

        if(l%2!=0){
            odd+=root.val;
        }
        else
        even+=root.val;

        sol(root.left,l+1);
        sol(root.right,l+1);
    }
}
