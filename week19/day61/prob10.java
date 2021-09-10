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
public class Solution {                         //Identical Binary Trees
    public int isSameTree(TreeNode a, TreeNode b) {
        sol(a,b);
        return ans;
    }
    public int ans=1;
    public void sol(TreeNode a, TreeNode b){
        if(a==null && b==null)
        return;

        if((a==null && b!=null) || (a!=null && b==null) || (a.val!=b.val)){
            ans=0;
            return;
        }

        sol(a.left,b.left);
        sol(a.right,b.right);
    }
}
