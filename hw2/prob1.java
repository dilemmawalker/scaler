public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(final int[][] A) {
        int n=A.length;
        int c=0;
        for(int i=0;i<n;i++){
            int a=A[i][i];
            c+=a;
        }
        System.out.println(c);
    }
}
