public class Solution {
    public int[] nextGreater(int[] arr) {
        int n=arr.length;
        Stack<Integer>st=new Stack<>();
        int[]ans=new int[n];
        for(int i=0;i<n;i++){
            int a=arr[i];
            while(st.size()>0 && arr[st.peek()]<a){
                int b=st.pop();
                ans[b]=a;
            }
            st.push(i);
        }
        while(st.size()>0){
            int a=st.pop();
            ans[a]=-1;
        }
        return ans;
    }
}
