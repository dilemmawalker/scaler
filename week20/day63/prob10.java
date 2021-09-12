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
public class Solution {                     //Top view
    public int[] solve(TreeNode root) {

        calc(root,0);
        int n=order2-order1+1;
        ArrayList<Integer>[]arr=new ArrayList[n];
        ArrayList<Integer>[]depth=new ArrayList[n];
        for(int i=0;i<n;i++){
            arr[i]=new ArrayList<>();
            depth[i]=new ArrayList<>();
        }
        
        order1*=-1;
        sol(root,arr,0,0,depth);
        int[]ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=arr.get(i).get(0);
        }
        return ar;

    }
    public int order1=0,order2=0;
    public void sol(TreeNode root,ArrayList<Integer>[]arr,int idx,int d,ArrayList<Integer>[]depth){
        if(root==null)
        return;

        ArrayList<Integer>temp=new ArrayList<>();
        ArrayList<Integer>temp1=new ArrayList<>();
        temp=arr[idx+order1];//vertical level order
        temp1=depth[idx+order1];//depth

        int pos=d,id=temp1.size()-1;
        while(id>=0 && pos<temp1.get(id)){
            id--;
        }
        id++;
        temp1.add(id,d);
        temp.add(id,root.val);

        arr[order1+idx]=temp;
        depth[order1+idx]=temp1;
        sol(root.left,arr,idx-1,d+1,depth);
        sol(root.right,arr,idx+1,d+1,depth);
    }
    public void calc(TreeNode root,int idx){
        if(root==null)
        return;

        order1=Math.min(order1,idx);
        order2=Math.max(order2,idx);
        calc(root.left,idx-1);
        calc(root.right,idx+1);
    }
}
