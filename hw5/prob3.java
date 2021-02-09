public class Solution {
    public int[] solve(int[][] A, int[] B, int[] C, int[] D, int[] E) {
        int n=A.length;
        int m=A[0].length;

        long[][]arr=new long[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=0l;
            }
        }
        for(int i=0;i<n;i++){
            long c=0l;
            for(int j=0;j<m;j++){
                int a=A[i][j];
                c+=a;
                // arr[i][j]=0l;
                arr[i][j]=c;
            }
        }
        for(int i=0;i<m;i++){
            long c=0l;
            for(int j=0;j<n;j++){
                long a=arr[j][i];
                c+=a;
                // arr[j][i]=0l;
                arr[j][i]=c;
            }
        }

        int mod=(int)Math.pow(10,9)+7;
        n=B.length;
        int[]ans=new int[n];
        for(int i=0;i<n;i++){
            int a=B[i]-1;
            int b=C[i]-1;
            int c=D[i]-1;
            int d=E[i]-1;

            long sum=0l;
            sum=arr[c][d];
            if(b-1>=0)
            sum=sum-arr[c][b-1];
            if(a-1>=0)
            sum=sum-arr[a-1][d];
            if(a-1>=0 && b-1>=0)
            sum=sum+arr[a-1][b-1];
            while(sum<0){
                sum+=mod;
            }
            
            ans[i]=(int)(sum%mod);
        }
        return ans;
    }
}
