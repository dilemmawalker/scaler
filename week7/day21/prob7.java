public class Solution {                 //MaxMod
    public int solve(int[] arr) {
        int n=arr.length;
        int max=0,max2=0;
        for(int i=0;i<n;i++){
            int a=arr[i];
            max=Math.max(max,a);
        }
        for(int i=0;i<n;i++){
            int a=arr[i];
            if(a!=max)
            max2=Math.max(max2,a);
        }
        return max2;
    }
}
