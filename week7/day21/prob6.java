public class Solution {
    public int solve(int[] arr) {
        int n=arr.length;
        int max=0;
        int sum=0;
        for(int i=0;i<n;i++){
            int a=arr[i];
            max=Math.max(a,max);
            if(max==i)
            sum++;
        }
        return sum;
    }
}
