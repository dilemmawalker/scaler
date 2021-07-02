public class Solution {
    public int[][] permute(int[] arr) {
        int n=arr.length;
        ArrayList<ArrayList<Integer>>final_ans=new ArrayList<>();
        ArrayList<Integer>ans=new ArrayList<>();
        solve(arr,0,final_ans,ans);
        int nn=final_ans.size();
        int mm=final_ans.get(0).size();
        int[][]anss=new int[nn][mm];
        for(int i=0;i<nn;i++){
            for(int j=0;j<mm;j++){
                anss[i][j]=final_ans.get(i).get(j);
            }
        }
        return anss;
    }
    public static void solve(int[]arr,int idx,ArrayList<ArrayList<Integer>>final_ans,ArrayList<Integer>ans){
        int n=arr.length;
        if(idx==arr.length){
            ArrayList<Integer>temp=new ArrayList<>();
            temp.addAll(ans);
            final_ans.add(temp);
            return;
        }

        for(int i=0;i<n;i++){
            if(arr[i]!=Integer.MAX_VALUE){
                int val=arr[i];
                arr[i]=Integer.MAX_VALUE;
                ans.add(val);
                solve(arr,idx+1,final_ans,ans);
                arr[i]=val;
                ans.remove(ans.size()-1);
            }
        }

    }
}
