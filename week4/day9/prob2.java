public class Solution {
    public int gcd(int a, int b) {
        long sum=0l;
        sum=a+b;
        a=Math.max(a,b);
        b=(int)(sum-a);

        return sol(a,b);
    }
    public int sol(int a,int b){
        if(b==0)
        return a;

        return sol(b,a%b);
    }
}
