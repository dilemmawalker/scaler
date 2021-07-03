public class Solution {
    public int[][] subsets(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        ArrayList<ArrayList<Integer>>final_ans=new ArrayList<>();
        // final_ans.add();
        ArrayList<Integer>ans=new ArrayList<>();
        solve(arr,0,ans,final_ans);
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

    public void solve(int[]arr,int idx,ArrayList<Integer>ans,ArrayList<ArrayList<Integer>>final_ans){
        int n=arr.length;
        
        ArrayList<Integer>temp=new ArrayList<>();
        temp.addAll(ans);
        final_ans.add(temp);

       if(idx==n)
       return;

       for(int i=idx;i<n;i++){
           ans.add(arr[i]);
           solve(arr,i+1,ans,final_ans);
           ans.remove(ans.size()-1);
       }

    }
}
