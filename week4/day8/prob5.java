public class Solution {
    public int solve(int a, int b) {
        long temp=0l;
         temp=a+b;
        a=Math.max(a,b);
        b=(int)(temp-a);
       
        if(a==b)
        return a;

        return a-b;
    }
    
}
