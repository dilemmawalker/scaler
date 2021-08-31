public class prob1 {                            //Sorted Insert Position
    public int searchInsert(int[] arr, int b) {
        int n=arr.length;
        if(arr[n-1]<b)
        return n;
        if(arr[0]>=b)
        return 0;
        return bs(arr,0,n-1,b);
        
    }
    public int  bs(int[]arr,int lo,int hi,int b){
        if(lo==hi)
        return lo;

        int mid=(lo+hi)/2;
        if(arr[mid]==b)
        return mid;

        if(arr[mid]<b){
            return bs(arr,mid+1,hi,b);
        }
        else{
            return bs(arr,lo,mid,b);
        }
    }
}
