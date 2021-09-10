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
public class Solution {                     //Inorder Traversal
    public int[] inorderTraversal(TreeNode root) {
        ArrayList<Integer>ar=new ArrayList<>();
        sol(root,ar);
        int n=ar.size();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ar.get(i);
        }
        return arr;
    }
    public void sol(TreeNode root,ArrayList<Integer>arr){
        if(root==null)
        return;

        sol(root.left,arr);
        arr.add(root.val);
        sol(root.right,arr);
    }
}
