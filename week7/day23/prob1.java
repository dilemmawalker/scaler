public class Solution {                         //Maximum Unsorted Subarray
    public int[] subUnsort(int[] arr) {         //O(N) space, O(N) time
        int n=arr.length;
        int[]copy=new int[n];
        for(int i=0;i<n;i++){
            copy[i]=arr[i];
        }
        Arrays.sort(copy);
        
        int p1=-1,p2=n;
        for(int i=0;i<n;i++){
            p1++;
            if(arr[i]!=copy[i])
            break;
        }
        for(int i=n-1;i>=0;i--){
            p2--;
            if(arr[i]!=copy[i])
            break;
        }
        int val=p2-p1+1;
        if(val<=0)
        return new int []{-1};
        else{
            return new int[]{p1,p2};
        }
    }
}
