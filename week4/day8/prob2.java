public class Solution {
    public int[] solve(int[] arr) {
        int n=arr.length;
        int[]ans=new int[n];
        for(int i=0;i<n;i++){
            int a=arr[i];
            int no=(int)Math.sqrt(a);
            int c=0;
            for(int j=1;j<=no;j++){
                if(a%j==0 && j*j!=a)
                c+=2;
                else if(a%j==0 && j*j==a)
                c++;
            }

            ans[i]=c;
        }
        return ans;
    }
}
