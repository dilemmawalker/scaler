    public class Solution {
        public int solve(String str1, String str2) {
            int n=str1.length();
            boolean []global=new boolean[26];
            boolean []local=new boolean[26];
            //      true is +        false is -

            Stack<Integer>st=new Stack<>();
            st.push(1);
            for(int i=0;i<26;i++){
               local[i]=true;
               global[i]=true;
            }
            for(int i=0;i<n;i++){
                char ch=str1.charAt(i);
                int val=ch-'a';
                int var=+1;
                if(val>=0 && val<=25){
                    if(i-1>=0 && str1.charAt(i-1)=='-' )
                    local[val]=false;
                    if(st.peek()==-1)
                    global[val]=false;
                }
                if(ch=='('){
                    int pr=1;
                    if(i-1>=0 && str1.charAt(i-1)=='-' )
                    pr=-1;

                    int curr=pr*st.peek();
                    st.push(curr);
                }
                else if(ch==')'){
                    st.pop();
                }
            }

            boolean []global2=new boolean[26];
            boolean []local2=new boolean[26];
            st=new Stack<>();
            for(int i=0;i<26;i++){
                local2[i]=true;
                global2[i]=true;
             }
            st.push(1);
            n=str2.length();
            for(int i=0;i<n;i++){
                char ch=str2.charAt(i);
                int val=ch-'a';
                int var=+1;
                if(val>=0 && val<=25){
                    if(i-1>=0 && str2.charAt(i-1)=='-' )
                    local2[val]=false;
                    if(st.peek()==-1)
                    global2[val]=false;
                }
                if(ch=='('){
                    int pr=1;
                    if(i-1>=0 && str2.charAt(i-1)=='-' )
                    pr=-1;

                    int curr=pr*st.peek();
                    st.push(curr);
                }
                else if(ch==')'){
                    st.pop();
                }
            }
            for(int i=0;i<26;i++){

                int a=(global[i]==true?1:-1)* (local[i]==true?1:-1);
                int b=(global2[i]==true?1:-1)* (local2[i]==true?1:-1);

                if(a!=b){
                    return 0;
                }
            }
            return 1;
        }
    }
