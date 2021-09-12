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
public class Solution {                             //Left view
    public int[] solve(TreeNode root) {
       ArrayList<ArrayList<Integer>>arr=new ArrayList<>();
        sol(root,arr,0);
        int n=arr.size();
        int s=0;
        int[]ar=new int[n];
        
        for(int i=0;i<n;i++){
           ar[i]=arr.get(i).get(0);
        }
        return ar;
    }
    public void sol(TreeNode root,ArrayList<ArrayList<Integer>>arr,int idx){
         if(root==null){
            return;
        }

        ArrayList<Integer>temp=new ArrayList<>();
        if(idx<arr.size())
        temp=arr.remove(idx);
        
        temp.add(root.val);
        arr.add(idx,temp);

        sol(root.left,arr,idx+1);
        sol(root.right,arr,idx+1);
    }
}
