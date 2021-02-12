public class Solution {
    public int[][] generateMatrix(int n) {
        
        int ele=1;
        int[][]arr=new int[n][n];

        int c=0,r=0;
        while(c<=(n-1)/2 && r<=(n-1)/2){
            for(int i=c;i<n-c;i++){
                arr[r][i]=ele++;
            }
            for(int i=r+1;i<n-r;i++){
                arr[i][n-c-1]=ele++;
            }
            for(int i=n-c-2;i>=c;i--){
                arr[n-r-1][i]=ele++;
            }
            for(int i=n-r-2;i>=r+1;i--){
                arr[i][c]=ele++;
            }
            r++;c++;
        }
        return arr;
    }
}
