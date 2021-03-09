public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int singleNumber(final int[] A) {
        int n=A.length;
        int ans=0;
        for(int i=0;i<n;i++){
            ans^=A[i];
        }
        return ans;
    }
}
