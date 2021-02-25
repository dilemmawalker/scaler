public class Solution {
    public int solve(int a, int b, int c) {
        int s=b+c;
        b=Math.max(b,c);
        c=s-b;
        int x=gcd(b,c);

        return a/x;
    }
    public int gcd(int b,int c){
        if(c==0){
            return b;
        }   

        int a=0;
        a=gcd(c,c%b);

        return a;
    }
}
