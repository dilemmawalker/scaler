public class Solution {
    public int solve(int a, int b) {
        int m=b;
        b=b-2;
        if(b==0){
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
            aa=(1l * ans*ans)%m;
        }
        else{
            aa=(1l * ans*((1l*ans*a)%m))%m;
        }
        return (int)(aa%m);
    }
}
