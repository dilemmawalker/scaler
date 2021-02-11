public class Solution {
    public int solve(int[] A, int[] B, int[] C, int[] D) {
        int n=A.length;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int k=0;k<n;k++){
            int a=A[k];
            int b=B[k];
            int c=C[k];
            int d=D[k];
            int l=k+1;

            int[]arr={a,b,c,d,l};

            for(int i=5;i>=0;i--){
                int sum=0;
                for(int j=i;j<5;j++){
                    sum=sum-arr[j];
                }
                for(int j=0;j<i;j++){
                    sum+=arr[j];
                }
                min=Math.min(min,sum);
                max=Math.max(max,sum);
            }
        }
        return max-min;
    }
}
