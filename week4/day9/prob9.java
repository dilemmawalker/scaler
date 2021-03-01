public class Solution {
    public int solve(int[] arr) {
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int a=arr[i];
            min=Math.min(min,a);
            max=Math.max(max,a);
        }
        int ans=arr[0];
        for(int i=1;i<n;i++){
            int a=arr[i];
            // if(a==min)
            // continue;
            int sum=ans+a;
            int ma=Math.max(ans,a);
            int mi=sum-ma;

        int s= gcd(ma,mi);
        ans=s;
        }
        // if(ans==Integer.MAX_VALUE)
        // ans=arr[0];
        return ans;
    }
    public int gcd(int a,int b){
        if(b==0)
        return a;

        return gcd(b,a%b);
    }
}
