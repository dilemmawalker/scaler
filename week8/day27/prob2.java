public class Solution {             //Search for a Range
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] searchRange(final int[] arr, int b) {
        int n=arr.length;
        
        int a=bs1(arr,0,n-1,b,-1);
        int c=bs2(arr,0,n-1,b,-1);
        return new int[]{a,c};
    }
    public int bs1(int[]arr,int lo,int hi,int b,int ans){
        int mid=(lo+hi)/2;
        if(arr[mid]==b && (mid==0 || arr[mid-1]!=arr[mid]))
        return mid;

        if(lo==hi)
        return -1;

        if(b<=arr[mid])
        return bs1(arr,lo,mid-1,b,ans);
        else
        return bs1(arr,mid+1,hi,b,ans);
    }
    public int bs2(int []arr,int lo,int hi,int b,int ans){
         int mid=(lo+hi)/2;
        if(arr[mid]==b && (mid==(arr.length-1) || arr[mid+1]!=arr[mid]))
        return mid;

        if(lo==hi)
        return -1;

        if(b<arr[mid])
        return bs2(arr,lo,mid-1,b,ans);
        else
        return bs2(arr,mid+1,hi,b,ans);
    }
}
