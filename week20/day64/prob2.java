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
public class Solution {                         //Invert the Binary Tree
    public TreeNode invertTree(TreeNode root) {
        sol(root);
        return root;
    }
    public void sol(TreeNode root){
        if(root==null)
        return;

        sol(root.left);
        sol(root.right);
        if(root.left!=null && root.right!=null){
            TreeNode temp=root.left;
            root.left=root.right;
            root.right=temp;
        }
    }
}
