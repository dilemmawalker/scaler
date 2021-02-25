public class Solution {
    public int solve(int a, int b) {
        long mod=0l;
        mod=(long)(Math.pow(10,9))+7;
        if(b==1)
        return a;
        
        long s=0l,aa=0l;
         s=fact(b,mod-1);
    // System.out.print(s+" ");
         aa=sol(a,s,mod);
        return (int)(aa%mod);
    }
    
    public long fact(int b,long mod){
        long s=1l;
        for(int i=1;i<=b;i++){
            s=(s*i)%mod;
        }
        return s%mod;
    }

    public long sol(int a,long s,long mod){
        if(s==1)
        return a%mod;
    
    long ans=1l;
        long aa=1l;
        aa=sol(a,s/2,mod);
        if(s%2==0)
        ans=((aa%mod)*(aa%mod))%mod;
        else
        ans=((((aa%mod)*(aa%mod))%mod)*(a%mod))%mod;

        return ans%mod;
    }
}
