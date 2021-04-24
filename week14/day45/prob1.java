public class Solution {
    public int evalRPN(ArrayList<String> arr) {
        int n=arr.size();
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            String str=arr.get(i);
            
            char ch=str.charAt(0);
            if(str.length()==1 && (ch=='*'||ch=='+'||ch=='/'||ch=='-')){
            
                int a=st.pop();
                int b=st.pop();
                if(ch=='-'){
                    st.push(b-a);
                }
                if(ch=='+'){
                    st.push(b+a);
                }
                if(ch=='*'){
                    st.push(b*a);
                }
                if(ch=='/'){
                    st.push(b/a);
                }
                continue;
            }
            else{
                    int no=0;
                    int a=1;
                    for(int j=0;j<str.length();j++){
                        char c=str.charAt(j);
                        if(j==0 && c=='-'){
                            a=-1;
                        }
                        else{
                            no=no*10 + (c-'0');
                        }
                    }
                    no*=a;
                    st.push(no);
            }
        }
        return st.pop();
    }
}
