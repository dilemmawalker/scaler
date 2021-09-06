public class Solution {                     //Matrix Search
    public int searchMatrix(int[][] arr, int b) {//we can also do BS on row & col.
                                                //hence TC: O(n+m)
        int n=arr.length;
        int m=arr[0].length;

        int p1=0,p2=m-1;
        int idx=0;
        while(p1<n && b>arr[p1][m-1]){
            p1++;
        }
        while(p1<n && p2>=0 && b<arr[p1][p2]){
            p2--;   
        }
        if(p1<n && p2>=0 && arr[p1][p2]==b)
        return 1;
        else
        return 0;
    }
}
