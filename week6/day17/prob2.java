import java.util.*;

public class Solution {
	public void solveSudoku(char[][] arr) {
        int [][]original=new int[9][9];
        int n=9;

        int[]row=new int[n];
        int []col=new int[n];
        int[]box=new int[n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int b=(i/3)*3 + j/3;
                if(arr[i][j]!='.'){
                original[i][j]=(int)(arr[i][j]-'0');
                row[i]=row[i]|(1<<(original[i][j]-1));
                col[j]=col[j]|(1<<(original[i][j]-1));
                box[b]=box[b]|(1<<(original[i][j]-1));
                }
                // System.out.print(original[i][j]);
            }
        }
        solve(0,arr,original,row,col,box);


        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         System.out.print(arr[i][j]);
        //     }
        // }
        
        
	}

    public boolean solve(int idx,char[][]original,int[][]arr,int[]row,int[]col,int[]box){
        if(idx==81){    //ans
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    original[i][j]=(char)(arr[i][j]+48);
                    // System.out.print(original[i][j]);
                }
            }
            return true;
        }
        
        boolean res=false;
        int r=idx/9;
        int c=idx%9;
        int b=(r/3)*3 + c/3;
        for(int i=1;i<=9;i++){
            if(original[r][c]!='.')
            res=res||solve(idx+1,original,arr,row,col,box);
            else if((original[r][c]=='.') && ((row[r]&(1<<(i-1)))==0) && ((col[c]&(1<<(i-1)))==0) && ((box[b]&(1<<(i-1)))==0)){
                row[r]=row[r]|(1<<(i-1));
                col[c]=col[c]|(1<<(i-1));
                box[b]=box[b]|(1<<(i-1));
                arr[r][c]=i;
                res=res||solve(idx+1,original,arr,row,col,box);
               
                if(original[r][c]=='.'){
                row[r]=row[r]&(~(1<<(i-1)));
                col[c]=col[c]&(~(1<<(i-1)));
                box[b]=box[b]&(~(1<<(i-1)));
                arr[r][c]=0;
                }
            }
            if(original[r][c]!='.')
            return false;
        }

        return false;

    }
}
