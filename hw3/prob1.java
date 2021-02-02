public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int trap(final int[] A) {
        int n=A.length;
        int[]arr1=new int[n];
        int[]arr2=new int[n];

        int c=0;
        int c1=0;
        for(int i=0;i<n;i++){
            c=Math.max(c,A[i]);
            c1=Math.max(c1,A[n-i-1]);
            arr1[i]=c;
            arr2[n-i-1]=c1;
        }
        c=0;
        for(int i=1;i<n-1;i++){
            if(A[i]<Math.min(arr1[i-1],arr2[i+1]))
            c+=Math.min(arr1[i-1],arr2[i+1])-A[i];
        }
        return c;
    }
}
