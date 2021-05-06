public class Solution {
    public int braces(String str) {
        int n=str.length();
        Stack<Character>st=new Stack<>();
        for(int i=0;i<n;i++){
            char  ch=str.charAt(i);
            if(ch!=')'){
                int val=ch-'a';
                if(!(val>=0 && val<=25) )
                st.push(ch);
            }
            else{
                if(st.size()>0 && st.peek()=='('){
                    return 1;
                }
                while(st.size()>0 ){
                    char c=st.pop();
                    if(c=='('){
                        break;
                    }
                }
            }
        }
        return 0;
    }
}
