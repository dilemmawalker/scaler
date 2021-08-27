public class Solution {                 //Sum the Difference
    public int solve(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        long sum1=0l,sum2=0l;
        int mod=(int)Math.pow(10,9)+7;
        for(int i=0;i<n;i++){
            int a=arr[i];
            long val=power(2,i,mod);
            // int val=(int)Math.pow(2,i);
            val--;
            long v=0l;
            v=(val*a*1l + mod)%mod;
            sum1=(sum1+v+mod)%mod;
            long vv=0l;
            vv=(val*arr[n-i-1]*1l + mod)%mod;
            sum2=(sum2+vv+mod)%mod;
        }
        return (int)((sum1-sum2+mod)%mod);
    }
    public long power(int x,int y,int mod){
        x%=mod;
        long val=1l;
        while(y-->0){
           val=(val*x*1l + mod)%mod;
        }
        return val;
    }
}
