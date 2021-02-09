public class Solution {
    public int solve(int[][] arr, int ele) {
        int n=arr.length;
        int m=arr[0].length;

        int i=0;int j=m-1;
        while(i<n && j<m){
            int a=arr[i][j];

            if(a==ele){
                return (((i+1)*1009) + j+1);
            }
            if(a<ele){
                i++;
            }
            else{
                j--;
            }
        }
        return -1;
    }
}   
