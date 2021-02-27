public class Solution {
    public int solve(int[] arr) {
        int n=arr.length;
        int []pre=new int[n];
        int []suff=new int[n];

        int gc=arr[0];
        for(int i=0;i<n;i++){
            long sum=0l;
            int a=arr[i];
            sum=a+gc;
            gc=Math.max(a,gc);
            a=(int)(sum-gc);

            gc=gcd(gc,a);
            pre[i]=gc;
        }

        gc=arr[n-1];
        for(int i=n-1;i>=0;i--){
            long sum=0l;
            int a=arr[i];
            sum=a+gc;
            gc=Math.max(a,gc);
            a=(int)(sum-gc);

            gc=gcd(gc,a);
            suff[i]=gc;
        }

        int ans=0;
        for(int i=0;i<n;i++){
            int a=0,b=0;
            if(i>0){
                a=pre[i-1];
            }
            if(i<n-1){
                b=suff[i+1];
            }
            if(a!=0 && b!=0){
                long sum=0l;
            sum=a+b;
            a=Math.max(a,b);
            b=(int)(sum-a);

                ans=Math.max(ans,gcd(a,b));
            }
            else{
                if(a==0)
                ans=Math.max(ans,b);
                else
                ans=Math.max(ans,a);
            }
        }
        return ans;
    }
    public int gcd(int a,int b){
        if(b==0)
        return a;

        return gcd(b,a%b);
    }
}
