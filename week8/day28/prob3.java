public class Solution {             //Rotated Sorted Array Search
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int search(final int[] arr, int b) {
        int n=arr.length;
        if(n==0)
        return -1;
       
        return search(arr,0,n-1,b);
    }
    public int search(int[]arr,int lo,int hi,int b){
        int n=arr.length;
        int mid=(lo+hi)/2;
        if(arr[mid]==b)
        return mid;

        if(lo==hi)
        return -1;

        if(arr[lo]<=arr[mid] ){
            if(b>=arr[lo] && b<=arr[mid])
            return search(arr,lo,mid-1,b);
            else
            return search(arr,mid+1,hi,b);
        }
        else{
            if(b>=arr[mid] && b<=arr[hi])
            return search(arr,mid+1,hi,b);
            else
            return search(arr,lo,mid-1,b);
        }
    }
}
