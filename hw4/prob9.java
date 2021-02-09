public class Solution {
    public int solve(int[] arr) {
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int a=arr[i];
            min=Math.min(min,a);
            max=Math.max(max,a);
        }
        int c=0;
        for(int i=0;i<n;i++){
            int a=arr[i];
            if(a==min || a==max){
                c++;
            }
        }
        return (n-c);
    }
}
