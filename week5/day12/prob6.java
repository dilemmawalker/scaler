public class Solution {
    public int cntBits(int[] arr) {
        int n=arr.length;
        long ans=0;
        int mod=((int)Math.pow(10,9))+7;
        for(int i=0;i<32;i++){
            int c=0;
            int mask=(1<<i);
            for(int j=0;j<n;j++){
                int ele=arr[j];
                if((ele & mask)!=0)
                c++;
            }
            ans+=2*1l*c*1l*(n-c);
            ans%=mod;
        }
        return (int)ans;
    }
}
