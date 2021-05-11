public class Solution {
    public String solve(String str) {
        int n=str.length();
        Stack<Character>st=new Stack<>();
        int i=n-1;
        // while(i>0 && str.charAt(i)==' '){
        //     i--;
        // }
        StringBuilder sb=new StringBuilder();
        for( ;i>=0;i--){
            char ch=str.charAt(i);
            if(ch!=' '){
                st.push(ch);
            }
            else{
                boolean flag=false;
                while(st.size()>0){
                    char c=st.pop();
                    sb.append(c);
                    flag=true;
                }
                if(flag)
                sb.append(' ');
            }
        }
        if(sb.length()!=0 && st.size()==0)
        sb.deleteCharAt(sb.length()-1);
        
        while(st.size()>0){
            sb.append(st.pop());
        }
        return sb.toString();
    }
}
