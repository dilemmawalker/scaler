public class Solution {
    public String[] solve(String str) {
        int n=str.length();
        Stack<Character>st=new Stack<>();
        HashSet<String>map=new HashSet<>();

        int no=number(str);

        sol(str,0,n,"",st,0,no,map);
        n=map.size();
        String[]ans=new String[n];

        int idx=0;
        for(String s: map){
            ans[idx++]=s;
        }
        return ans;
    }
    public void sol(String str,int idx,int n,String ans,Stack<Character>st,int c,int no,HashSet<String>map){
        if(idx==n){
            if(c==no && st.size()==0){
                map.add(ans);
            }
            return;
        }
        if(c>no)
        return;

        char ch=str.charAt(idx);
        if(ch!=')' && ch!='('){
            sol(str,idx+1,n,ans+ch,st,c,no,map);
        }

        else{
            if(ch=='('){
                st.push('(');
                sol(str,idx+1,n,ans+"(",st,c,no,map);
                st.pop();
            }
            else{
                if(st.size()!=0){
                    st.pop();
                    sol(str,idx+1,n,ans+")",st,c,no,map);
                    st.push('(');
                }
            }

            sol(str,idx+1,n,ans,st,c+1,no,map);
        }
    }
    public int number(String str){
        int n=str.length();
        Stack<Integer>st=new Stack<>();
        int c=0;
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(ch=='(' || ch==')'){
                if(ch=='('){
                    st.push(1);
                }
                else{
                    if(st.size()!=0)
                    st.pop();
                    else
                    c++;
                }
            }
        }
        return c+st.size();
    }
}
