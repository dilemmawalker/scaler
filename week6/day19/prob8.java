public class Solution {//vertical & horizontal sums
    public int solve(int a, int[][] arr, int sum) {
        int n=arr.length;
        int m=arr[0].length;
        int[]row=new int[n];
        int[]col=new int[m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int aa=arr[i][j];
                row[i]+=aa;
                col[j]+=aa;
            }
        }

        boolean res=sol(arr,a,0,sum,row,col);
        if(res)
        return 1;
        else
        return 0;
    }

    public boolean sol(int[][]arr,int a,int idx,int sum,int []row,int []col){
        int n=arr.length;
        int m=arr[0].length;
        if(a<0)
        return false;
        if(idx==(n*m)){
            //check;
            boolean aa=check(arr,row,col,sum);
            return aa;
        }
        
        boolean res=false;
        int r=idx/m;
        int c=idx%m;
        if(arr[r][c]>0){
        row[r]-=2*arr[r][c];
        col[c]-=2*arr[r][c];
        arr[r][c]=arr[r][c]*(-1);
        res=res||sol(arr,a-1,idx+1,sum,row,col);
        arr[r][c]=arr[r][c]*(-1);
        row[r]+=2*arr[r][c];
        col[c]+=2*arr[r][c];
        }

        res=res||sol(arr,a,idx+1,sum,row,col);

        return res;
    }

    public boolean check(int[][]arr,int[]row,int[]col,int sum){
       
       int n=arr.length;
       int m=arr[0].length;
        int s=0;
       for(int i=0;i<n;i++){
           s=0;
           for(int j=0;j<m;j++){
               int a=arr[i][j];
                 s=Math.max(s+a,a);
                if(s>sum)
                return false;              
           }
       }
       for(int j=0;j<m;j++){
           s=0;
           for(int i=0;i<n;i++){
               int a=arr[i][j];
               s=Math.max(s+a,a);
               if(s>sum)
                return false;
           }
       }
       
       return true;
    }
}
