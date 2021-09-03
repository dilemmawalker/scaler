public class Solution {                         //Search in Bitonic Array!
    public int solve(int[] arr, int b) {
        int n=arr.length;
        return bs(arr,0,n-1,b);
    }
    public int bs(int[]arr,int lo,int hi,int b){
        int mid=(lo+hi)/2;
        if(arr[mid]==b)
        return mid;

        if(lo==hi)
        return -1;

        if(arr[lo]<=arr[mid]){
            if(arr[lo]<=b && b<=arr[mid])
            return bs(arr,lo,mid-1,b);
            else
            return bs(arr,mid+1,hi,b);
        }
        else{
            if(arr[mid]>=b && b>=arr[hi])
            return bs(arr,mid+1,hi,b);
            else
            return bs(arr,lo,mid-1,b);
        }
    }
}
