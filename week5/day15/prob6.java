public class Solution {
    public int[][] combine(int a, int b) {
        ArrayList<ArrayList<Integer>>final_ans=new ArrayList<>();
        ArrayList<Integer>ans=new ArrayList<>();
        solve(a,b,1,ans,final_ans);
        int n=final_ans.size();
        int m=n;
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
    public void solve(int a,int b,int idx,ArrayList<Integer>ans,ArrayList<ArrayList<Integer>>final_ans){
        if(ans.size()==b){
            ArrayList<Integer>temp=new ArrayList<>();
            temp.addAll(ans);
            final_ans.add(temp);
            return;
        }
        if(idx==a+1){
            return;
        }

        for(int i=idx;i<=a;i++){
            ans.add(i);
            solve(a,b,i+1,ans,final_ans);
            ans.remove(ans.size()-1);
        }

    }
}
