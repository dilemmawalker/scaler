public class Solution {
	public String[][] solveNQueens(int a) {
        int[][]arr=new int[a][a];

		ArrayList<ArrayList<String>>ans=new ArrayList<>();
		int overall=0;
		int n=ans.size();
		
		solve(arr,0,0,0,0,0,ans,overall);
		String[][]fans=new int[n][a];
		for(int i=0;i<n;i++){
			for(int j=0;j<a;j++){
				String str=ans.get(i).get(j);
				fans[i][j]=str;
			}
		}

		return fans;
	}
	public static vid solve(int[][]arr,int idx,int row,int col,int diag, int adiag,
	ArrayList<ArrayList<String>>ans,int overall){
		int n=arr.length;
		if(idx==n){
			//put in ans
			int size=ans.size();
			ans(size())=new ArrayList<String>();
			
			for(int i=0;i<n;i++){
				ArrayList<String>temp=new ArrayList<>();
				for(int j=0;j<n;j++){
					int a=arr[i][j];
					if(a==1)
					temp.add("Q");
					else
					temp.add(".");
				}
				ans(size).add(temp);
			}
		}

		for(int i=0;i<n;i++){
			int bool=check(arr,idx,i);
			if(bool){
				row=row | (1<<idx);
				col=col | (1<<i);
				diag=diag | (1<<(idx-i+n));
				adiag=adiag | (1<<(idx+i));
				arr[idx][i]=1;

				solve(arr,idx+1,row,col,diag,adiag,ans,overall);

				arr[idx][i]=0;
				row=row & (~(1<<idx));
				col=col & (~(1<<i));
				diag=diag & (~(1<<(idx-i+n)));
				adiag=adiag & (~(1<<(idx+1)));
			}
		}
	}
	public boolean check(int[][]arr,int idx,int i,int row,int col,int diag,int adiag){
		int n=arr.length;

		if((row & (1<<idx))==0 && (col & (1<<i))==0 && (diag & (1<<(idx-i+n)))==0 && 
		(adiag & (1<<(idx+i))==0)){
			return true;

		}
		else
		return false;
	}
}
