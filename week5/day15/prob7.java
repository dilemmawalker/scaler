public class Solution {
    public int[][] subsetsWithDup(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        ArrayList<ArrayList<Integer>>final_ans=new ArrayList<>();
        // final_ans.add();
        ArrayList<Integer>ans=new ArrayList<>();
        boolean []vis=new boolean[n];
        solve(arr,0,ans,final_ans,vis);
        n=final_ans.size();
        int m=arr.length;
        int[][]anss=new int[n][m];
        for(int i=0;i<n;i++){
            m=final_ans.get(i).size();
            anss[i]=new int[m];
            for(int j=0;j<m;j++){
                anss[i][j]=final_ans.get(i).get(j);
            }
        }
        return anss;
    }

    public void solve(int[]arr,int idx,ArrayList<Integer>ans,ArrayList<ArrayList<Integer>>final_ans,boolean[]vis){
        int n=arr.length;
        
        ArrayList<Integer>temp=new ArrayList<>();
        temp.addAll(ans);
        final_ans.add(temp);

       if(idx==n)
       return;

       for(int i=idx;i<n;i++){
           if(i==0 || (arr[i]!=arr[i-1]) || (vis[i-1])){
           ans.add(arr[i]);
           vis[i]=true;
           solve(arr,i+1,ans,final_ans,vis);
           vis[i]=false;
           ans.remove(ans.size()-1);
           }
       }

    }
}
