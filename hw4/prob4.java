public class Solution {
    public int[] nextPermutation(int[] arr) {
        int n=arr.length;
        int idx=n-1;
        int i=n-2;
        for( i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                break;
            }
        }
        idx=i;

        int c=0;
        if(idx>=0)
        {
            for(i=n-1;i>idx;i--){
            if(arr[i]>arr[idx])
            break;
        }
         c=i;

        swap(arr,idx,c);
        }

        idx++;
        c=n-1;
        while(idx<c){
            swap(arr,idx,c);
            idx++;
            c--;
        }
        return arr;
    }
    public void swap(int[]arr,int idx,int i){
        int temp=arr[idx];
        arr[idx]=arr[i];
        arr[i]=temp;
    }
}
