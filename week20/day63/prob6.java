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
public class Solution {      //same as previous                   //Serialize Binary Tree
    public int[] solve(TreeNode root) {
       ArrayList<ArrayList<Integer>>arr=new ArrayList<>();
        sol(root,arr,0);
        int n=arr.size();
        int s=0;
        int c=0;
        for(int i=0;i<n;i++){
            c+=arr.get(i).size();
        }
        int[]ar=new int[c];
        int idx=0;
        for(int i=0;i<n;i++){
            int m=arr.get(i).size();
            for(int j=0;j<m;j++){
                ar[idx++]=arr.get(i).get(j);
            }
        }
        return ar;
    }
    public void sol(TreeNode root,ArrayList<ArrayList<Integer>>arr,int idx){

        ArrayList<Integer>temp=new ArrayList<>();
        if(idx<arr.size())
        temp=arr.remove(idx);
        
        if(root==null){
            temp.add(-1);
            arr.add(idx,temp);
        return;
        }

        temp.add(root.val);
        arr.add(idx,temp);

        sol(root.left,arr,idx+1);
        sol(root.right,arr,idx+1);
    }
}
