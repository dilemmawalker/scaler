public class Solution {
    public int solve(int[][] arr) {
        int n=arr.length;
        int sr=0,sc=0,er=0,ec=0;
        int m=arr[0].length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int a=arr[i][j];
                if(a==1){
                    sr=i;
                    sc=j;
                }
                if(a==2){
                    er=i;
                    ec=j;
                }
                if(a==0)
                count++;
            }
        }
        int a=sol(arr,n,sr,sc,er,ec,count);
        return a;
    }
    public int sol(int[][]arr,int n,int sr,int sc,int er,int ec,int count){
        if(sr==er && sc==ec && count==0){
            return 1;
        }
        
        int m=arr[0].length;
        if(sr==n || sc==m || sr<0 || sc<0 || arr[sr][sc]==-1 || arr[sr][sc]==5){
            return 0;
        }

        int a=0,b=0,c=0,d=0;
        int temp=arr[sr][sc];
        arr[sr][sc]=5;
        a=sol(arr,n,sr+1,sc,er,ec,count-1);
        b=sol(arr,n,sr,sc+1,er,ec,count-1);
        c=sol(arr,n,sr-1,sc,er,ec,count-1);
        d=sol(arr,n,sr,sc-1,er,ec,count-1);
        //4 calls
        // if(temp==-1)
        // arr[sr][sc]=-1;
        // else
        arr[sr][sc]=0;

        int sum=a+b+c+d;
        return sum;
    }
}
