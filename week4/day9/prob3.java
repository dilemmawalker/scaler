public class Solution {
    public int cpFact(int a, int b) {
        if(a==1)
        return 1;

        while(gcd(a,b)!=1){
            a=a/gcd(a,b);
        }
        return a;
    }
    public int gcd(int a,int b){
        if(b==0)
        return a;

        return gcd(b,a%b);
    }
}
