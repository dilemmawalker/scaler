public class Solution {
    public static int[][] permute(int[] arr) {
         solve(arr,0,new ArrayList<Integer>());
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
    public static ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
    public static void solve(int[]arr,int idx,ArrayList<Integer>ar){
        if(idx==arr.length){
            int size=ar.size();
            ArrayList<Integer>arrr=new ArrayList<>();
            for(int i=0;i<size;i++){
                arrr.add(ar.get(i));
            }
            ans.add(arrr);
            return;
        }
        HashSet<Integer>map=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=Integer.MAX_VALUE && !map.contains(arr[i])){
                int val=arr[i];
                map.add(val);
                arr[i]=Integer.MAX_VALUE;
                ar.add(val);
                solve(arr,idx+1,ar);
                ar.remove(ar.size()-1);
                arr[i]=val;
            }
        }
        return;
    }
}
