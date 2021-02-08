public class Solution {
    public int solve(int[] A) {
        int n=A.length;

        long c=0l;
        long[]arr=new long[n];
        for(int i=0;i<n;i++){
            c+=A[i];
            arr[i]=c;
            if(c==0)
            return 1;
        }
        HashMap<Long,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            long a=0l;
             a=arr[i];
            // if(a==0)
            // return 1;

            if(map.containsKey(a))
            return 1;
            else
            map.put(a,0);
        }
        return 0;
    }
}
