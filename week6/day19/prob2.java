public class Solution {
    public String[] generateParenthesis(int a) {
        ArrayList<String>arr=new ArrayList<>();
        Stack<Character>st=new Stack<>();
         sol(a,0,a*2,"",arr,st);
       
         int n=arr.size();
         String[]anss=new String[n];
         for(int i=0;i<n;i++){
             anss[i]=arr.get(i);
         }
         return anss;
    }
    public void sol(int a,int idx,int n,String ans,ArrayList<String>arr,Stack<Character>st){
        if(idx==n){
            if(st.size()==0 && a==0){
                
            arr.add(ans);
            }
            return;
        }

        if(a>0){
            st.push('(');
        sol(a--,idx+1,n,ans+"(",arr,st);
        st.pop();
        }

        if(st.size()!=0){
            st.pop();
        sol(a,idx+1,n,ans+")",arr,st);
        st.push('(');
        }

        return;
    }
}
