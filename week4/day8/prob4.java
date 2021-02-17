public class Solution {
    public int solve(int[] arr, int b) {
        int n=arr.length;
        int c=0;
        for(int i=0;i<n;i++){
            arr[i]=arr[i]%b;
        }

        int[]ans=new int[b];
        for(int i=0;i<n;i++){
            int a=arr[i];
            ans[a]++;
        }

        int p2=b-1;
        int p1=1;
        int anss=0;
        int mod=(int)Math.pow(10,9)+7;
        while(p1<p2){
            anss+=(ans[p1]*ans[p2])%mod;
            p1++;
            p2--;
            anss%=mod;
        }

        if(b%2==0 && ans[b/2]>=2){
            // anss+=(((ans[b/2]*(ans[b/2]-1))/2))%mod;
            int bb=1;
            for(int i=ans[b/2];i>1;i--){
                bb*=i;
                bb%=mod;
            }
            bb/=2;
            anss+=bb;
            anss%=mod;
        }
        if(b%2==0 && ans[0]>=2){
            // anss+=(((ans[0]*(ans[0]-1))/2))%mod;
            int bb=1;
            for(int i=ans[0];i>1;i--){
                bb*=i;
                bb%=mod;
            }
            bb/=2;
            anss+=bb;
            anss%=mod;
        }

        return anss%mod;
    }
}
