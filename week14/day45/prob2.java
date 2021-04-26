public class Solution {
    public String solve(String str) {
        int n=str.length();
        StringBuilder post=new StringBuilder();
        Stack<Character>st=new Stack<>();
        HashMap<Character,Integer>map=new HashMap<>();
        map.put('+',1);
        map.put('-',1);
        map.put('*',2);
        map.put('/',2);
        map.put('^',3);
        map.put('(',0);
        map.put(')',0);

        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(map.containsKey(ch)){
                if(st.size()==0){
                    st.push(ch);
                }
                else if(ch==')'){
                    while(st.size()!=0){
                        char c=st.pop();
                        if(c=='(')
                        break;

                        post.append(c);
                    }
                }
                else{
                    if(ch!='(')
                    while(st.size()!=0){
                        char c=st.peek();
                        int val=map.get(c);
                        int val2=map.get(ch);
                        if(val<val2){
                            break;
                        }
                        c=st.pop();
                        post.append(c);
                    }
                    st.push(ch);
                }
            }
            else{
                post.append(ch);
            }
        }
        while(st.size()!=0){
            post.append(st.pop());
        }
        return post.toString();
    }
}
