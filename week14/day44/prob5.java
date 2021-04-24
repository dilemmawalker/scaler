public class Solution {
    public int solve(int n, int b, ArrayList<Integer> arr) {
        Stack<Integer>st=new Stack<>();
        st.push(b);
        for(int i=0;i<n;i++){
            int val=arr.get(i);
            if(val!=0)
            st.push(val);
            else
            st.pop();
        }
        return st.peek();
    }
}
