public class Solution {
    public void solve(int[][] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        int i=0;int j=n-1;
        while(i<j){
            for(int k=0;k<n;k++){
                int temp=arr[k][i];
                arr[k][i]=arr[k][j];
                arr[k][j]=temp;
            }
            i++;
            j--;
        }
    }
}
