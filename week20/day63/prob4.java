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
public class Solution {                     //Level Order
    public int[][] levelOrder(TreeNode A) {
        ArrayList<ArrayList<Integer>>arr=new ArrayList<>();
        sol(A,arr,0);
        int n=arr.size();
        int[][]ar=new int[n][];
        for(int i=0;i<n;i++){
            ArrayList<Integer>temp=arr.get(i);
            int m=temp.size();
            ar[i]=new int[m];
            for(int j=0;j<m;j++){
                ar[i][j]=temp.get(j);
            }
        }
        return ar;
    }
    public void sol(TreeNode root,ArrayList<ArrayList<Integer>>arr,int idx){
        if(root==null)
        return;

        ArrayList<Integer>temp=new ArrayList<>();
       
        if(idx<arr.size()){
            temp=arr.remove(idx);
        }
        ArrayList<Integer>t=new ArrayList<>();
        t.addAll(temp);
        t.add(root.val);
        arr.add(idx,t);

        sol(root.left,arr,idx+1);
        sol(root.right,arr,idx+1);
    }
}
