public class Solution {
    public int solve(String str) {
        int n=str.length();
        Stack<Character>st=new Stack<>();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else{
                if(st.size()!=0)
                if((ch==')' && st.peek()=='(') || (ch==']' && st.peek()=='[') || (ch=='}' && st.peek()=='{')){
                    st.pop();
                }else return 0;
                 else return 0;
            }
        }
        if(st.size()!=0)
        return 0;
        return 1;
    }
}
