public class Solution {
    public int solve(int a, int b) {
        int m=b;
        b=b-2;
        if(b==0){
            // if(a==0)
            // return 0;
        return 1;
        }
        return sol(a,b,m);
    }

    public int sol(int a,int b,int m){

        if(b==1){
            return a%m;
        }
        long aa=0l;
        int ans=sol(a,b/2,m);
        if(b%2==0){
            aa=(ans%m*ans%m)%m;
        }
        else{
            aa=(ans%m*(ans%m*a%m)%m)%m;
        }
        return (int)(aa%m);
    }
}
