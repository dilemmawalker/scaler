public class Solution {
    public int cntBits(int[] arr) {
        int n=arr.length;
        long sum=0;
        int mod=(int)Math.pow(10,9)+7;
        for(int i=0;i<n-1;i++){
            int c=0;
            int a=arr[i];
            int b=arr[i+1];
            for(int j=0;j<32;j++){
                int mask=(1<<j);
                if((a & mask)!=(b & mask))
                c++;
            }
            sum+=c;
            sum%=mod;
        }
        return sum;
    }
}
