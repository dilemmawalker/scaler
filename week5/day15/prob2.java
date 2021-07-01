public class Solution {    
    //without using hashmap, just sort & check if previous is same as current, 
    // then previous should be marked as true(means it should be in same recursion),
    // only then allow further calls in same stack.
    
    public int[][] permute(int[] arr) {
        Arrays.sort(arr);
        int size=arr.length;
        
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        solve(arr,0,new ArrayList<Integer>(),ans);

        int n=ans.size();
         int m=arr.length;
         int[][]anss=new int[n][m];
         for(int i=0;i<n;i++){
             for(int j=0;j<m;j++){
                 anss[i][j]=ans.get(i).get(j);
             }
         }
         return anss;

    }
    public static void solve(int[]arr,int idx,ArrayList<Integer>ar,ArrayList<ArrayList<Integer>>ans){
        int n=arr.length;
        if(idx==n){
            ArrayList<Integer>temp=new ArrayList<>();
            for(int i=0;i<ar.size();i++){
                temp.add(ar.get(i));
            }
            ans.add(temp);
            return;
        }

        for(int i=0;i<n;i++){
            if(arr[i]!=Integer.MAX_VALUE && (i==0 || (arr[i]!=arr[i-1]) || arr[i-1]==Integer.MAX_VALUE)){
                ar.add(arr[i]);
                int val=arr[i];
                arr[i]=Integer.MAX_VALUE;
                solve(arr,idx+1,ar,ans);
                ar.remove(ar.size()-1);
                arr[i]=val;
            }
        }

    }
}
