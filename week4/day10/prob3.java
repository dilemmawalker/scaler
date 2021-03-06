public class Solution {
    public int solve(int[] arr) {
        int n=arr.length;
        int gcd=arr[0];
        int ma=0;
        int cz=0;
        for(int i=0;i<n;i++){
            int a=arr[i];
            if(a==0){
                cz++;
            continue;
            }
            int max=Math.max(a,gcd);
            int min=Math.min(a,gcd);
            gcd=gc(max,min);
            ma=Math.max(ma,a);
        }
        if(ma==0)
        return n;
        return (int)(ma/gcd)+cz;
    }
    public int gc(int a,int b){
        if(b==0)
        return a;

        return gc(b,a%b);
    }
}
