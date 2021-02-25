public class Solution {
    public int solve(int a) {
        long s=0l;

        int mod=(int)Math.pow(10,9)+7;

        int no=a;
        int c=0;
        while(no>0){
            c++;
            no/=10;
        }

        for(int i=1;i<=c;i++){
            long aa=0l;
            aa=(long)Math.pow(10,i);
            long bb=0l;
            bb=aa/10;

            s=(s+(((a/aa)*bb)%mod + (Math.min(Math.max(a%aa-bb+1,0),bb))%mod)%mod)%mod;
        }

        return (int)(s%mod);
    }
}
