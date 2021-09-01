public class Solution {             //Single Element in a Sorted Array
    public int solve(int[] arr) {
        int n=arr.length;
        int a=bs(arr,0,n-1);
        return arr[a];

    }
    public int bs(int []arr,int lo,int hi){
        if(lo>=hi)
        return lo;

        int mid=(lo+hi)/2;
        if((mid==0 && arr[mid+1]!=arr[mid])  ||(arr[mid-1]!=arr[mid] && arr[mid]!=arr[mid+1]))
        
        //  if((mid==0 && arr[mid+1]!=arr[mid]) || (mid==arr.length-1 && arr[mid]!=arr[mid-1]) ||(arr[mid-1]!=arr[mid] && arr[mid]!=arr[mid+1]))
        //this case is not required as always 1st index is the one traversed & reached.
        return mid;
        
        if(mid!=0 && arr[mid]==arr[mid-1])
        mid--;

        if(mid%2==0){
            return bs(arr,mid+2,hi);
        }
        else{
            return bs(arr,lo,mid-2);
        }
    }
}
