public class Solution {
    public String solve(String str) {
        int n=str.length();
        Stack<Character>st=new Stack<>();
        
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            boolean res=false;
            if(st.size()>0 && st.peek()==ch ){
                st.pop();
                res=true;
            }
            if(!res){
                st.push(ch);
            }
        }
        StringBuilder ans=new StringBuilder();
        while(st.size()>0){
            ans=ans.append(st.pop());
        }
        ans.reverse();
        String aa=ans.toString();
        // n=aa.length();
        // String aaa="";
        // for(int i=n-1;i>=0;i--){
        //     aaa+=aa.charAt(i);
        // }
        return aa;
    }
}
