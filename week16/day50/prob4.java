public class Solution {
    public int[] solve(int[] arr, int b) {
        int n=arr.length;
        Stack<Integer>st=new Stack<>();
        int i=0;
        for( i=0;i<b;i++){
            st.push(arr[i]);
        }
        int[]ar=new int[n];
        int idx=0;
        while(st.size()>0){
            ar[idx++]=st.pop();
        }
        for(i=idx;i<n;i++){
            ar[i]=arr[i];
        }
        return ar;
    }
}
