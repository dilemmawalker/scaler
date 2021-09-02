public class Solution {             //Find a peak element
    public int solve(int[] arr) {
        int n=arr.length;
        int val=0;
        if(n==1)
        return arr[0];

        int a= bs(arr,0,n-1);
        return arr[a];
    }
    public int bs(int[]arr,int lo,int hi){
        if(lo==hi)
        return lo;

        int mid=(lo+hi)/2;
        if(mid==0 ){
            if(arr[mid]>=arr[mid+1])
        return mid;
        }
        else if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
        return mid;

        if(mid!=0 && (arr[mid-1]>=arr[mid+1])){
           return bs(arr,lo,mid-1);
        }
        else{
          return  bs(arr,mid+1,hi);
        }
    }
}
