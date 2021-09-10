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
public class Solution {                         //Preorder Traversal
    public int[] preorderTraversal(TreeNode root) {
        ArrayList<Integer>arr=new ArrayList<>();
        sol(root,arr);
        int n=arr.size();
        int[]ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=arr.get(i);
        }
        return ar;
    }
    public void sol(TreeNode root,ArrayList<Integer>arr){
        if(root==null)
        return;

        arr.add(root.data);
        sol(root.left,arr);
        sol(root.right,arr);
    }
}
