public class Solution {
    public int solve(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
        int max=0;
        int maxpos=-1;

        for(int i=0;i<n;i++){
            int c=0;
            for(int j=m-1;j>=0 && arr[i][j]==1;j--){
                c++;
            }
            if(c>max){
                max=c;
                maxpos=i;
            }
        }

        return maxpos;
    }
}
