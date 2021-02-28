public class Solution {
    public int solve(int a, int b, int c) {
        int sum=b+c;
        b=Math.max(b,c);
        c=sum-b;
        int sol=gcd(b,c);

        int lcm=(b*c)/sol;

        if(lcm==1)
        return 0;

        return a/lcm;
    }
    public int gcd(int a,int b){
        if(b==0)
        return a;

        return gcd(b,a%b);
    }
}
