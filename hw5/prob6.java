public class Solution {
    public int solve(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
        long sum=0l;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int a=arr[i][j];
                sum+=((i+1)*(j+1) * (n-i)*(m-j))*a;
            }
        }
        return (int)sum;
    }
}
