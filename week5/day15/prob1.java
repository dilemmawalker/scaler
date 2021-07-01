public class Solution {   ///bekaar, put all ans in hashset & then automatically we get 
                            //non repeated ans.....not a great soln!!!
    public int[][] permute(int[] arr) {
        ArrayList<Integer>ar=new ArrayList<>();
        ArrayList<ArrayList<Integer>>final_ans=new ArrayList<>();
        solve(arr,0,ar,final_ans);

        int n=final_ans.size();
         int m=arr.length;
         int[][]anss=new int[n][m];
         for(int i=0;i<n;i++){
             for(int j=0;j<m;j++){
                 anss[i][j]=final_ans.get(i).get(j);
             }
         }
         return anss;
    }

    public static void solve(int[]arr,int idx,ArrayList<Integer>ar,ArrayList<ArrayList<Integer>>final_ans){
        int n=arr.length;
        if(idx==n){
            ArrayList<Integer>temp=new ArrayList<>();
            for(int j=0;j<ar.size();j++){
                temp.add(ar.get(j));
            }
            final_ans.add(temp);
            return;
        }

    HashSet<Integer>map=new HashSet<>();
        for(int i=0;i<n;i++){
            if(arr[i]!=Integer.MAX_VALUE && !map.contains(arr[i])){
                int val=arr[i];
                arr[i]=Integer.MAX_VALUE;
                ar.add(val);
                map.add(val);
                solve(arr,idx+1,ar,final_ans);
                ar.remove(ar.size()-1);
                map.remove(val);
                arr[i]=val;
            }
        }

    }
}
