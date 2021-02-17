public class Solution {
    public int pow(int a, int b, int c) {
        if(a==0)
        return 0;

        if(b==0)
        return 1;

        a=a%c;
        // int n=(int)Math.pow(10,9)+7;
       a=(int)(solve(a,b,c)%c); 
        // a=(int)(Math.pow(a,b)%c);
        while(a<0){
            a+=c;
            a%=c;
        }
        return a%c;
    }
    public static long solve(long a,long b,long c){
        if(b==0)
        return 1;

        if(b==1)
        return a;

        long ans=1;
        long aa=0l;
        aa=solve(a,b/2,c)%c;
        if(b%2==0){
            ans=(aa*aa)%c;
        }
        else{
            ans=(((aa*aa)%c)*a)%c;
        }

        return ans%c;
    }
}
