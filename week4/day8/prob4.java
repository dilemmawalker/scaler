public class Solution {
    public int solve(int[] arr, int b) {
        int n=arr.length;
        int c=0;
        for(int i=0;i<n;i++){
            arr[i]=arr[i]%b;
        }

        long[]ans=new long[b];
        for(int i=0;i<n;i++){
            int a=arr[i];
            ans[a]++;
        }

        int p2=b-1;
        int p1=1;
        long anss=0l;
        int mod=(int)Math.pow(10,9)+7;
        while(p1<p2){
            anss=(anss+(ans[p1]*ans[p2])%mod)%mod;
            p1++;
            p2--;
            anss%=mod;
        }

        if(b%2==0 && ans[b/2]>=2){
            long bb=1l;
            
            bb=(ans[b/2]*(ans[b/2]-1))%mod;
            bb/=2;
            bb%=mod;
            anss=(anss+(bb%mod))%mod;
            anss%=mod;
        }
        if(ans[0]>=2){  
            long bb=1l;
            
            bb=(ans[0]*(ans[0]-1))%mod;
            bb/=2;
            bb%=mod;
            anss=(anss+(bb%mod))%mod;
            anss%=mod;
        }
        int z=(int)(anss%mod);
        return z;
    }
}
