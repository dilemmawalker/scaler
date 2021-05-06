public class Solution {
    public int[] prevSmaller(int[] arr) {
        int n=arr.length;
        Stack<Integer>st=new Stack<>();
        int[]ans=new int[n];
        for(int i=n-1;i>=0;i--){
            int a=arr[i];
            while(st.size()!=0 && arr[st.peek()]>a){
                int idx=st.pop();
                ans[idx]=a;
            }
            st.push(i);
        }
        while(st.size()!=0){
            int a=st.pop();
            ans[a]=-1;
        }
        return ans;
    }
}
