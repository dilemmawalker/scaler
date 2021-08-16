public class Solution {//sixlets
    public int solve(int[]arr, int b) {
        int n=arr.length;
        return sol(arr,b,n,0,0,0);
    }
    public int sol(int[]arr,int b,int n,int idx,int ans,int no){
        if(idx==n){
            //check
            if(no==bn && sum<=1000){
                return 1;
            }
            else
            return 0;
        }

        int a=0,c=0;
        if(no+1<=b)
        a=sol(arr,b,n,idx+1,ans+arr[idx],no+1);

        c=sol(arr,b,n,idx+1,ans,no);

        return a+c;
    }
}
