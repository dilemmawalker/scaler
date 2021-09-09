public class Solution {                             //Matrix Median
    public int findMedian(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
        int lo=Integer.MAX_VALUE,hi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            lo=Math.min(lo,arr[i][0]);
            hi=Math.max(hi,arr[i][m-1]);
        }
        bs(arr,lo,hi,(1+(n*m)/2));//might/might not be present in array.
        //now find smalles ele definately present in array.
        // val=bs(arr,arr[0],ans);
        return ans;
    }
    public int ans=0;
    public int bs(int[][]arr,int lo,int hi,int no){
        if(lo>hi)
        return 0;

        int mid=(lo+hi)/2;
        int val=number(arr,mid);

        // if(val==no){
        //     ans=mid;
        //     return bs(arr,lo,mid-1,no);
        // }
        if(val>=no){
            ans=mid;
            return bs(arr,lo,mid-1,no);
        }
        else{
            return bs(arr,mid+1,hi,no);
        }

    }
    public int number(int[][]arr,int val){
        int n=arr.length;
        int m=arr[0].length;

        int c=0;
        for(int i=0;i<n;i++){
            int lo=0,hi=m-1;
            int ans=0;
            while(lo<=hi){
                int mid=(lo+hi)/2;

                int v=arr[i][mid];
                if(v<=val){
                lo=mid+1;
                ans=mid;
                }
                else
                hi=mid-1;
            }
            if(hi==-1)
            c+=0;
            else if(lo>=m)
            c+=m;
            else
            c+=ans+1;
        }
        return c;
    }
}
