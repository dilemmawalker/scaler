public class Solution {                 //Maximum Number
    public int solve(int[] arr, int s) {
        int n=arr.length;
         bs(arr,1,n,s);
        return val;
    }
    public int val=0;
        public void bs(int[]arr,int lo,int hi,int s){
            int mid=(lo+hi)/2;
            boolean a=check(arr,mid,s);
            if(a){
            val=mid;
            }

            if(lo>=hi)
            return ;

            if(a){
                 bs(arr,mid+1,hi,s);
            }
            else{
                 bs(arr,lo,mid-1,s);
            }
    }
    public boolean check(int[]arr,int size,int s){
        long sum=s*1l;
        long c=0l,max=0l;
        for(int i=0;i<size-1;i++){
            int a=arr[i];
            c+=a;
        }
        int n=arr.length;
        for(int i=size-1;i<n;i++){
            int a=arr[i];
            c+=a;
            if(i!=size-1)
            c-=arr[i-size];
            max=Math.max(max,c);
        }
        if(max<=sum)
        return true;
        else
        return false;
    }
}
