public class Solution {
    public int solve(int[] A, int[] B) {
        int n=A.length;
        solve(A,B,0,0,0,0);
    }
    public int sol(int[]height,int []cost,int idx,int qpsf,int ans,int p){
        if(qpsf==3){
            return ans;
        }

        if(idx==height.length){
            return Integer.MAX_VALUE;
        }

        int a=Integer.MAX_VALUE;
        int b=Integer.MAX_VALUE;
        if(height[idx]>p)
        a=sol(height,cost,idx+1,qpsf+1,ans+cost[idx],height[idx]);
        b=sol(height,cost,idx+1,qpsf,ans,p);

        return Math.min(a,b);
    }   
}
