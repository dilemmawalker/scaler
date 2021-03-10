public class Solution {
    public String solve(int[] arr) {
        int n=arr.length;
        long sum=0l;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        if((sum & (1<<0))==0)
        return "Yes";
        else
        return "No";
    }
}
