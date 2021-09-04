public class Solution {
    public int solve(int[] arr, int no) {
        int n=arr.length;
        Arrays.sort(arr);
         bs(arr,1,arr[n-1]-arr[0],no);
         return ans;
    }
    public int ans=0;
    public void bs(int[]arr,int lo,int hi,int no){
        int mid=(lo+hi)/2;
        int num=find(arr,mid);      //no of cows required.
        if(num>=no)
        ans=mid;

        if(lo>=hi)
        return;

        if(num<no)
         bs(arr,lo,mid-1,no);
        else
         bs(arr,mid+1,hi,no);

    }
    public int find(int[]arr,int dis){
         int d=0;
         int c=1;
         int n=arr.length;
         int p=arr[0];
         for(int i=1;i<n;i++){
            int a=arr[i];
            d=a;
            if((d-p)>=dis){
                c++;
                p=a;
                d=0;
            }
         }
         return c;
    }

}
